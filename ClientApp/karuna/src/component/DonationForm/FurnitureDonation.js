import React from 'react';
import {
  MDBBtn,
  MDBContainer,
  MDBCard,
  MDBCardBody,
  MDBInput,
  MDBCheckbox,
  MDBCol,
  MDBRow,
  MDBFile
}
from 'mdb-react-ui-kit';

const FurnitureDonation = () => {
  return (
    <MDBContainer fluid className='d-flex align-items-center justify-content-center bg-image' style={{backgroundImage: 'url()'}}>
      <div className='mask gradient-custom-3'></div>
      <MDBCard className='m-5' style={{maxWidth: '600px'}}>
        <MDBCardBody className='px-5'>
          <h2 className="text-uppercase text-center mb-5">Furniture Donation</h2>
          <MDBInput wrapperClass='mb-4' placeholder='Furniture Name' size='lg' id='form1' type='text'/>
          <MDBInput wrapperClass='mb-4' placeholder='Furniture Type' size='lg' id='form2' type='text'/>
          <MDBInput wrapperClass='mb-4' placeholder='quantity' size='lg' id='form3' type='number'/>
          
          <MDBInput wrapperClass='mb-4' placeholder='Furniture Desciption' size='lg' id='form4' type='text'/>
          <MDBRow className='align-items-center pb-3'>

                <MDBCol md='3' className='ps-5'>
                  <div className="mb-0">Upload Photo</div>
                </MDBCol>

                <MDBCol md='9' className='pe-6 '>
                  <MDBFile size='lg' id='customFile' />
                  <div className="small text-muted mt-2"></div>
                </MDBCol>

              </MDBRow>
          <div className='d-flex flex-row justify-content-center mb-4'>
            <MDBCheckbox name='flexCheck' id='flexCheckDefault' label='Furniture is safe for direct use' />
          </div>
          <MDBBtn className='mb-4 w-100 gradient-custom-4' size='lg'>Donate</MDBBtn>
        </MDBCardBody>
      </MDBCard>
    </MDBContainer>
  );
}

export default FurnitureDonation;

