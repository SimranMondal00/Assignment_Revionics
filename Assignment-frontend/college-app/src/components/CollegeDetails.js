import React, { useEffect, useState } from 'react';
import { getCollegeDetails } from '../services/collegeService';
import './CollegeDetails.css';

const CollegeDetails = ({ selectedCollege }) => {
    const [collegeDetails, setCollegeDetails] = useState(null);

    useEffect(() => {
        if (selectedCollege) {
            getCollegeDetails(selectedCollege)
                .then(response => {
                    setCollegeDetails(response.data);
                })
                .catch(error => {
                    console.error("Error fetching college details", error);
                });
        }
    }, [selectedCollege]);

    if (!collegeDetails) {
        return <div>Select a college to view details</div>;
    }

    return (
        <div className="college-details">
            <h3>{collegeDetails.collegeName}</h3>
            <p><strong>Course:</strong> {collegeDetails.courseName}</p>
            <p><strong>Duration:</strong> {collegeDetails.durationOfCourse}</p>
            <p><strong>Accommodation:</strong> {collegeDetails.accommodationType} (₹{collegeDetails.accommodationFee})</p>
            <h4>Course Fees</h4>
            <ul>
                {collegeDetails.courseFees.map(fee => (
                    <li key={fee.id}>₹{fee.courseFee}</li>
                ))}
            </ul>
        </div>
    );
};

export default CollegeDetails;
