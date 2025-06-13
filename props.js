//sviet.js

export default function sviet(props)
{
     return(
        <div>
            <h1>{props.title}</h1>
        </div>
    );

}

//app.js


import './App.css';
//import Intro from './intro.js';
//import Forms from './forms.js';
import Sviet from './sviet.js';
function App() {
  return (
    <div className="App">
     <header className="App-header">
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
          SVIET
        </a>
        <Sviet title="Empowering minds"/>
      </header> 
    </div>
  );
}

export default App;
