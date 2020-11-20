import axios from 'axios';
import React, { useState } from 'react';



 const NeoForm = () => {
  const [name, setUser] = useState('');
  const [password, setPassword] = useState('');
  const [obj, setObj ] = useState({});

    return (
        <React.Fragment>

            <input type="text"
             onChange={(e)=>{
                // setUser(e.target.value);
                setObj({...obj,[name]:e.target.value});
            }} placeholder="user" /> <br />
            <input type="text" 
             onChange={(e)=>{
                // setPassword(e.target.value);
               
                
                setObj({...obj,[password]:e.target.value});
            }}
            placeholder="password" /> <br />
            <button onClick={()=>{
                // const data = {
                //     name: user,
                //     password: password
                // };
                axios.post('http://localhost:8082/login',obj).then(callback=>{
                    console.log(callback);
                });
            }}>Validar</button>

        </React.Fragment>


    );


}



export default NeoForm;