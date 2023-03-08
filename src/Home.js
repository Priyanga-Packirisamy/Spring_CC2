import React, {useState, useEffect} from 'react';
import axios from 'axios';

function Home(){

    const[data, setData] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/get')
        .then(response => {
            setData(response.data);
        })
        .catch(error => {
            console.log(error);
        })
    },[]);

    const handleDelete = (id) =>{
        axios.delete(`http://127.0.0.1:8080/del/${id}`)
        window.location.reload()
        .then(response =>{
            setData(data.filter(data => data.id !== id));
        console.log(response + "deleted");
        })
        .catch(error => {
            console.log(error);
        })
    }

    return(
        <div>
            <h1>Guide Management</h1>
            <table>
                <thead>
                <tr>
                    <th>Guide Num</th>
                    <th>Guide Name</th>
                    <th>Locality</th>
                    <th>Language</th>
                    <th>Driver</th>
                    <th>Delete</th>
                </tr>
                </thead>
                <tbody>
                    {data.map(item => (
                        <tr key={item.guideno}>
                            <td>{item.guideno}</td>
                            <td>{item.guidename}</td>
                            <td>{item.locality}</td>
                            <td>{item.language}</td>
                            <td>{item.driver}</td>
                            <td>
                                <button onClick={() => handleDelete(item.guideno)}> Delete</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    )
}
export default Home;
