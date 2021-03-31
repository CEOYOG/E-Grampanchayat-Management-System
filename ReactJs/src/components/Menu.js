import React from "react";
import { ListGroup , ListGroupItem } from "reactstrap";
const Menu=()=> {
    return (
        <ListGroup>
        <ListGroupItem tag="a" href="/" action>
            Home
        </ListGroupItem>
        <ListGroupItem tag="a" href="/panchayatbody" action>
        PanchayatBody
        </ListGroupItem>
        <ListGroupItem tag="a" href="/allschemes" action>
        Allschemes
        </ListGroupItem>
        <ListGroupItem tag="a" href="/superadmin" action>
        SuperAdmin
        </ListGroupItem>
        
        
        
        <ListGroupItem tag="a" href="/gdo" action>
            GDO
        </ListGroupItem>
        <ListGroupItem tag="a" href="/userlogin" action>
            UserLogin
        </ListGroupItem>
        <ListGroupItem tag="a" href="/register" action>
            VillagersRegister
        </ListGroupItem>
        <ListGroupItem tag="a" href="/login" action>
            Login
        </ListGroupItem>
        
        
        <ListGroupItem tag="a" href="/alldocument" action>
            AllDocument
        </ListGroupItem>
        
        <ListGroupItem tag="a" href="/allbills" action>
            AllBills
        </ListGroupItem>
        
        <ListGroupItem tag="a" href="/application" action>
            Application
        </ListGroupItem>
        
        
        <ListGroupItem tag="a" href="/userlist" action>
            UserList
        </ListGroupItem>
        </ListGroup>
    )
}
export default Menu;
