import React from 'react';
import Button from 'react-bootstrap/Button';
import { Link } from "react-router-dom";
import ReceiverSideMenu from "./ReceiverSideMenu";
function ReceiverHistory (props)  {
      const { name, age, bloodType, lastDonation } = props;

  return (
    <div>
        <div className="container">
            <div>
                <ReceiverSideMenu></ReceiverSideMenu>
            </div>
            <div className="content">


                <div className="donor-profile">
                    <h2>{name}</h2>

                    <h3>Received Items History</h3>
                    <ul>
                        <li>Item 1 - Date: MM/DD/YYYY - Location: XYZ Hospital</li>
                        <li>Item 2 - Date: MM/DD/YYYY - Location: ABC Clinic</li>
                        <li>Item 3 - Date: MM/DD/YYYY - Location: DEF Center</li>
                        {/* add more donation history items as needed */}
                    </ul>
                </div>


            </div>
        </div>
    </div>


   
  );
};

export default ReceiverHistory;
