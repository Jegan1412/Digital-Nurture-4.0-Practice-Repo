export function ListofPlayers(props) {
    return (
        <div>
            {props.players.map(player => (
                <li>Mr.{player.name} <span>{player.score}</span></li>
            ))}
        </div>
    );
}
