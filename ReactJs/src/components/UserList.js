
import React, { useState, useEffect } from "react";
import base_url from "./../api/bootapi";
import axios from "axios";

const UserList = () => {
  useEffect(() => {
    document.title = "All UserList";
    getUserListFromServer();
  }, []);

  //Function to call server:
  const getUserListFromServer = () => {
    axios.get(`${base_url}/villagers`).then(
      (response) => {
        console.log(response.data);
        setRegister(response.data);
      },
      (error) => {
        console.log(error);
      }
    );
  };

  const [register, setRegister] = useState([]);
  return (
    <div className="table">
      <h1>All Users List</h1>
     
<table>
<thead>
              
                    
         <th> First Name</th> 
         <th> Middle Name</th> 
         <th> Last Name</th> 
         <th> ContactNo</th> 
         <th> AdharNo</th> 
         <th> Gender</th>
         
               
                
            </thead>  

            <tbody>
            {register.length > 0
        ? register.map((item) => (
      
               
              <tr>
                 <td>  {item.firstName}</td>
                 <td>  {item.middleName}</td>
                 <td>    {item.lastName}</td>
                 
                 
                 <td>  {item.contact}</td>
                 <td>   {item.adharNo}</td>
                 <td>   {item.gender} </td>

                 
          
            </tr>
                    
          ))
        : "No users"}
           
           </tbody>
          </table>
            
      
  </div>
 );
};
export default UserList;
