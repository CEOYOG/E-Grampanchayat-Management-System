import React, {useState} from "react";
import { Container ,FormGroup ,Input , Form , Button , } from "reactstrap";
import axios from "axios";
import base_url from "./../api/bootapi";

const AddMember=()=> {
     
    const [member, setMember]= useState({});
    const handleForm = (e) =>{
        console.log(member);
        postDataServer(member);
        e.preventDefault();
    };

    //creating function to post data on server
    const postDataServer = (data) =>{
        axios.post(`${base_url}/member`,data).then(
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
            <h1 className="text-center my-3">PanchayatBody Members</h1>
            <Form onSubmit={handleForm}>
                

             <FormGroup>
                        <label for="name">Post Name</label>
                        <Input type="text" placeholder="Enter title here" id="title"
                        onChange={(e)=>{
                            setMember({...member,postName:e.target.value});
                            }}/>
                    </FormGroup>

                    <FormGroup>
                        <label for="date">From Date</label>
                        <Input type="date" placeholder=" Enter here" 
                        
                        onChange={(e)=>{
                            setMember({...member,fromDate:e.target.value});
                            }}/>
                  </FormGroup>
                  <FormGroup>
                        <label for="date">Till Date</label>
                        <Input type="date" placeholder=" Enter here" 
                        
                        onChange={(e)=>{
                            setMember({...member,tillDate:e.target.value});
                            }}/>
                  </FormGroup>

                  <FormGroup>
                        <label for="text">Email</label>
                        <Input type="text" placeholder=" Enter here" 
                        
                        onChange={(e)=>{
                            setMember({...member,email:e.target.value});
                            }}/>
                  </FormGroup>
                  <FormGroup>
                        <label for="password">Password</label>
                        <Input type="password" placeholder=" Enter here" 
                        
                        onChange={(e)=>{
                            setMember({...member,password:e.target.value});
                            }}/>
                  </FormGroup>

                    <Container >
                        <Button color="success"> Add Member</Button>
                        < Button color="warning ml-2"> clear</Button>
                        
                         
                    </Container>
                    
                

            </Form>
        </div>
    )
}
export default AddMember;
