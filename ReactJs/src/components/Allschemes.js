import Scheme from "./Scheme";
import React, { useState, useEffect} from "react";
import base_url from "./../api/bootapi";
import axios from "axios";
import {Link} from "react-router-dom";
import { toast } from "react-toastify";

const Allschemes = () => {
  useEffect(() => {
    document.title = "All Schemes";
    getAllSchemeFromServer();
  }, []);

  //Function to call server:
  const getAllSchemeFromServer = () => {
    axios.get(`${base_url}/schemes`).then(
      (response) => {
        console.log(response);
        console.log(response.data);
        setSchemes(response.data);
        
        
      },
      (error) => {
        console.log(error);
      }
    );
  };

  const deleteScheme = (id) => {
axios.delete(`${base_url}schemes/${id}`).then(
  (response)=> {
    toast.success("scheme deleted")
  },
(error)=>{
  toast.error("not deleted")
}
);
  };

  const [schemes, setSchemes] = useState([]);


  return (
    <div>
      <h1>All Schemes</h1>
      <p>List of schemes are as follows</p>
      <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Name</th>
      <th scope="col">Descripion</th>
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
  {schemes.length > 0
        ? schemes.map((item) => (

          
          
            <tr>
           
          <td>{item.id}</td>
          
        
          
          
          <td>{item.name}</td>
        
          
          <td>{item.description}</td>
          
          
          <td>
          <Link class= "btn btn-outline-danger mr-2"  onClick={() =>{
            deleteScheme(item.id);}}>Delete </Link>
          <Link class="btn btn-outline-primary">Update</Link>
          </td>
          </tr>
          
         
           

           
        
    )  )
    : "No schemes"}
  </tbody>
</table>
      
            
    </div>
  );
};

export default Allschemes;
