import {Form, Label, Input, FormGroup} from "reactstrap";
import React, {useState} from "react";
import axios from "axios";
import base_url from "./../api/bootapi";




  const UserLogin = () => {
    const [userLogin,setuserLogin]=useState({});

  const handleForm = (e) =>{
    console.log(UserLogin);
    postDataServer(UserLogin);
    e.preventDefault();
};


    //creating function to post data on server
    const postDataServer = (data) =>{
      axios.post(`${base_url}/user`,data).then(
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
        
      <Form  onSubmit={handleForm}>
        
      
        <FormGroup>
      <Label>Email</Label>
      <Input type="text" placeholder="Enter here" name="email" id="userId"
                  onChange={(e)=>{
                    setuserLogin({...userLogin,email:e.target.value});
                      }}/>
          </FormGroup>

          <FormGroup>
      <Label>Password</Label>
      <Input type="password" placeholder="Enter here" name="password" id="userId"
                  onChange={(e)=>{
                    setuserLogin({...userLogin,password:e.target.value});
                      }}/>
          </FormGroup>

          <FormGroup>
      <Label>AdharNo</Label>
      <Input type="number" placeholder="Enter here" name="adharNo" id="userId"
                  onChange={(e)=>{
                    setuserLogin({...userLogin,adharNo:e.target.value});
                      }}/>
          </FormGroup>

          
          <FormGroup>
            <button color="primary">Login</button>
          </FormGroup>
</Form>
          

    );
  }
  export default UserLogin;