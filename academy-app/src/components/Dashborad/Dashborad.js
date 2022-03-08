import "./DashStyle.css";
import BlurOnIcon from '@mui/icons-material/BlurOn';
import images from "../../assets/images.png";
function Dashborad() {
    return (
        <>
        <label className="label-1">Dashboard</label>
        <h1 className="label-1-1">Dashboard</h1>
        <div >
            <label>Courrent ongoing Cohorts & Tracks</label>
         <div>
             <div className="rectangle-49">
             <table >
                
             <tr >
    <th  className="combo-box-4" >Track Name </th>
    <th  className="combo-box-4">Cohorts #</th>
    <th  className="combo-box-4"> StartDate</th>
    <th  className="combo-box-4">  # of Students</th>
  </tr>

  
  <tr className="rectangle-3">
    <td className="heading-10">Full-stack Develpoment</td>
    <td className="heading-9" >3</td>
    <td className="heading-49" >000.00.000</td>
    <td className="heading-51">122</td>
  </tr>

  <tr className="rectangle-6" >
    <td  className="heading-10" >Data Science  </td>
    <td className="heading-9">7</td>
    <td  className="heading-49"  >000.00.000</td>
    <td className="heading-51">33</td>
  </tr>
  <tr  className="rectangle-9" >
    <td  className="heading-10" >Full-stack Develpoment</td>
    <td className="heading-9">8</td>
    <td className="heading-49" >000.00.000</td>
    <td className="heading-51">98</td>
  </tr>
  
                  
                  
             </table>
             </div>
         </div>
         {/**Log Attendance  */}
        <div className="rectangle-5 ">
            
            <label className="label-6">Log Attendance </label>
            <BlurOnIcon className="blur-on-icon-1" />
            <p className="paragraph-41">---------------------</p>
            
        </div>
          {/**Graduates statistics  */}
          <div className="rectangle-27 ">
            <label className="label-36">Graduates statistics</label>
            <BlurOnIcon className="blur-on-icon-2" />
            <img src={images} className="img1"/>
           
            <table>
                <tr>
                    <th className="rectangle-45"></th>
                    <th>Not Employed</th>
                    <th>50%</th>
                    <th>27 of 667</th>
                </tr>
                <tr >
                    <td className="rectangle-38"></td>
                    <td>Cant be employed</td>
                    <td>06.8%</td>
                    <td>21 of 667</td>
                </tr>
                <tr>
                    <td className="rectangle-44"></td>
                    <td>Withdraw</td>
                    <td>06.8%</td>
                    <td>18 of 667</td>
                </tr>
                <tr>
                    <td className="rectangle-37"></td>
                    <td>Employed</td>
                    <td>06.8%</td>
                  
                </tr>

            </table>
        </div>
       

          {/**Calendar Reminders   */}
        <div className="rectangle-8">
             
        
     <label className="label-9"> Calendar Reminders</label>
     <BlurOnIcon className="blur-on-icon-3" />

     <div style={{display:"flex"}}>
     <lable className="label-14"> Oct. 15th</lable>
     <div className="rectangle-13"></div>
     <div style={{display:"block"}}>
     <lable className="label-13"> Career Day for 2nd Cohort</lable>
     <label  className="label-12"> National School</label>
     </div>
     
     </div>
     
    
     <div style={{display:"flex"}}>
     <lable className="label-14"> Oct. 15th</lable>
     <div className="rectangle-13"></div>
     <div style={{marginTop:"-10px"}}>
     <lable className="label-13"> FSD-CO2 Graduation Day</lable>
     <label  className="label-12"> National School</label>
     </div>
     </div>

     <div style={{display:"flex"}}>
     <lable className="label-14"> Oct. 15th</lable>
     <div className="rectangle-13"></div>
     <div style={{marginTop:"-10px"}}>
     <lable className="label-13"> FSD-CO3 First Day </lable>
     <label  className="label-12"> National School</label>
     </div>
     </div>

        </div>

        
         <div >
            
      
         
         <div className="rectangle-545">
         <div style={{marginTop:"-37px"}}>
             <label >System Activities ()</label>
             </div>
             <table >
                
             <tr >
    <th  className="combo-box-4" >Track Name </th>
    <th  className="combo-box-4">Cohorts #</th>
    <th  className="combo-box-4"> StartDate</th>
    <th  className="combo-box-4">  # of Students</th>
  </tr>

  
  <tr className="rectangle-3">
    <td className="heading-10">Full-stack Develpoment</td>
    <td className="heading-9" >3</td>
    <td className="heading-49" >000.00.000</td>
    <td className="heading-51">122</td>
  </tr>

  <tr className="rectangle-6" >
    <td  className="heading-10" >Data Science  </td>
    <td className="heading-9">7</td>
    <td  className="heading-49"  >000.00.000</td>
    <td className="heading-51">33</td>
  </tr>
  <tr  className="rectangle-9" >
    <td  className="heading-10" >Full-stack Develpoment</td>
    <td className="heading-9">8</td>
    <td className="heading-49" >000.00.000</td>
    <td className="heading-51">98</td>
  </tr>
  
                  
                  
             </table>
             </div>

         </div>

      </div>
        
        </>
       
      
    );
}
export default Dashborad;