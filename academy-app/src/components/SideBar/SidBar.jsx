import { NavLink } from "react-router-dom";
import { MdAssignmentInd, MdFaceUnlock, MdLanguage, MdMessage, MdQuestionAnswer, MdSupervisorAccount } from "react-icons/md";
import { AiFillDashboard, AiFillDatabase, AiFillHeart, AiFillPushpin } from "react-icons/ai";
import { useState } from "react";
import { AnimatePresence, motion } from "framer-motion";

import "./style.css"
import Image_3 from "../../assets/Image_3.png";
import CircleIcon from '@mui/icons-material/Circle';
import SidebarMenu from "./SideBarMenu";

const routes = [
    {
        path: "/",
        name: "Dashboard",
        icon: <AiFillDashboard />,
    },
    {
        path: "/Recruitment",
        name: "Recruitment",
        icon: <AiFillDatabase />,
        subRoutes: [
            {
                path: "/Recruitment/Job Profile",
                name: "Job Profile ",
            },
            {
                path: "/Recruitment/Vacancies",
                name: "Vacancies",
            },
            {
                path: "/Recruitment/Job Applications",
                name: "Job Applications",
            },
            {
                path: "/Recruitment/Skills",
                name: "Skills ",
            },
            {
                path: "/Recruitment/DDRP",
                name: "DDRP",
            },
            {
                path: "/Recruitment/E-mails Newsletters",
                name: "E-mails Newsletters",
            },
            {
                path: "/Recruitment/Newsletters",
                name: "Newsletters ",
            },
            {
                path: "/Recruitment/Vocabulary",
                name: "Vocabulary",
            },
        ],

    },
    {
        path: "/Language",
        name: "Language",
        icon: <MdLanguage />,
    },
    {
        path: "/Development & review",
        name: "Development & review",
        icon: <MdSupervisorAccount />,
    },
    {
        path: "/Feedback",
        name: "Feedback",
        icon: <MdQuestionAnswer />,
        subRoutes: [
            {
                path: "Feedback/Personal",
                name: "Personal Task List",
            },
            {
                path: "Feedback/Pending",
                name: "Pending Feedback",
            },
            {
                path: "Feedback/Companies",
                name: "Companies",
            },
            {
                path: "Feedback/Statistics",
                name: "Statistics",
            },
            {
                path: "Feedback/Testimonials",
                name: "Testimonials",
            },
        ]
    },

    {
        path: "/Employees",
        name: "Employees",
        icon: <AiFillHeart />,
        subRoutes: [
            {
                path: "Employees/Personal",
                name: "Personal Task List",
            },
            {
                path: "Employees/Pending",
                name: "Pending Tasks",
            },
            {
                path: "Employees/Employees List",
                name: "Employees List",
            },
            {
                path: "Employees/Prepartion",
                name: "Prepartion Activties",
            },
            {
                path: "Employees/Statistics",
                name: "Statistics",
            },
        ]
    },
    {
        path: "/Customer",
        name: "Customer",
        icon: <MdFaceUnlock />,
    },
    {
        path: "/Master Data",
        name: "Master Data",
        icon: <MdAssignmentInd />,
        subRoutes: [
            {
                path: "Master Data/Regions",
                name: "Regions",
            },
            {
                path: "Master Data/Business Unit",
                name: "Business Unit",
            },
            {
                path: "Master Data/Departments",
                name: "Departments",
            },
            {
                path: "Master Data/Cost Centers",
                name: "Cost Centers",
            },
            {
                path: "Master Data/Reporting",
                name: "Reporting Mapping(NAV)",
            },
            {
                path: "Master Data/Customers",
                name: "Customers",
            },
            {
                path: "Master Data/Projects",
                name: "Projects",
            },
        ]
    },
    {
        path: "/Permissions&Access Roles",
        name: "Permissions&Access Roles",
        icon: <MdFaceUnlock />,
    },
    {
        path: "/Careers",
        name: "Careers",
        icon: <MdAssignmentInd />,
    },
];

const SideBar = ({ children }) => {
    const [isOpen, setIsOpen] = useState(false);
    const toggle = () => setIsOpen(!isOpen);

    const showAnimation = {
        hidden: {
            width: 0,
            opacity: 0,
            transition: {
                duration: 0.1,
            },
        },
        show: {
            opacity: 1,
            width: "300px",
            transition: {
                duration: 0.5,
            },
        },
    };

    return (
        <>



            <div className="main-container">



                <motion.div

                    animate={{
                        width: isOpen ? "250px" : "50px",
                        height: isOpen ? "900px" : "800px",
                        transition: {
                            duration: 0.5,
                            type: "spring",
                            damping: 10,

                        },
                    }}
                    className="sidebar "
                >


                    <div className="top_section">
                        {/* <AnimatePresence>
                            {isOpen && (
                                <motion.h1
                                    variants={showAnimation}
                                    initial="hidden"
                                    animate="show"
                                    exit="hidden"
                                    className="logo"
                                >

                                </motion.h1>
                            )}
                        </AnimatePresence> */}
                        <AnimatePresence>
                            {isOpen && (
                                <motion.div
                                    variants={showAnimation}
                                    initial="hidden"
                                    animate="show"
                                    exit="hidden"

                                >
                                    <img src={Image_3} style={{ marginLeft: "70px" }} />
                                    <p style={{ marginLeft: "50px" }}> Master Admin</p>



                                </motion.div>
                            )}

                        </AnimatePresence>
                        <AnimatePresence >
                            {isOpen && (
                                <motion.div
                                    initial="hidden"
                                    animate="show"
                                    exit="hidden"
                                    animate={{
                                    }}
                                >

                                </motion.div>
                            )}

                            <CircleIcon style={{ color: "green", marginTop: "105px",borderRadius:"50px" }} />


                        </AnimatePresence>
                        <AnimatePresence>

                            {isOpen && (
                                <motion.div
                                    variants={showAnimation}
                                    initial="hidden"
                                    animate="show"
                                    exit="hidden"

                                >
                                    <div style={{ display: "flex", marginTop: "120px" }}>
                                        <p style={{ marginLeft: "-90px", }} >Available</p>
                                    </div>


                                </motion.div>


                            )}

                        </AnimatePresence>


                        {/* pin icon: open, close */}
                        <div className="bars" onClick={toggle}>

                            <AiFillPushpin />

                        </div>

                    </div>

                    {/*  */}


                    {/*  */}
                    {/* icons for sidebar */}
                    <section className="routes">

                        {routes.map((route, index) => {
                            if (route.subRoutes) {
                                return (
                                    <SidebarMenu
                                        setIsOpen={setIsOpen}
                                        route={route}
                                        showAnimation={showAnimation}
                                        isOpen={isOpen}

                                    />
                                );
                            }

                            return (
                                <NavLink
                                    to={route.path}
                                    key={index}
                                    className="link"
                                    activeClassName="active"
                                >
                                    <AnimatePresence>
                                        {isOpen && (
                                            <motion.div
                                                variants={showAnimation}
                                                initial="hidden"
                                                animate="show"
                                                exit="hidden"
                                                className="link_text"

                                            >
                                                {route.name}
                                            </motion.div>
                                        )}
                                    </AnimatePresence>
                                    <div className="icon">{route.icon}</div>
                                </NavLink>
                            );
                        })}
                    </section>
                    <p className="sideFooter">
                        Axsos &copy; {new Date().getFullYear()}
                    </p>
                </motion.div>

                <main>{children}</main>
            </div>
        </>
    );
};

export default SideBar;
