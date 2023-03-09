import {Routes,Route} from 'react-router-dom';
import StaffPageContent from './AdminPageContent';
import StaffSideMenu from './AdminSideMenu';
import React from 'react'

import {
  BrowserRouter as Router,
  Switch,
  Redirect
  } from "react-router-dom";

const StaffDashboard = () => {
  return (
    <div>
      <div className="container">
        <div>
          <StaffSideMenu></StaffSideMenu>
        </div>
        <div className="content">
          <StaffPageContent></StaffPageContent >
        </div>
    </div>

        
    </div>
  )
}

export default StaffDashboard;