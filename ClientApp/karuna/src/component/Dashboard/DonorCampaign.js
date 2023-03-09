import './DonorDashboard.css';

import fooddonate from '../../assets/fooddonate.jpg';
import furnituredonate from '../../assets/furnituredonate.jpg';
import clothesdonate from '../../assets/clothesdonate.jpg';
import toysdonate from '../../assets/toysdonate.jpeg';




import React from 'react';
import Button from 'react-bootstrap/Button';
import { Link } from "react-router-dom";
import DonorSideMenu from "./DonorSideMenu";

import Card from 'react-bootstrap/Card';

import './DonorProfile.css';
const DonorCampaign = ({ campaignTitle, organizationName, goalAmount, currentAmount }) => {
    const percentageRaised = Math.floor((currentAmount / goalAmount) * 100);



    return (
        <div>
            <div className="container">
                <div>
                    <DonorSideMenu></DonorSideMenu>
                </div>
                <div className="content">



                    <div className='pagecontent'>



                        <div className='cards'>
                            <br></br><br></br>
                            <div>
                                <Card style={{ width: '18rem' }}>
                                    <Card.Img variant="top" src={fooddonate} alt="fooddonate" />
                                    <Card.Body>
                                        <Card.Title>Food donation Campaign</Card.Title>
                                        Some quick example text to build on the card title and make up the
                                        bulk of the card's content.
                                        {/* <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                                </Card.Text> */}
                                        <Link to={"/FoodDonation"}><Button style={{ width: '10rem' }} variant="primary">Donate</Button></Link>
                                    </Card.Body>
                                </Card>
                            </div>
                            &nbsp;&nbsp;&nbsp;
                            <div>
                                <Card style={{ width: '18rem' }}>
                                    <Card.Img variant="top" src={clothesdonate} alt="clothesdonate" />
                                    <Card.Body>
                                        <Card.Title>Campaign - 2</Card.Title>
                                        Some quick example text to build on the card title and make up the
                                        bulk of the card's content.
                                        {/* <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                                </Card.Text> */}
                                        <Link to={"/ClothDonation"}><Button style={{ width: '10rem' }} variant="primary">Donate </Button></Link>
                                    </Card.Body>
                                </Card>
                            </div>
                            &nbsp;&nbsp;&nbsp;
                            <div>
                                <Card style={{ width: '18rem' }}>
                                    <Card.Img variant="top" src={furnituredonate} alt="furnituredonate" />
                                    <Card.Body>
                                        <Card.Title>Campaign - 3</Card.Title>
                                        Some quick example text to build on the card title and make up the
                                        bulk of the card's content.
                                        {/* <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                                </Card.Text> */}
                                        <Link to={"/FurnitureDonation"}><Button style={{ width: '10rem' }} variant="primary">Donate </Button></Link>
                                    </Card.Body>
                                </Card>
                            </div>
                            &nbsp;&nbsp;&nbsp;
                            <div>
                                <Card style={{ width: '18rem' }}>
                                    <Card.Img variant="top" src={toysdonate} alt="toysdonate" />
                                    <Card.Body>
                                        <Card.Title>Campaign - 4</Card.Title>
                                        Some quick example text to build on the card title and make up the
                                        bulk of the card's content.
                                        {/* <Card.Text>
                                Some quick example text to build on the card title and make up the
                                bulk of the card's content.
                                </Card.Text> */}
                                        <Link to={"/ToyDonation"}><Button style={{ width: '10rem' }} variant="primary">Donate</Button></Link>
                                    </Card.Body>
                                </Card>
                            </div>


                        </div>
                    </div>


                </div>
            </div>
        </div>



    );
};

export default DonorCampaign;
