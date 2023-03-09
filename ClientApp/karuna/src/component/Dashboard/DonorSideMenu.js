import React, { useEffect, useState } from "react";
import './SideMenu.css';
import { Link } from "react-router-dom";


const SideMenu = () => {

  const [isMenuOpen, setIsMenuOpen] = useState(false);

  const handleMenuToggle = () => {
    setIsMenuOpen(!isMenuOpen);
  };


  return (
    <div>
      <div className="menu">
              
        <ul>
        <li><h5>Donor Name</h5></li>
          <hr></hr>
          <Link to={"/DonorProfile"}><li><a href="#">Profile</a></li></Link>
          <Link to={"/dashboard"}><li><a href="#">Donate</a></li></Link>
          <Link to={"/DonorHistory"}><li><a href="#">History</a></li></Link>
          <Link to={"/DonorCampaign"}><li><a href="#">Campaigns</a></li></Link>
          <Link to={"/DonorReceiverList"}><li><a href="#">Receivers</a></li></Link>


        </ul>
      </div>
        </div>
  );
};

export default SideMenu;
