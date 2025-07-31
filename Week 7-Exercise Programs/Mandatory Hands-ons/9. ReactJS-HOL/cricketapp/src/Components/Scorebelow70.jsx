export function Scorebelow70(props){
    return(
        <div>
            {props.players.map(player => {
                if(player.score<=70) {
                   return <li>Mr.{player.name}<span> {player.score}</span></li>
                }
            })}
        </div>
    );
}