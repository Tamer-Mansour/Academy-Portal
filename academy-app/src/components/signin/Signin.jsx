import React, { useEffect, useState } from "react";
import "./Signin.css";
import logo from "../../assets/AXSOSAcademy.png";
import lang from "../../assets/Lang.png";

function Signin() {
  const initialValues = { username: "", email: "", password: "" };
  const [formValues, setFormValues] = useState(initialValues);
  const [formErrors, setFormErrors] = useState({});
  const [isSubmit, setIsSubmit] = useState(false);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormValues({ ...formValues, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    setFormErrors(validate(formValues));
    setIsSubmit(true);
  };

  useEffect(() => {
    console.log(formErrors);
    if (Object.keys(formErrors).length === 0 && isSubmit) {
      console.log(formValues);
    }
  }, [formErrors]);
  const validate = (values) => {
    const errors = {};
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/i;
    if (!values.username) {
      errors.username = "Username is required!";
    }
    if (!values.email) {
      errors.email = "Email is required!";
    } else if (!regex.test(values.email)) {
      errors.email = "This is not a valid email format!";
    }
    if (!values.password) {
      errors.password = "Password is required";
    } else if (values.password.length < 4) {
      errors.password = "Password must be more than 4 characters";
    } else if (values.password.length > 10) {
      errors.password = "Password cannot exceed more than 10 characters";
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
            <span className="col"></span>
            {/* form part */}
            <div className="col-md-5 mt-3 justify-content-end">
              <p className="paragraph-21">
                Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla
                quam velit, vulputate eu pharetra nec, mattis ac neque.
              </p>
              <form onSubmit={handleSubmit}  >
                <div className="form-group row">
                  <label className="col-sm-2 col-form-label labels">
                    Username
                  </label>
                  <div className="col-sm-10">
                    <input
                      type="email"
                      className="form-control"
                      name="email"
                      placeholder="username"
                      value={formValues.email}
                      onChange={handleChange}
                      required

                    />
                    <p className="errors">{formErrors.email}</p>

                  </div>
                </div>
                <div className="form-group row">
                  <label for="inputPassword" className="col-sm-2 labels ">
                    Password{" "}
                  </label>
                  <div className="col-sm-10">
                    <input
                      type="password"
                      name="password"
                      className="form-control"
                      placeholder="Password"
                      value={formValues.password}
                      onChange={handleChange}
                      required
                    />
                    <p className="errors">{formErrors.password}</p>

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
                           
                            id="flexCheckDefault"
                            value={formValues.password}
                            onChange={handleChange}
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
      </div>
    </>
  );
}

export default Signin;
