import "./App.css";
import Footer from "./components/footer/Footer";
import Header from "./components/header/Header";
import ResetPassword from "./components/resetPassword/ResetPassword";
import Signin from "./components/signin/Signin";
import StudentList from "./student/StudentList";
import ChangePassword from "./components/changePassword/ChangePassword"
import SideBar from "./components/SideBar/SideBar";
import { BrowserRouter as Router, Route,Routes  } from "react-router-dom";
function App() {
    return ( 
        <div className="App">
            {/* <Header/>
            <Signin/>
      <Footer /> 
      <StudentList/> */}
     
      <Router>
       <SideBar/>
      </Router>
  
        </div>
      
    );
}

export default App;