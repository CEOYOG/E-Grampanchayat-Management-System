import React, {useState} from "react";
import { Container ,FormGroup ,Input , Form , Button , } from "reactstrap";
import axios from "axios";
import base_url from "./../api/bootapi";

const AddGdo=()=> {
     
    const [gdo, setgdo]= useState({});
    const handleForm = (e) =>{
        console.log(gdo);
        postDataServer(gdo);
        e.preventDefault();
    };

    //creating function to post data on server
    const postDataServer = (data) =>{
        axios.post(`${base_url}gdo`,data).then(
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
            <h1 className="text-center my-3">GDO</h1>
            <Form onSubmit={handleForm}>
                

             <FormGroup>
                        <label for="name">GDO Name</label>
                        <Input type="text" placeholder="Enter title here" id="title"
                        onChange={(e)=>{
                            setgdo({...gdo,name:e.target.value});
                            }}/>
                    </FormGroup>

                    <FormGroup>
                        <label for="email">Email Id</label>
                        <Input type="text" placeholder=" Enter emailId here" 
                        
                        onChange={(e)=>{
                            setgdo({...gdo,email:e.target.value});
                            }}/>
                  </FormGroup>
                   <FormGroup>
                      <label for="password">Password</label>
                        <Input type="password" placeholder=" Enter password here" 
                        
                        onChange={(e)=>{
                            setgdo({...gdo,password:e.target.value});
                            }}/>

                    </FormGroup>

                    <Container >
                        <Button color="success"> Add GDO</Button>
                        < Button color="warning ml-2"> clear</Button>
                        
                         
                    </Container>
                    
                

            </Form>
        </div>
    )
}
export default AddGdo;
