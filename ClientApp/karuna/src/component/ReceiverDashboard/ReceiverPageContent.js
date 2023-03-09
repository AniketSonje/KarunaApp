// import './PageContent.css';
import { Link } from 'react-router-dom';
import React, { useState } from "react";

import fooddonate from '../../assets/fooddonate.jpg';
import furnituredonate from '../../assets/furnituredonate.jpg';
import clothesdonate from '../../assets/clothesdonate.jpg';
import toysdonate from '../../assets/toysdonate.jpeg';


import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

const PageContent = () => {
  const [isMenuOpen, setIsMenuOpen] = useState(false);

  const handleMenuToggle = () => {
    setIsMenuOpen(!isMenuOpen);
  };

  return (
    <>
    <div className='pagecontent'>
        


        <div className='cards'>
        <br></br><br></br>
        <div>  
            <Card style={{ width: '18rem' }}>
            <Card.Img variant="top" src={fooddonate} alt="fooddonate" />
            <Card.Body>
                <Card.Title>Food Donations</Card.Title>
                Some quick example text to build on the card title and make up the
                bulk of the card's content.
                {/* <Card.Text>
                Some quick example text to build on the card title and make up the
                bulk of the card's content.
                </Card.Text> */}
                <Link to={"/FoodDonationsList"}><Button variant="primary">View </Button></Link>
            </Card.Body>
            </Card>
        </div>
        &nbsp;&nbsp;&nbsp;
        <div>
            <Card style={{ width: '18rem' }}>
            <Card.Img variant="top" src={clothesdonate} alt="clothesdonate" />
            <Card.Body>
                <Card.Title>Clothing Donations</Card.Title>
                Some quick example text to build on the card title and make up the
                bulk of the card's content.
                {/* <Card.Text>
                Some quick example text to build on the card title and make up the
                bulk of the card's content.
                </Card.Text> */}
                <Link to={"/ClothDonation"}><Button variant="primary">View </Button></Link>
            </Card.Body>
            </Card>
        </div>
        &nbsp;&nbsp;&nbsp;
        <div>
            <Card style={{ width: '18rem' }}>
            <Card.Img variant="top" src={furnituredonate} alt="furnituredonate" />
            <Card.Body>
                <Card.Title>Furniture Donations</Card.Title>
                Some quick example text to build on the card title and make up the
                bulk of the card's content.
                {/* <Card.Text>
                Some quick example text to build on the card title and make up the
                bulk of the card's content.
                </Card.Text> */}
                <Link to={"/FurnitureDonation"}><Button variant="primary">View </Button></Link>
            </Card.Body>
            </Card>
        </div>
        &nbsp;&nbsp;&nbsp;
        <div>  
            <Card style={{ width: '18rem' }}>
            <Card.Img variant="top" src={toysdonate} alt="toysdonate" />
            <Card.Body>
                <Card.Title>Toys Donations</Card.Title>
                Some quick example text to build on the card title and make up the
                bulk of the card's content.
                {/* <Card.Text>
                Some quick example text to build on the card title and make up the
                bulk of the card's content.
                </Card.Text> */}
                <Link to={"/ToyDonation"}><Button variant="primary">View </Button></Link>
            </Card.Body>
            </Card>
        </div>


        </div>
    </div>
    </>
  );
};

export default PageContent;


