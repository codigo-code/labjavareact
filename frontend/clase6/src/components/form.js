import axios from 'axios';
import React, { useState } from 'react';



 const NeoForm = () => {
  const [user, setUser] = useState('');
  const [password, setPassword] = useState('');

    return (
        <React.Fragment>

            <input type="text"
             onChange={(e)=>{
                setUser(e.target.value);
            }} placeholder="user" /> <br />
            <input type="text" 
             onChange={(e)=>{
                setPassword(e.target.value);
            }}
            placeholder="password" /> <br />
            <button onClick={()=>{
                const data = {
                    name: user,
                    password: password
                };
                axios.post('http://localhost:8082/login',data).then(callback=>{
                    console.log(callback);
                });
            }}>Validar</button>

        </React.Fragment>


    );


}



export default NeoForm;