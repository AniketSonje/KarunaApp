
import React from 'react';
import ReceiverSideMenu from "./ReceiverSideMenu";
const ReceiverDonorList = () => {

  return (
    <div>
        <div className="container">
            <div>
                <ReceiverSideMenu></ReceiverSideMenu>
            </div>
            <div className="content">


                <div className="user-list">
                    <h2>Donors List</h2>
                    <ul>
                        <li>abc</li>
                        <li>xyz</li>
                        <li>pqr</li>
                    </ul>
                </div>


            </div>
        </div>
    </div>


   
  );
};

export default ReceiverDonorList;
