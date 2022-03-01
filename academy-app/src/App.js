import "./App.css";
import Footer from "./components/footer/Footer";
import Header from "./components/header/Header";
import Signin from "./components/signin/Signin";
import StudentList from "./student/StudentList";


function App() {
  return (
    <div className="App">
      <Header/>
      {/* <Signin/> */}
      <Footer />
      {/* <Student /> */}
      {/* <StudentList/> */}
    </div>
  );
}

export default App;
