import React from "react";
import logo from "./logo.svg";
import "./App.css";
import { Button, Container, Row, Col } from "reactstrap";
import { ToastContainer, toast } from "react-toastify";
import { BrowserRouter as Router, Route } from "react-router-dom";
import Header from "./components/Header";
import Menu from "./components/Menu";
import Home from "./components/Home";
import Scheme from "./components/Scheme";
import Allschemes from "./components/Allschemes";
import Bill from "./components/Bill";
import AllBills from "./components/AllBills";
import AllDocument from "./components/AllDocument";
import AddApplication from "./components/AddApplication";
import Application from "./components/Application";
import SuperAdmin from "./components/SuperAdmin";
import Gdo from "./components/Gdo";
import AddGdo from "./components/AddGdo";
import VillagersRegister from "./components/VillagersRegister";
import Login from "./components/Login";
import Admin from "./components/Admin";
import Logout from "./components/Logout";
import AddScheme from "./components/AddScheme";
import AddSuperAdmin from "./components/AddSuperAdmin";
import UserLogin from "./components/UserLogin";
import UserList from "./components/UserList";
import AddDocument from "./components/AddDocument";
import AddMember from "./components/AddMember";
import PanchayatBody from "./components/PanchayatBody";
import Data from "./components/Data";





function App() {
  return (
    <div className="App">
      <Router>
        <ToastContainer />

        <Container>
          <Header></Header>
          <Row>
            <Col md={2}>
              <Menu />
              
            </Col>
            <Col md={8}>
              <Route path="/" component={Home} exact />
              <Route path="/scheme" component={Scheme} exact />
              <Route path="/addscheme" component={AddScheme} exact />
              <Route path="/addsuperAdmin" component={AddSuperAdmin}exact/>
              <Route path="/userlogin" component={UserLogin} exact />
              <Route path="/adddocument" component={AddDocument} exact />
              <Route path="/alldocument" component={AllDocument} exact />
              <Route path="/gdo" component={Gdo} exact />
              <Route path="/register" component={VillagersRegister} exact />
              <Route path="/login" component={Login} exact />
              <Route path="/logout" component={Logout} />
              <Route path="/admin" component={Admin} />
              <Route path="/allschemes" component={Allschemes} exact />
              <Route path="/bill" component={Bill} exact />
              <Route path="/allbills" component={AllBills} exact />
              <Route path="/application" component={Application} exact />
              <Route path="/addapplication" component={AddApplication} exact />
              <Route path="/addgdo" component={AddGdo} exact />
              <Route path="/userlist" component={UserList} exact />
              <Route path="/superAdmin" component={SuperAdmin} exact />
              <Route path="/addmember" component={AddMember} exact />
              <Route path="/panchayatBody" component={PanchayatBody} exact />
              <Route path="/data" component={Data} exact />
            </Col>
          </Row>
        </Container>
      </Router>
    </div>
  );
}

export default App;
