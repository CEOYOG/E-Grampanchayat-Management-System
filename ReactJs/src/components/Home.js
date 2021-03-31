import React , {useEffect} from "react";
import { Jumbotron,Container,Button } from "reactstrap";
const Home = () => {
    useEffect(()=>{
        document.title= "Home || Welcome to Grampanchayat";
    }, []);
return(
    <div>
        <Jumbotron className="text-center">
        <h1>Grampanchayat Information </h1>
        <p></p> 
        <Container>
            <Button color="primary">Start using</Button>
        </Container>
        </Jumbotron>
    </div>
);
}
export default Home;