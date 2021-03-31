import React, {useState} from "react";
import { Container ,FormGroup ,Input , Form , Button , } from "reactstrap";
import axios from "axios";
import base_url from "./../api/bootapi";

const AddSuperAdmin=()=> {
     
    const [superAdmin, setsuperAdmin]= useState({});
    const handleForm = (e) =>{
        console.log(superAdmin);
        postDataServer(superAdmin);
        e.preventDefault();
    };

    //creating function to post data on server
    const postDataServer = (data) =>{
        axios.post(`${base_url}/superAdmin`,data).then(
            (response)=>{
                console.log(response);
                
            },
            (error)=>{
                console.log(error);
                console.log(error);
            }
        );
    
    };

    return(
        <div>
            <h1 className="text-center my-3">SuperAdmin</h1>
            <Form onSubmit={handleForm}>
                

             <FormGroup>
                        <label for="name">SuperAdmin Name</label>
                        <Input type="text" placeholder="Enter title here" id="title"
                        onChange={(e)=>{
                            setsuperAdmin({...superAdmin,name:e.target.value});
                            }}/>
                    </FormGroup>

                    <FormGroup>
                        <label for="email">Email Id</label>
                        <Input type="text" placeholder=" Enter emailId here" 
                        
                        onChange={(e)=>{
                            setsuperAdmin({...superAdmin,email:e.target.value});
                            }}/>
                  </FormGroup>
                   <FormGroup>
                      <label for="password">Password</label>
                        <Input type="password" placeholder=" Enter password here" 
                        
                        onChange={(e)=>{
                            setsuperAdmin({...superAdmin,password:e.target.value});
                            }}/>

                    </FormGroup>

                    <Container >
                        <Button color="success"> Add SuperAdmin</Button>
                        < Button color="warning ml-2"> clear</Button>
                        
                         
                    </Container>
                    
                

            </Form>
        </div>
    )
}
export default AddSuperAdmin;
