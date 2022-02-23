import React from "react";
import "./Signin.css";
import logo from "../../assets/AXSOSAcademy.png";
import lang from "../../assets/Lang.png";

function Signin() {
  return (
    <>
      {/* navbar */}
      <nav className="navbar navbar-expand-lg navbar-light  py-3 py-lg-4 d-flex justify-content-end bacCol">
        <span> English (USA) </span> &nbsp; &nbsp;
        <img src={lang} alt="Language_Icon" className="language-icon-1" />
        <div className="navbar-text"></div>
      </nav>
      {/* logo part */}
      <div className="allSigninPage">
        <div className="container pt-5 mt-5 mb-1 pb-3">
          <div className="row">
            <div className="col-md-6 text-center line11 ">
              <img
                src={logo}
                className="axsos-academy-logo-01-png"
                alt="Axsos-logo"
              />
              <p className="paragraph-52 ">AXSOS Academy Portal Manager</p>
            </div>
            {/* virtical line */}
            <span class="col"></span>
            {/* form part */}
            <div className="col-md-5 mt-3 justify-content-end">
              <p className="paragraph-21">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla
                quam velit, vulputate eu pharetra nec, mattis ac neque.
              </p>
              <form>
                <div className="form-group row">
                  <label className="col-sm-2 col-form-label labels">
                    Username
                  </label>
                  <div className="col-sm-10">
                    <input
                      type="text"
                      className="form-control"
                      id="inputPassword"
                      placeholder="Username"
                      required
                    />
                  </div>
                </div>
                <div className="form-group row">
                  <label for="inputPassword" className="col-sm-2 labels ">
                    Password{" "}
                  </label>
                  <div className="col-sm-10">
                    <input
                      type="password"
                      className="form-control"
                      id="inputPassword"
                      placeholder="Password"
                      required
                    />
                  </div>
                </div>
                <div className="form-group row">
                  <label className="col-sm-2"></label>
                  <div className="col-sm-10">
                    <button type="submit" className="btn btn-primary btn-block">
                      SIGN IN TO PORTAL
                    </button>
                  </div>
                </div>
                <div className="form-group row">
                  <label className="col-sm-2"></label>
                  <div className="col-sm-10">
                    <div className="row">
                      <div className="col-sm-6">
                        <div className="form-check">
                          <input
                            className="form-check-input"
                            type="checkbox"
                            value=""
                            id="flexCheckDefault"
                          />
                          <label
                            className="form-check-label"
                            for="flexCheckDefault"
                          >
                            Remember me
                          </label>
                        </div>
                      </div>
                      <div className="col-sm-6 justify-content-end">
                        <label>
                          <a className="labMar" href="/forget" style={{ color: "#691489" }}>
                            Forgot my Password?
                          </a>
                        </label>
                      </div>
                    </div>
                  </div>
                </div>
                <div className="form-check"></div>
              </form>
            </div>
          </div>
        </div>
        <div class="container-fluid mt-6"></div>
      </div>
    </>
  );
}

export default Signin;
