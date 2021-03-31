import React, {useState} from "react";
import { Container ,FormGroup ,Input , Form , Button , } from "reactstrap";
import axios from "axios";
import base_url from "./../api/bootapi";

const AddDocument=()=> {
     
    const [document, setDocument]= useState({});
    const handleForm = (e) =>{
        console.log(document);
        postDataServer(document);
        e.preventDefault();
    };

    //creating function to post data on server
    const postDataServer = (data) =>{
        axios.post(`${base_url}documents`,data).then(
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
            <h1 className="text-center my-3">Document details</h1>
            <Form onSubmit={handleForm}>

            <FormGroup>
                    <label for="id">Id</label>
                    
                    <Input type="number" placeholder="Enter here" name="id" id="id"
                    onChange={(e)=>{
                        setDocument({...document,id:e.target.value});
                        }}/>

                    </FormGroup>

                

                    <FormGroup>
                        <label for="name">Document Name</label>
                        <Input type="text" placeholder="Enter title here" id="title"
                        onChange={(e)=>{
                            setDocument({...document,name:e.target.value});
                            }}/>
                    </FormGroup>

                    <FormGroup>
                        <label for="description">Document Descripion</label>
                        <Input type="textarea" placeholder=" Enter description here" 
                        style={{ height:150}}
                        onChange={(e)=>{
                            setDocument({...document,description:e.target.value});
                            }}/>

                    </FormGroup>
                    

                    <Container >
                        <Button color="success"> Add Document</Button>
                        < Button color="warning ml-2"> clear</Button>
                        
                         
                    </Container>
                    
                

            </Form>
        </div>
    )
}
export default AddDocument;
