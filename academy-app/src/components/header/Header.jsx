import React, { useEffect, useState } from "react";
import "./Header.css";
import SearchIcon from "@mui/icons-material/Search";
import EmailIcon from "@mui/icons-material/Email";
import SettingsIcon from "@mui/icons-material/Settings";
import NotificationsIcon from "@mui/icons-material/Notifications";
import logo from "../../assets/AXSOSAcademy.png";
import Menu from "@mui/material/Menu";
import MenuItem from "@mui/material/MenuItem";
import axios from "axios";

function Header() {
  const [anchorEl, setAnchorEl] = useState(null);
  const [perfume, setPerfume] = useState([]);
  const [search, setSearch] = useState("");
  const [filteredPerfumes, setFilteredPerfumes] = useState([]);
  useEffect(() => {
    axios
      .get("http://localhost:8080/api/students")
      .then((res) => {
        setPerfume(res.data);
      })
      .catch((err) => {
        console.log(err);
      });
  }, []);

  useEffect(() => {
    setFilteredPerfumes(
      perfume.filter((perfume) =>
        perfume.name.toLowerCase().includes(search.toLowerCase())
      )
    );
  }, [search, perfume]);
  const open = Boolean(anchorEl);
  const handleClick = (event) => {
    setAnchorEl(event.currentTarget);
  };
  const handleClose = () => {
    setAnchorEl(null);
  };

  return (
    <>
      {/* navbar */}
      <nav className="fullNav">
        <div class="headerContainer ">
          {/* logo and search */}
          <div className="liftBar">
            <img src={logo} alt="academyLogo" className="academy-logo" />
            <div className="searchBox">
              <SearchIcon className="searchIcon" />
              <input
                type="text"
                placeholder="Search"
                className="searchInput"
                onChange={(e) => setSearch(e.target.value)}
              />
              {/* <Search/> */}
            </div>
          </div>
          {/* left and icons */}
          <div className="rightBar">
            <div className="headerIcons justify-content-end">
              <div className="iconItem">
                <EmailIcon />
                <span className="topbarIconBadge">2</span>
              </div>
              <div className="iconItem">
                <NotificationsIcon />
                <span className="topbarIconBadge">2</span>
              </div>
              {/* drop down list */}
              <div className="iconItem d-flex">
                <SettingsIcon id="fade-button" onClick={handleClick} />
                <Menu
                  id="fade-menu"
                  anchorEl={anchorEl}
                  open={open}
                  onClose={handleClose}
                >
                  <div className="selectColor">
                    <MenuItem style={{ fontFamily: "Dosis" }}> Portal</MenuItem>
                    <MenuItem style={{ fontFamily: "Dosis" }}>
                      Sign Out
                    </MenuItem>
                  </div>
                </Menu>
              </div>
            </div>
          </div>
        </div>
      </nav>
      {/* {filteredPerfumes.map((perfume, idx) => (
        <>
        <PerfumeList key={idx} {...perfume} />
        </>
      ))} */}
    </>
  );
}
// const PerfumeList = (props) => {
//   const { name } = props;
//   return (
//     <>
//       <p className="sea">
//         <a style={{ color: "black" }} href="#">
//           {name}
//         </a>
//       </p>
//     </>
//   );
// };
export default Header;
