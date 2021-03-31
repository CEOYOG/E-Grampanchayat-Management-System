import React, { useState, useEffect} from "react";
import base_url from "./../api/bootapi";
import axios from "axios";
import {Link} from "react-router-dom";
import { toast } from "react-toastify";

const AllBills = () => {
  useEffect(() => {
    document.title = "All Bills";
    getAllBillsFromServer();
  }, []);

  //Function to call server:
  const getAllBillsFromServer = () => {
    axios.get(`${base_url}/bill`).then(
      (response) => {
        console.log(response);
        console.log(response.data);
        setBills(response.data);
        
        
      },
      (error) => {
        console.log(error);
      }
    );
  };

  const deleteBill = (id) => {
    axios.delete(`${base_url}bill/${id}`).then(
      (response)=> {
        toast.success("bill deleted")
      },
    (error)=>{
      toast.error("not deleted")
    }
    );
      };
    

  


  const [bills, setBills] = useState([]);
  


  return (
    <div>
      <h1>All Bills</h1>
      <p>List of bills are as follows</p>
      <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Amount</th>
      <th scope="col">TransctionId</th>
      <th scope="col">Date</th>
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
  {bills.length > 0
        ? bills.map((item) => (

          
          
          
            <tr>
          
           <td>{item.id}</td>
           <td>{item.amount}</td>
           <td>{item.transctionId}</td>
           <td>{item.date}</td>
           

           <td>
          <Link class= "btn btn-outline-danger mr-2" onClick={() =>{
            deleteBill(item.id);}}>Delete </Link>
          <Link class="btn btn-outline-primary">Update</Link>
          </td>
           </tr>
          
          
        
    )  )
    : "No bills"}
  </tbody>
</table>
      
            
    </div>
  );
};

export default AllBills;
