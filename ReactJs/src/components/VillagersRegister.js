import React , {useState} from "react";
import { Col, Row, Button, Form, FormGroup, Label, Input } from 'reactstrap';

import axios from "axios";
import base_url from "./../api/bootapi";


const VillagersRegister = () => {
    const [register,setRegister]=useState({});
  

    const handleForm = (e) =>{
      console.log(register);
      postDataServer(register);
      e.preventDefault();
  };
    
  
    

     //creating function to post data on server
    const postDataServer = (data) =>{
      axios.post(`${base_url}villagers`,data).then(
          (response)=>{
              console.log(response);
              
          },
          (error)=>{
              console.log(error);
              console.log(error);
          }
      );
        };
  return (
    <Form onSubmit={handleForm}> 
      <Row form>
        <Col md={6}>
        <FormGroup>
        <Label>first Name</Label>
        <Input type="text" placeholder="Enter here" name="firstName" id="userId"
                    onChange={(e)=>{
                      setRegister({...register,firstName:e.target.value});
                        }}/>
            
          </FormGroup>

          <FormGroup>
            <Label>Middle Name</Label>
            <Input type="text" placeholder="Enter here" name="middleName" id="userId"
                    onChange={(e)=>{
                      setRegister({...register,middleName:e.target.value});
                        }}/>
          </FormGroup>

          <FormGroup>
            <Label>Last Name</Label>
            <Input type="text" placeholder="Enter here" name="lastName" id="userId"
                    onChange={(e)=>{
                      setRegister({...register,lastName:e.target.value});
                        }}/>
          </FormGroup>

          <FormGroup> 
            <Label>ContactNo</Label>
            <Input type="text" placeholder="Enter here" name="contact" id="userId"
                    onChange={(e)=>{
                      setRegister({...register,contact:e.target.value});
                        }}/>
          </FormGroup>

        
        </Col>
        <Col md={6}>

        <FormGroup>
            <Label >Email</Label>
            <Input type="text" placeholder="Enter here" name="email" id="userId"
                    onChange={(e)=>{
                      setRegister({...register,email:e.target.value});
                        }}/>
          </FormGroup>

          <FormGroup>
            <Label >Password</Label>
            <Input type="password" placeholder="Enter here" name="password" id="userId"
                    onChange={(e)=>{
                      setRegister({...register,password:e.target.value});
                        }}/>
          </FormGroup>

          <FormGroup>
            <Label >Date Of Birth</Label>
            <Input type="date" placeholder="Enter here" name="dateOfBirth" id="userId"
                    onChange={(e)=>{
                      setRegister({...register,dateOfBirth:e.target.value});
                        }}/>
          </FormGroup>

         
        
        </Col>
      </Row>
      <FormGroup>
        <Label >AdharCardNo</Label>
        <Input type="text" placeholder="Enter here" name="adharNo" id="userId"
                    onChange={(e)=>{
                      setRegister({...register,adharNo:e.target.value});
                        }}/>
      </FormGroup>

      <FormGroup>
      <label> Gender </label> <br></br>
      <Input type="text" placeholder="Enter here" name="gender" id="userId"
                    onChange={(e)=>{
                      setRegister({...register,gender:e.target.value});
                        }}/>
       <select
                defaultValue="Select Gender">
                <option defaultValue>Select Gender</option>
                <option value="male">Male</option>
                <option value="female">female</option>
                </select><br />
      </FormGroup>
      
      <Button color="success"> Submit</Button>
    
      
    </Form>
  );
}

export default VillagersRegister;