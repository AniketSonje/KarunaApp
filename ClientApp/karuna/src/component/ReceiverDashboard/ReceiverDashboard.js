import {Routes,Route} from 'react-router-dom';
import ReceiverPageContent from './ReceiverPageContent';
import ReceiverSideMenu from './ReceiverSideMenu';
import React from 'react'

import {
  BrowserRouter as Router,
  Switch,
  Redirect
  } from "react-router-dom";

const ReceiverDashboard = () => {
  return (
    <div>
      <div className="container">
        <div>
          <ReceiverSideMenu></ReceiverSideMenu>
        </div>
        <div className="content">
          <ReceiverPageContent></ReceiverPageContent>
        </div>
    </div>

        
    </div>
  )
}

export default ReceiverDashboard;