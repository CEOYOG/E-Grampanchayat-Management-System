import React, {useState} from "react";
import { Container ,FormGroup ,Input , Form , Button , } from "reactstrap";
import axios from "axios";
import base_url from "./../api/bootapi";

const Bill=()=> {
     
    const [bill, setBill]= useState({});
    const handleForm = (e) =>{
        console.log(bill);
        postDataServer(bill);
        e.preventDefault();
    };

    //creating function to post data on server
    const postDataServer = (data) =>{
        axios.post(`${base_url}/bill`,data).then(
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
            <h1 className="text-center my-3">Fill Bill details</h1>
            <Form onSubmit={handleForm}>
                

    

                    <FormGroup>
                        <label for="applicationName">Application Name</label>
                        <Input type="text" placeholder="Enter title here" id="title"
                        onChange={(e)=>{
                            setBill({...bill,applicationName:e.target.value});
                            }}/>
                    </FormGroup>

                    <FormGroup>
                        <label for="amount">Amount</label>
                        <Input type="text" placeholder="Enter title here" id="title"
                        onChange={(e)=>{
                            setBill({...bill,amount:e.target.value});
                            }}/>
                    </FormGroup>

                    <FormGroup>
                        <label for="transctionId">TransctionId</label>
                        <Input type="number" placeholder=" Enter  here" 
                        
                        onChange={(e)=>{
                            setBill({...bill,transactionId:e.target.value});
                            }}/>

                    </FormGroup>

                    <FormGroup>
                        <label for="date">Date</label>
                        <Input type="date" placeholder=" Enter  here" 
                        
                        onChange={(e)=>{
                            setBill({...bill,date:e.target.value});
                            }}/>

                    </FormGroup>
                    

                    <Container >
                        <Button color="success"> Add Bill</Button>
                        < Button color="warning ml-2"> clear</Button>
                        
                         
                    </Container>
                    
                

            </Form>
        </div>
    )
}
export default Bill;
