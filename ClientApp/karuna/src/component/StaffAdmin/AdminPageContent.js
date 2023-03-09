// import './PageContent.css';
import React, { useState } from "react";

const StaffPageContent = () => {
  const [isMenuOpen, setIsMenuOpen] = useState(false);

  const handleMenuToggle = () => {
    setIsMenuOpen(!isMenuOpen);
  };

  return (
    <>

<div className='pagecontent'>
        <div>
      <button className='btnmenu' onClick={handleMenuToggle}>
        {isMenuOpen ? "Staff Name" : "Staff Name"}
      </button>
      {isMenuOpen && (
        <fieldset>
        <div className="menu">
          <ul>
            <li>Personal Info</li>
            <li> All Data</li>
            <li>View Campaigns</li>
          </ul>
        </div>
        </fieldset>
      )}
      </div>
      <div>Hello</div>
      </div>
    </>
  );
};

export default StaffPageContent;


