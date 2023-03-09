import './DonorDashboard.css';

import React from 'react';
import Button from 'react-bootstrap/Button';
import { Link } from "react-router-dom";
import DonorSideMenu from "./DonorSideMenu";
import './DonorProfile.css';
function DonorProfile (props)  {
      const { name, age, bloodType, lastDonation } = props;

  return (
    <div>
        <div className="container">
            <div>
                <DonorSideMenu></DonorSideMenu>
            </div>
            <div className="content">


                <div className="donor-profile">
                    <h2>{name}</h2>

                    <h3>Donation History</h3>
                    <ul>
                        <li>Donation 1 - Date: MM/DD/YYYY - Location: XYZ Hospital</li>
                        <li>Donation 2 - Date: MM/DD/YYYY - Location: ABC Clinic</li>
                        <li>Donation 3 - Date: MM/DD/YYYY - Location: DEF Center</li>
                        {/* add more donation history items as needed */}
                    </ul>
                </div>


            </div>
        </div>
    </div>


   
  );
};

export default DonorProfile;
