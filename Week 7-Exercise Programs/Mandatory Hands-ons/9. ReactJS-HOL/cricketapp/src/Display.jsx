import { players } from "./Components/Players";
import { ListofPlayers } from "./Components/ListofPlayers"
import { Scorebelow70 } from "./Components/Scorebelow70";
import { EvenPlayers, ListofIndianPlayers, OddPlayers } from "./Components/ListofIndianPlayers";
import { IndianPlayers, IndianTeam } from "./Components/IndianTeam";

export function Display(){
    var flag=false;

    const divs = {
        margin: "10px",
    }

    if(flag==true){
        return(
            <div style={divs}>
                <h1>List of Players</h1>
                <ListofPlayers players={players}/>
                <hr/>
                <h1>List of Players having Scores Less than 70</h1>
                <Scorebelow70 players={players}/>
            </div>
        )
    }
    else{
        return(
            <div style={divs}>
                <div>
                    <h1>Indian Team</h1>
                    <h1>Odd Players</h1>
                    {OddPlayers(IndianTeam)}
                    <hr/>
                    <h1>Even Players</h1>
                    {EvenPlayers(IndianTeam)}
                </div>
                <hr/>
                <div>
                    <h1>List of Indian Players Merged:</h1>
                    <ListofIndianPlayers IndianPlayers={IndianPlayers}/>
                </div>
            </div>
        )
    }
}