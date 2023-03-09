
// import React from 'react';
// // import './ReceiversList.css';  Import the CSS file

// const DonorReceiverList = ({ receivers }) => {
//   return (
    // <div className="receivers-list">
    //   <h2>Receivers List</h2>
    //   <ul>
    //     {receivers.map((receiver) => (
    //       <li key={receiver.id}>
    //         <div className="receiver-info">
    //           <h3>{receiver.name}</h3>
    //           <p>{receiver.email}</p>
    //         </div>
    //       </li>
    //     ))}
    //   </ul>
    // </div>
//   );
// };

// export default DonorReceiverList;


import './DonorDashboard.css';
import Table from 'react-bootstrap/Table';
import { Link } from 'react-router-dom';
import { Button } from 'react-bootstrap';
import React from 'react';
import DonorSideMenu from "./DonorSideMenu";
const DonorReceiverList = () => {

  return (
    <div>
        <div className="container">
            <div>
                <DonorSideMenu></DonorSideMenu>
            </div>
            <div className="content">


            <Table striped bordered hover>
      <thead>
        <tr>
          <th>#</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Address</th>
          <th>Phone No</th>


        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1</td>
          <td>Mark</td>
          <td>Otto</td>
          <td>Pune</td>
          <td>7894561230</td>
          <td><Link to={"/FoodDonation"}><Button variant="outline-success">Donate </Button></Link></td>
        </tr>
        
      </tbody>
    </Table>


            </div>
        </div>
    </div>


   
  );
};

export default DonorReceiverList;
