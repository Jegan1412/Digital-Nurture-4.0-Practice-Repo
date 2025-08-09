import React from "react";

export class User extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            person:null,
            loading:true
        };
    }

    async componentDidMount() {
        const url = "https://api.randomuser.me";
        const response = await fetch(url);
        const data = await response.json();
        this.setState(
            {
                person:data.results[0],
                loading:false
            }
        );
        console.log(data.results[0]);
    }

    render() {
        const {person, loading} = this.state;

        const styl = {
            padding: "10vw",
        }

        if(loading) return <div>Loading User...</div>


        return (
            <div styles={styl}>
                <h1>{person.name.title} {person.name.first} {person.name.last}</h1>
                <img src={person.picture.large}></img>
            </div>
        );
    }

}