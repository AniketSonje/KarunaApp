import { Button } from 'react-bootstrap';
import Badge from 'react-bootstrap/Badge';
import ListGroup from 'react-bootstrap/ListGroup';
import ReceiverSideMenu from '../ReceiverDashboard/ReceiverSideMenu';
import { Link } from 'react-router-dom';

const FoodDonationsList = () => {
  return (
    <div>
        <div className="container">
            <div>
                <ReceiverSideMenu></ReceiverSideMenu>
            </div>
            <div className="content">
              
              
              <h3>Donation List</h3>
                  <ListGroup as="ol" numbered>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start">
        <div className="ms-2 me-auto">
          <div className="fw-bold">Subheading</div>
          Cras justo odio
        </div>
        <Link to={"/FoodDetails"}><Button  variant="outline-info">View Details </Button></Link>
        <Link to={"/ReceiverDashboard"}><Button  variant="outline-success">Accept</Button></Link>
        <Badge bg="primary" pill>
          14
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start">
        <div className="ms-2 me-auto">
          <div className="fw-bold">Subheading</div>
          Cras justo odio
        </div>
        <Link to={"/FoodDetails"}><Button  variant="outline-info">View Details </Button></Link>
        <Link to={"/ReceiverDashboard"}><Button  variant="outline-success">Accept</Button></Link>
        <Badge bg="primary" pill>
          14
        </Badge>
      </ListGroup.Item>
      <ListGroup.Item
        as="li"
        className="d-flex justify-content-between align-items-start">
        <div className="ms-2 me-auto">
          <div className="fw-bold">Subheading</div>
          Cras justo odio
        </div>
        <Link to={"/FoodDetails"}><Button  variant="outline-info">View Details </Button></Link>
        <Link to={"/ReceiverDashboard"}><Button  variant="outline-success">Accept</Button></Link>
        <Badge bg="primary" pill>
          14
        </Badge>
      </ListGroup.Item>
    </ListGroup>



               
    </div>
        </div>
    </div>



  );
}

export default FoodDonationsList;