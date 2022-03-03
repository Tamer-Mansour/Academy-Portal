import "./App.css";
import Footer from "./components/footer/Footer";
import Header from "./components/header/Header";
import ResetPassword from "./components/resetPassword/ResetPassword";
import Signin from "./components/signin/Signin";
import StudentList from "./student/StudentList";
import ChangePassword from "./components/changePassword/ChangePassword"


function App() {
  return (
    <div className="App">
      {/* <Header/>
      <Signin/>
      <Footer /> */}
      {/* <Student /> */}
      {/* <StudentList/> */}
      {/* <ResetPassword/> */}
      <ChangePassword/>
    </div>
  );
}

export default App;
