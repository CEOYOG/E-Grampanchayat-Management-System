import React, { useState, useEffect} from "react";
import base_url from "./../api/bootapi";
import axios from "axios";
import {Link} from "react-router-dom";
import { toast } from "react-toastify";
import { Button } from "reactstrap";

const Gdo = () => {
  useEffect(() => {
    gdo.title = "All Gdo";
    getAllGdoFromServer();
  }, []);

  //Function to call server:
  const getAllGdoFromServer = () => {
    axios.get(`${base_url}/gdo`).then(
      (response) => {
        console.log(response);
        console.log(response.data);
        setGdo(response.data);
        
        
      },
      (error) => {
        console.log(error);
      }
    );
  };

  const deleteGdo = (id) => {
    axios.delete(`${base_url}gdo/${id}`).then(
      (response)=> {
        toast.success(" deleted")
      },
    (error)=>{
      toast.error("not deleted")
    }
    );
      };
    

  


  const [gdo, setGdo] = useState([]);
  


  return (
    <div>
      <h1>All GDO </h1><Button>AddGdo</Button>
      <p>List of gdo are as follows</p>
      <table class="table table-bordered">
  <thead>
    <tr>
       <th scope="col">Id</th> 
      
      <th scope="col">Email Id</th>
      
      
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
  {gdo.length > 0
        ? gdo.map((item) => (

          
          
          
            <tr>
          
           <td>{item.id}</td>
           
           <td>{item.email}</td>
           
           

           <td>
          <Link class= "btn btn-outline-danger mr-2" onClick={() =>{
            deleteGdo(item.id);}}>Delete </Link>
          <Link class="btn btn-outline-primary">Update</Link>
          </td>
           </tr>
          
          
        
    )  )
    : "No gdo"}
  </tbody>
</table>
      
            
    </div>
  );
};

export default Gdo;
