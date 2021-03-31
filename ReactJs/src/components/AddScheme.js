import React, {useState} from "react";
import { Container ,FormGroup ,Input , Form , Button , } from "reactstrap";
import axios from "axios";
import base_url from "./../api/bootapi";

const AddScheme=()=> {
     
    const [scheme, setScheme]= useState({});
    const handleForm = (e) =>{
        console.log(scheme);
        postDataServer(scheme);
        e.preventDefault();
    };

    //creating function to post data on server
    const postDataServer = (data) =>{
        axios.post(`${base_url}schemes`,data).then(
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
            <h1 className="text-center my-3">Fill Scheme details</h1>
            <Form onSubmit={handleForm}>
                <FormGroup>
                    <label for="userId">Scheme Id</label>
                    
                    <Input type="text" placeholder="Enter here" name="userId" id="userId"
                    onChange={(e)=>{
                        setScheme({...scheme,id:e.target.value});
                        }}/>

                    </FormGroup>

                    <FormGroup>
                        <label for="name">Scheme Name</label>
                        <Input type="text" placeholder="Enter title here" id="title"
                        onChange={(e)=>{
                            setScheme({...scheme,name:e.target.value});
                            }}/>
                    </FormGroup>

                    <FormGroup>
                        <label for="description">Scheme Descripion</label>
                        <Input type="textarea" placeholder=" Enter description here" 
                        style={{ height:150}}
                        onChange={(e)=>{
                            setScheme({...scheme,description:e.target.value});
                            }}/>

                    </FormGroup>
                    

                    <Container >
                        <Button color="success"> Add Scheme</Button>
                        < Button color="warning ml-2"> clear</Button>
                        
                         
                    </Container>
                    
                

            </Form>
        </div>
    )
}
export default AddScheme;
