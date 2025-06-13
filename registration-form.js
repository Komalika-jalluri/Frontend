
//form.js

function Forms()
{
    return(
        <div>
        <form>
            <h1 align="center"><b>REGISTRATION FORM</b></h1>
            <fieldset>
                <table>
                    <tr>
                        <td><label><b>First Name:</b></label></td>
                        <td><input type="text" autofocus placeholder="First name"/></td>
                    </tr>
                    <tr>
                        <td><label><b>Last Name:</b></label></td>
                        <td><input type="text" placeholder="Last name"/></td>
                    </tr>
                    <tr>
                        <td><label><b>Email ID:</b></label></td>
                        <td><input type="email" placeholder="Enter email"/></td>
                    </tr>
                    <tr>
                        <td><label><b>Phone Number:</b></label></td>
                        <td><input type="number" placeholder="Enter mobile number"/></td>
                    </tr>
                    <tr>
                        <td><label><b>Gender:</b></label></td>
                    </tr>
                    <tr>
                        <td><label>Male</label>
                        <input type="radio" name="h"/></td>
                         <td><label>Female</label>
                        <input type="radio" name="h"/></td>
                        <td><label>Others</label>
                        <input type="radio" name="h"/></td>
                    </tr>
                    <tr>
                        <td><label><b>Date of birth:</b></label></td>
                        <td><input type="datetime-local"/></td>
                    </tr>
                    <tr>
                        <td><label><b>Name of the college:</b></label></td>
                        <td><input type="text"/></td>
                    </tr>
                    <tr>
                        <td><label><b>Branch:</b></label></td>
                        <td><select>
                            <option>CSE</option>
                            <option>ECE</option>
                            <option>AIML</option></select></td>
                    </tr>
                    <tr>
                        <td><label><b>Select Domain:</b></label></td>
                        <td><select>
                            <option>HTML</option>
                            <option>CSS</option>
                            <option>JS</option></select></td>
                    </tr>
                    <tr>
                        <td><b>Upload Resume:</b></td>
                        <td><input type="file"/></td>
                    </tr>
                    <tr>
                        <td><button type="submit">SUBMIT</button></td>
                    </tr>
                </table>
            </fieldset>
        </form>

        </div>
    );
}
export default Forms;


//app.js


import './App.css';
import Forms from './forms.js';

function App() {
  return (
    <div className="App">
      {/* <header className="App-header">
        <img src="https://www.sviet.edu.in/wp-content/uploads/2023/05/SVIET-LOGO-Edited.png" className="App-logo" alt="logo" />
        <p>
          Sri Vasavi Institute of Engineering And Technology
        </p>
        <a
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <Intro></Intro>
      </header> */}
      <Forms/>
    </div>
  );
}

export default App;
