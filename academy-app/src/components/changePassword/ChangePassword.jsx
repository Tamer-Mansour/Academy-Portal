import React, { useEffect, useState } from "react";
import "./ChangePassword.css";
import logo from "../../assets/AXSOSAcademy.png";
import lang from "../../assets/Lang.png";
import Footer from "../footer/Footer";

function ChangePassword() {
  const [formErrors, setFormErrors] = useState({});
  const [isSubmit, setIsSubmit] = useState(false);
  const [password, setPassword] = useState("");
  const [confirmPassword, setConfirmPassword] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    setFormErrors(validate());
    setIsSubmit(true);
  };

  useEffect(() => {
    console.log(formErrors);
    if (Object.keys(formErrors).length === 0 && isSubmit) {
      console.log();
    }
  }, [formErrors]);
  const validate = () => {
    const errors = {};
    if (!password) {
      errors.password = "Password is required";
    } else if (password.length > 20) {
      errors.password = "Password cannot exceed more than 20 characters";
    } else if (password.length < 5) {
      errors.password = "Password must be more than 5 characters";
    } else if (!confirmPassword) {
      errors.confirmPassword = "Password is required";
    } else if (password !== confirmPassword) {
      errors.confirmPassword = "Password dose not match";
    }
    return errors;
  };

  return (
    <>
      {/* navbar */}
      <nav className="navbar navbar-expand-lg navbar-light  py-3 py-lg-4 d-flex justify-content-end bacCol">
        <span> English (USA) </span> &nbsp; &nbsp;
        <img src={lang} alt="Language_Icon" className="language-icon" />
        <div className="navbar-text"></div>
      </nav>
      {/* logo part */}
      <div className="allPage">
        <div className="container">
          <div className="row">
            <div className="col-md-6 text-center Vline ">
              <img
                src={logo}
                className="the-axsos-logo"
                alt="Axsos-logo"
              />
              <p className="AxsosParagraph ">AXSOS Academy Portal Manager</p>
            </div>
            {/* virtical line */}
            <p className="col-md-1"></p>
            {/* form part */}
            <div className="col-md-5 mt-3 " style={{ padding: "0" }}>
              <p className="paragraph-21 ">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla
                quam velit, vulputate eu pharetra nec, mattis ac neque.
              </p>
              <form onSubmit={handleSubmit}>
                <div className="form-group row">
                  <label className="col-sm-5 col-form-label labels">
                    Password
                  </label>
                  <div className="col-sm-7">
                    <input
                      type="password"
                      className="form-control"
                      name="password"
                      placeholder="Password"
                      onChange={(e) => {
                        setPassword(e.target.value);
                      }}
                    />
                    <p className="errors">{formErrors.password}</p>
                  </div>
                </div>
                <div className="form-group row">
                  <label className="col-sm-5 col-form-label labels ">
                    Confirm New Password{" "}
                  </label>
                  <div className="col-sm-7">
                    <input
                      type="password"
                      name="confirmPassword"
                      className="form-control"
                      placeholder="Confirm Password"
                      onChange={(e) => {
                        setConfirmPassword(e.target.value);
                      }}
                    />
                    <p className="errors">{formErrors.confirmPassword}</p>
                  </div>
                </div>
                <div className="form-group row">
                  <label className="col-sm-5"></label>
                  <div className="col-sm-7">
                    <button type="submit" className="btn btn-primary btn-block">
                      CHANGE PASSWORD
                    </button>
                  </div>
                </div>
                <div className="form-group row">
                  <label className="col-sm-2"></label>
                  <div className="col-sm-10">
                    <div className="row">
                      <div className="col-sm-6"></div>
                      <div className="col-sm-6 justify-content-end">
                        <label>
                          <a
                            className="backbtn"
                            href="/signin"
                            style={{ color: "#691489" }}
                          >
                            Back to Sign In!
                          </a>
                        </label>
                      </div>
                    </div>
                  </div>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
      <Footer />
    </>
  );
}

export default ChangePassword;
