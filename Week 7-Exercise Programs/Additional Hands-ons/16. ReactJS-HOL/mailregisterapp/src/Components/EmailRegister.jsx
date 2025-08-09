import React from "react";

export class Register extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            name: '',
            email: '',
            password: '',
            errors: {
                fullName: '',
                email: '',
                password: ''
            },
        };
    }

    handleChange = (e) => {
        this.setState(
            {
                [e.target.name]: e.target.value
            }
        )
    }

    validateForm = (e) => {
        let isValid = true;
        if (this.state.name.length < 5) {
            e.fullName = "Full Name must be 5 characters long!";
            isValid = false;
        }
        if (this.state.email.length > 0) {
            const validEmailRegex =
                RegExp(/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/);
            if (!validEmailRegex.test(this.state.email)) {
                e.email = "Email is not valid!";
                isValid = false;
            }
        }
        if (this.state.password.length < 8) {
            e.password = "Password must be 8 characters long!";
            isValid = false;
        }
        return isValid;
    }

    handleSubmit = (e) => {
        e.preventDefault();
        if (this.validateForm(this.state.errors)) {
            alert("Valid Form");
        }
        else {
            if (this.state.errors.fullName !== "") {
                alert(this.state.errors.fullName);
                this.state.errors.fullName = '';
            }
            if (this.state.errors.email !== "") {
                alert(this.state.errors.email);
                this.state.errors.email = '';
            }
            if (this.state.errors.password !== "") {
                alert(this.state.errors.password);
                this.state.errors.password = '';
            }
        }
    }

    render() {
        return (
            <form onSubmit={this.handleSubmit} style={{ margin: "20%" }}>
                <h1 style={{ color: "red" }}>Register Here!!!</h1>
                <table>
                    <tr>
                        <td>Name:</td>
                        <td><input type="text" name="name" value={this.state.name} onChange={this.handleChange}></input></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input type="text" name="email" value={this.state.email} onChange={this.handleChange}></input></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password" value={this.state.password} onChange={this.handleChange}></input></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><button type="submit">Submit</button></td>
                    </tr>
                </table>
            </form>
        );
    }
}