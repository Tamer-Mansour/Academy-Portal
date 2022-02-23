import "./App.css";
import Footer from "./components/footer/Footer";
import Header from "./components/header/Header";
import Signin from "./components/signin/Signin";

function App() {
  return (
    <div className="App">
      {/* <Header/> */}
      <Signin/>
      <Footer />

    </div>
  );
}

export default App;
