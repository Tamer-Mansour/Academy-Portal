import "./App.css";
import Footer from "./components/footer/Footer";
import Header from "./components/header/Header";
import ResetPassword from "./components/resetPassword/ResetPassword";
import Signin from "./components/signin/Signin";
import StudentList from "./student/StudentList";
import ChangePassword from "./components/changePassword/ChangePassword"
import SideBar from "./components/SideBar/SideBar";
import { BrowserRouter as Router, Route,Routes  } from "react-router-dom";
import  Dashboard  from "./components/Dashborad/Dashborad";

function App() {
    return ( 
        <div className="App">
             
             {/*
            <Signin/>
      <Footer /> 
      <StudentList/> */}
     
     <div style={{display:"flex"}}>
     
     <Router>
       <SideBar/>
      </Router>
      
    
     <div  style={{display:"inline"}}>
     <Header/>
     <Dashboard/>
     </div>
     </div>
  
        </div>
           
       
    );
}

export default App;