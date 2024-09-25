import React, { useEffect, useState } from 'react';
import { getAllColleges } from '../services/collegeService';
import './CollegeList.css';

const CollegeList = ({ onSelectCollege }) => {
    const [colleges, setColleges] = useState([]);

    useEffect(() => {
        
        getAllColleges()
            .then(response => {
                setColleges(response.data);
            })
            .catch(error => {
                console.error("There was an error fetching the colleges!", error);
            });
    }, []);

    return (
        <div className="college-list">
            <h2>College List</h2>
            <ul>
                {colleges.map(college => (
                    <li key={college.id} onClick={() => onSelectCollege(college.collegeName)}>
                        {college.collegeName}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default CollegeList;