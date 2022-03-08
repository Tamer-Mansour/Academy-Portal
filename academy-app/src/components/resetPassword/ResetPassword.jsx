import React, { useEffect, useState } from "react";
import "./ResetPassword.css";
import logo from "../../assets/AXSOSAcademy.png";
import lang from "../../assets/Lang.png";
import Footer from "../footer/Footer";

function ResetPassword() {
  const [formErrors, setFormErrors] = useState({});
  const [isSubmit, setIsSubmit] = useState(false);
  const [email, setEmail] = useState("");

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
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/i;

    if (!email) {
      errors.email = "Username is required!";
    } else if (!regex.test(email)) {
      errors.email = "This is not a valid email format!";
    }
    return errors;
  };

  return (
    <>
      {/* navbar */}
      <nav className="navbar navbar-expand-lg navbar-light  py-3 py-lg-4 d-flex justify-content-end bacCol">
        <span> English (USA) </span> &nbsp; &nbsp;
        <img src={lang} alt="Language_Icon" className="language-icon-1" />
        <div className="navbar-text"></div>
      </nav>
      {/* logo part */}
      <div className="allMyPage ">
        <div className="container sizing">
          <div className="row">
            <div className="col-md-6 text-center V-line ">
              <img
                src={logo}
                className="the-axsos"
                alt="Axsos-logo"
              />
              <p className="AxsosParagraph">AXSOS Academy Portal Manager</p>
            </div>
            {/* virtical line */}
            <p className="col-md-1"></p>
            {/* form part */}
            <div className="col-md-5 mt-3 " style={{ padding: "0" }}>
              <p className="paragraph-21">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla
                quam velit, vulputate eu pharetra nec, mattis ac neque.
              </p>
              <form onSubmit={handleSubmit}>
                <div className="form-group row">
                  <label className="col-sm-2 col-form-label labels">
                    Username
                  </label>
                  <div className="col-sm-9">
                    <input
                      type="email"
                      className="form-control"
                      name="email"
                      placeholder="username"
                      onChange={(e) => {
                        setEmail(e.target.value);
                      }}
                    />
                    <p className="errors">{formErrors.email}</p>
                  </div>
                </div>
                <div className="form-group row">
                  <label className="col-sm-2"></label>
                  <div className="col-sm-9">
                    <button type="submit" className="btn btn-primary btn-block">
                      SEND ME EMAIL TO RESET PASSWORD
                    </button>
                  </div>
                </div>
                <div className="form-group row">
                  <label className="col-sm-2"></label>
                  <div className="col-sm-10">
                    <div className="row">
                      <div className="col-sm-6">
                        <div className="form-check"></div>
                      </div>
                      <div className="col-sm-6 justify-content-end">
                        <label>
                          <a
                            className="backbtnToSignin"
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

export default ResetPassword;
