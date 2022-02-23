import axios from "axios";
import React, { useEffect, useState } from "react";

function StudentList() {
  const [students, setStudents] = useState([]);
  useEffect(() => {
    axios.get(`http://localhost:8080/api/students`).then((response) => {
      setStudents(response.data);
      console.log(response.data);
    });
  }, []);

  return (
    <>
      <div>
        <h1>hi</h1>
        {students.length > 0 &&
          students.map((student, index) => {
            return (
              <div key={index}>
                <table className="table table-striped table-bordered">
                  <thead>
                    <tr>
                      <th> Student personalId</th>
                      <th> Student name</th>
                      <th> Student email</th>
                      <th> Student createdAt</th>
                      <th> Student updatedAt</th>
                      <th> Student city</th>
                      <th> Student password</th>
                      <th> Student passwordConfirmation</th>
                      <th> Student gender</th>
                      <th> Student roles</th>
                      <th> Student phoneNumber</th>
                      <th> Student educationalBackground</th>
                      <th> Student emergencyContact</th>
                      <th> Student allergyAndDiet</th>
                      <th> Student notes</th>
                      <th> Student status</th>
                      <th> Student dateOfBirth</th>
                      <th> Student instructor</th>
                      <th> Student studentNumber</th>
                      <th> Student githubAccount</th>
                      <th> Student linkedInProfile</th>
                      <th> Student technicalExperience</th>
                      <th> Student technicalsToImprove</th>
                      <th> Student personalToImprove</th>
                      <th> Student personalSkills</th>{" "}
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <th>{student.personalId} </th>
                      <td> {student.name} </td>
                      <td> {student.email}</td>
                      <td> {student.createdAt}</td>
                      <td> {student.updatedAt}</td>
                      <td> {student.city}</td>
                      <td> {student.password}</td>
                      <td> {student.passwordConfirmation}</td>
                      <td> {student.gender}</td>
                      <td> {student.roles}</td>
                      <td> {student.phoneNumber}</td>
                      <td> {student.educationalBackground}</td>
                      <td> {student.emergencyContact}</td>
                      <td> {student.allergyAndDiet}</td>
                      <td> {student.notes}</td>
                      <td> {student.status}</td>
                      <td> {student.dateOfBirth}</td>
                      <td> {student.instructor}</td>
                      <td> {student.studentNumber}</td>
                      <td> {student.githubAccount}</td>
                      <td> {student.linkedInProfile}</td>
                      <td> {student.technicalExperience}</td>
                      <td> {student.firstDay}</td>
                      <td> {student.technicalsToImprove}</td>
                      <td> {student.personalToImprove}</td>
                      <td> {student.personalSkills}</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            );
          })}
      </div>
    </>
  );
}

export default StudentList;
