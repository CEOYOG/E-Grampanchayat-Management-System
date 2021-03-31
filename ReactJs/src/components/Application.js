import React, { useState, useEffect} from "react";
import base_url from "./../api/bootapi";
import axios from "axios";
import {Link} from "react-router-dom";
import { toast } from "react-toastify";
import AddApplication from "./AddApplication";

const Application = () => {
  useEffect(() => {
    document.title = "All Application";
    getAllApplicationFromServer();
  }, []);

  //Function to call server:
  const getAllApplicationFromServer = () => {
    axios.get(`${base_url}/application`).then(
      (response) => {
        console.log(response);
        console.log(response.data);
        setApplication(response.data);
        
        
      },
      (error) => {
        console.log(error);
      }
    );
  };

  const deleteApplication = (id) => {
    axios.delete(`${base_url}application/${id}`).then(
      (response)=> {
        toast.success(" deleted")
      },
    (error)=>{
      toast.error("not deleted")
    }
    );
      };
    


  const [application, setApplication] = useState([]);
  


  return (
    <div>
      <h1>All Application</h1>
      <p>List of application are as follows</p>
      
      <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">First Name</th>
      <th scope="col">Middle Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">dateOfBithorDeath</th>
      <th scope="col">relationWithApplicant</th>
      
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
  {application.length > 0
        ? application.map((item) => (

          
          
            <tr>
          
           <td>{item.id}</td>
           <td>{item.firstName}</td>
           <td>{item.middleName}</td>
           <td>{item.lastName}</td>
           <td>{item.dateOfBithorDeath}</td>
           <td>{item.relationWithApplicant}</td>
           
           

           <td>
          <Link class= "btn btn-outline-danger mr-2"  onClick={() =>{
            deleteApplication(item.id);}}>Delete </Link>
          <Link class="btn btn-outline-primary">Update</Link>
          </td>
           </tr>
          
          
      
    )  )
    : "No application"}
  </tbody>
</table>
      
            
    </div>
  );
};

export default Application;
