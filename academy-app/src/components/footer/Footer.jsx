import React from "react";
import "./Footer.css";

function Footer() {
  var date = new Date();
  var year = date.getFullYear();
  return (
    <>
      <div class="footer">
        <p className="footerText" style={{ color: "#5a7bb0" }}>
          {" "}
          Copyright &copy; AXSOS AG {year}. All rights reserved
        </p>
      </div>
    </>
  );
}

export default Footer;
