import React, { useEffect, useState } from "react";
// import './SideMenu.css';
import { Link } from "react-router-dom";


const ReceiverSideMenu = () => {

  const [isMenuOpen, setIsMenuOpen] = useState(false);

  const handleMenuToggle = () => {
    setIsMenuOpen(!isMenuOpen);
  };


  return (
    <div>
      <div className="menu">
              
        <ul>
        <li><h5>Receiver Name</h5></li>
          <hr></hr>
          <Link to={"/ReceiverProfile"}><li><a href="#">Profile</a></li></Link>
          <Link to={"/ReceiverDashboard"}><li><a href="#">View Donations</a></li></Link>
          <Link to={"/ReceiverHistory"}><li><a href="#">History</a></li></Link>
          {/* <Link to={"/DonorCampaign"}><li><a href="#">Campaigns</a></li></Link> */}
          <Link to={"/ReceiverDonorList"}><li><a href="#">Donors</a></li></Link>
          <Link to={"/RequestDonation"}><li><a href="#">Request </a></li></Link>

        </ul>
      </div>
        </div>
  );
};

export default ReceiverSideMenu;
