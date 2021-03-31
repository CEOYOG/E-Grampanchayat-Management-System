import React, { useState, useEffect} from "react";
import base_url from "./../api/bootapi";
import axios from "axios";
import {Link} from "react-router-dom";
import { toast } from "react-toastify";
import { Button } from "reactstrap";

const PanchayatBody = () => {
  useEffect(() => {
    panchayatBody.title = "All Members";
    getAllPanchayatBodyFromServer();
  }, []);

  //Function to call server:
  const getAllPanchayatBodyFromServer = () => {
    axios.get(`${base_url}/member`).then(
      (response) => {
        console.log(response);
        console.log(response.data);
        setPanchayatBody(response.data);
        
        
      },
      (error) => {
        console.log(error);
      }
    );
  };

  const deletePanchayatBody = (id) => {
    axios.delete(`${base_url}/member/${id}`).then(
      (response)=> {
        toast.success(" deleted")
      },
    (error)=>{
      toast.error("not deleted")
    }
    );
      };
    

  


  const [panchayatBody, setPanchayatBody] = useState([]);
  


  return (
    <div>
      <h1>All Members </h1><Button>AddMember</Button><br></br>
      <p>List of members are as follows</p>
      <table class="table table-bordered">
  <thead>
    <tr>
       <th scope="col">Id</th> 
      <th scope="col"> Post Name</th>
      <th scope="col"> Email</th>
      <th scope="col"> From Date</th>
      <th scope="col"> Till Date</th>
      
      
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
  {panchayatBody.length > 0
        ? panchayatBody.map((item) => (

          
          
          
            <tr>
          
           <td>{item.id}</td>
           <td>{item.postName}</td>
           <td>{item.email}</td>
           <td>{item.fromDate}</td>
           <td>{item.tillDate}</td>
           
           

           <td>
          <Link class= "btn btn-outline-danger mr-2" onClick={() =>{
            deletePanchayatBody(item.id);}}>Delete </Link>
          <Link class="btn btn-outline-primary">Update</Link>
          </td>
           </tr>
          
          
        
    )  )
    : "No PanchayatBody"}
  </tbody>
</table>
      
            
    </div>
  );
};

export default PanchayatBody;
