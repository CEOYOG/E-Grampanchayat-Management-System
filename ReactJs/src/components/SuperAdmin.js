import React, { useState, useEffect} from "react";
import base_url from "./../api/bootapi";
import axios from "axios";
import {Link} from "react-router-dom";
import { toast } from "react-toastify";
import { Button } from "reactstrap";

const SuperAdmin = () => {
  useEffect(() => {
    superAdmin.title = "All SuperAdmin";
    getAllSuperAdminFromServer();
  }, []);

  //Function to call server:
  const getAllSuperAdminFromServer = () => {
    axios.get(`${base_url}/superAdmin`).then(
      (response) => {
        console.log(response);
        console.log(response.data);
        setSuperAdmin(response.data);
        
        
      },
      (error) => {
        console.log(error);
      }
    );
  };

  const deleteSuperAdmin = (id) => {
    axios.delete(`${base_url}superAdmin/${id}`).then(
      (response)=> {
        toast.success(" deleted")
      },
    (error)=>{
      toast.error("not deleted")
    }
    );
      };
    

  


  const [superAdmin, setSuperAdmin] = useState([]);
  


  return (
    <div>
      <h1>All SuperAdmin </h1><Button>AddSuperAdmin</Button>
      <p>List of SuperAdmin are as follows</p>
      <table class="table table-bordered">
  <thead>
    <tr>
       <th scope="col">Id</th> 
      <th scope="col">Name</th>
      <th scope="col">Email Id</th>
      
      
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
  {superAdmin.length > 0
        ? superAdmin.map((item) => (

          
          
          
            <tr>
          
           <td>{item.id}</td>
           <td>{item.name}</td>
           <td>{item.email}</td>
           
           

           <td>
          <Link class= "btn btn-outline-danger mr-2" onClick={() =>{
            deleteSuperAdmin(item.id);}}>Delete </Link>
          <Link class="btn btn-outline-primary">Update</Link>
          </td>
           </tr>
          
          
        
    )  )
    : "No SuperAdmin"}
  </tbody>
</table>
      
            
    </div>
  );
};

export default SuperAdmin;
