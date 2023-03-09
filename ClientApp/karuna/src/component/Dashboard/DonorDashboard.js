import {Routes,Route} from 'react-router-dom';
import DonorPageContent from './DonorPageContent';
import DonorSideMenu from './DonorSideMenu'
import React from 'react'
import './DonorDashboard.css';
import DonorProfile from './DonorProfile';

import {
  BrowserRouter as Router,
  Switch,
  Redirect
  } from "react-router-dom";

const Dashboard = () => {
  return (
    <div>
      <div className="container">
        <div>
          <DonorSideMenu></DonorSideMenu>
        </div>
        <div className="content">
          <DonorPageContent></DonorPageContent>
        </div>
    </div>

        
    </div>
  )
}

export default Dashboard;