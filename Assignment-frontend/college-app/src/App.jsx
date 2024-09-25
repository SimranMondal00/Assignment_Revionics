import React, { useState } from 'react';
import CollegeList from './components/CollegeList';
import CollegeDetails from './components/CollegeDetails';
import './App.css';

function App() {
    const [selectedCollege, setSelectedCollege] = useState(null);

    const handleSelectCollege = (collegeName) => {
        setSelectedCollege(collegeName);
    };

    return (
        <div className="App">
            <h1>College and Course Information</h1>
            <div className="content">
                <CollegeList onSelectCollege={handleSelectCollege} />
                <CollegeDetails selectedCollege={selectedCollege} />
            </div>
        </div>
    );
}

export default App;
