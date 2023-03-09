


import './DonorDashboard.css';

import React from 'react';
import Button from 'react-bootstrap/Button';
import { Link } from "react-router-dom";
import DonorSideMenu from "./DonorSideMenu";
import './DonorProfile.css';
const DonorProfile = () => {
  return (
    <div>
      <div className="container">
        <div>
          <DonorSideMenu></DonorSideMenu>
        </div>
        <div className="content">
            <div className="profile-container">
                            {/* <div className="profile-picture">
                                <img src="https://www.example.com/profile.jpg" alt="Profile" />
                            </div> */}
            <div className="profile-details">
                <h2>John Doe</h2>
                <p>Phone No. : 9822123420</p>
                <p>Address: Ravet</p>
                <p>Email : john@gmail.com</p>
                <Link to={"/DonorUpdate"}><Button variant="outline-danger">Update  </Button></Link>
                <Link to={"/dashboard"}><Button variant="outline-danger">Delete Account </Button></Link>
      </div>
    </div>
        
        

        </div>
    </div>

        
    </div>


   
  );
};

export default DonorProfile;
