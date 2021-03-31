import React, {useState} from "react";
import { Container ,FormGroup ,Input , Form , Button , } from "reactstrap";
import axios from "axios";
import base_url from "./../api/bootapi";

const AddApplication=()=> {
     
    const [application, setApplication]= useState({});
    const handleForm = (e) =>{
        console.log(application);
        postDataServer(application);
        e.preventDefault();
    };

    //creating function to post data on server
    const postDataServer = (data) =>{
        axios.post(`${base_url}/application`,data).then(
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
            <h1 className="text-center my-3">Fill Application details</h1>
            <Form onSubmit={handleForm}>
                

                    <FormGroup>
                        <label for="name">First Name</label>
                        <Input type="text" placeholder="Enter here" id="id"
                        onChange={(e)=>{
                            setApplication({...application,firstName:e.target.value});
                            }}/>
                    </FormGroup>

                    <FormGroup>
                        <label for="name">Middle Name</label>
                        <Input type="text" placeholder="Enter here" id="id"
                        onChange={(e)=>{
                            setApplication({...application,middleName:e.target.value});
                            }}/>
                    </FormGroup>
                    <FormGroup>
                        <label for="name">Last Name</label>
                        <Input type="text" placeholder="Enter here" id="id"
                        onChange={(e)=>{
                            setApplication({...application,lastName:e.target.value});
                            }}/>
                    </FormGroup>

                    <FormGroup>
                        <label for="date">Date of BirthorDeath</label>
                        <Input type="date" placeholder=" Enter  here" 
                    
                        onChange={(e)=>{
                            setApplication({...application,dateOfBithorDeath:e.target.value});
                            }}/>

                    </FormGroup>

                    <FormGroup>
                        <label for="relation with applicant">Relation with applicant</label>
                        <Input type="text" placeholder=" Enter  here" 
                    
                        onChange={(e)=>{
                            setApplication({...application,relationWithApplicant:e.target.value});
                            }}/>

                    </FormGroup>

                    <FormGroup>
                        <label for="date">Date of Issue</label>
                        <Input type="date" placeholder=" Enter  here" 
                    
                        onChange={(e)=>{
                            setApplication({...application,dateOfIssue:e.target.value});
                            }}/>

                    </FormGroup>
                    

                    <Container >
                        <Button color="success"> Add Application</Button>
                        < Button color="warning ml-2"> clear</Button>
                        
                         
                    </Container>
                    
                

            </Form>
        </div>
    )
}
export default AddApplication;
