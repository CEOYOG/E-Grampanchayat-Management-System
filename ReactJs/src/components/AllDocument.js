import React, { useState, useEffect} from "react";
import base_url from "./../api/bootapi";
import axios from "axios";
import {Link} from "react-router-dom";
import { toast } from "react-toastify";

const AllDocument = () => {
  useEffect(() => {
    document.title = "All Document";
    getAllDocumentFromServer();
  }, []);

  //Function to call server:
  const getAllDocumentFromServer = () => {
    axios.get(`${base_url}/documents`).then(
      (response) => {
        console.log(response);
        console.log(response.data);
        setDocument(response.data);
        
        
      },
      (error) => {
        console.log(error);
      }
    );
  };

  const deleteDocument = (id) => {
    axios.delete(`${base_url}documents/${id}`).then(
      (response)=> {
        toast.success("document deleted")
      },
    (error)=>{
      toast.error("not deleted")
    }
    );
      };
    


  const [document, setDocument] = useState([]);
  


  return (
    <div>
      <h1>All Document</h1>
      <p>List of documents are as follows</p>
      <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Name</th>
      <th scope="col">Description</th>
      
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
  {document.length > 0
        ? document.map((item) => (

          
          
            <tr>
          
           <td>{item.id}</td>
           <td>{item.name}</td>
           <td>{item.description}</td>
           
           

           <td>
          <Link class= "btn btn-outline-danger mr-2"  onClick={() =>{
            deleteDocument(item.id);}}>Delete </Link>
          <Link class="btn btn-outline-primary">Update</Link>
          </td>
           </tr>
          
          
      
    )  )
    : "No document"}
  </tbody>
</table>
      
            
    </div>
  );
};

export default AllDocument;
