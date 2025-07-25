import React from "react";
import styles from './CountPeople.module.css';
import './CountPeople.module.css'

export class CountPeople extends React.Component {

    constructor() {
        super();
        this.state = {
            entrycount: 0,
            exitcount: 0
        };
    }
    updateEntry = () => {
        this.setState((prevState, props) => {
            return { entrycount: prevState.entrycount + 1 }
        });
    }
    updateExit = () => {
        this.setState((prevState, props) => {
            return { exitcount: prevState.exitcount + 1 }
        });
    }
    render() {
        return (
            <div className={styles.ButtonContainer}>
                <div className={styles.Container}>
                    <button className={styles.Button} onClick={this.updateEntry}>Login</button>
                    <span> {this.state.entrycount} People Entered!!!</span>
                </div>
                <div className={styles.Container}>
                    <button className={styles.Button} onClick={this.updateExit}>Exit</button>
                    <span> {this.state.exitcount} People Left!!!</span>
                </div>
            </div>
        );
    }
}