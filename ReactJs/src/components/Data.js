
import React , {Component} from "react";
import {Button} from "reactstrap";
import jsPDF from "jspdf";


class Data extends Component {
    pdfGenerator=()=>{
        var doc=new jsPDF('landscape','px','a4','false');
        doc.setFont('Helvertica','bold')
        doc.text(60,60,'Name')
        doc.text(60,80,'Email')
        doc.text(60,60,'Mobile No')
        doc.setFont('Helvertica','Normal')
        doc.text(100,60,'Smital')
        doc.text(100,80,'smit@gmail.com')
        doc.text(120,100,'1222737389')

        doc.save('a.pdf')
    }
   render(){
       return(
           <div style={{textAlign:'center'}}><br/>
           <Button onclick={this.pdfGenerator}>Download pdf</Button>
           </div>
           );
       }
   }

export default Data;

    
