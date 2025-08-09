import React, { useState } from "react";

export function ComplaintRegister() {
    const red = { color: "red" }
    const divStyle = {
        marginLeft: "40vw",
        marginTop: "20vh",
    }

    const [name, setName] = useState('');
    const [compliant, setCompliant] = useState('');
    const [NumberHolder, setNumberHolder] = useState(1);

    const handleSubmit = (e) => {
        setNumberHolder(NumberHolder + 1);
        var msg = "Thanks " + name + "\n Your compliant was Submitted\n" +
            "Transaction ID is: " + NumberHolder;
        alert(msg);
        e.preventDefault();
    }

    const handleChange = (e) => {
        setName(e.target.value);
    }

    const handleCompliant = (e) => {
        setCompliant(e.target.value);
    }

    return (
        <div style={divStyle}>
            <h1 style={red}>Register your complaints here!!!</h1>
            <form onSubmit={handleSubmit}>
                <tr>
                    <td><label>Name:</label></td>
                    <td><input type="text" value={name} onChange={handleChange}></input></td>
                </tr>

                <tr>
                    <td><label>Compliant:</label></td>
                    <td><textarea value={compliant} onChange={handleCompliant}></textarea>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><button type="submit">Submit</button></td>
                </tr>
            </form>
        </div>
    );
}