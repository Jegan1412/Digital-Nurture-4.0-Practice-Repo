export function ListofIndianPlayers(props){
    return(
        <div>
            {props.IndianPlayers.map(IndianPlayer => (
                IndianPlayer.map(player => (
                    <li>Mr.{player}</li>
                ))
            ))}
        </div>
    );
}

export function OddPlayers([first,,third,,fifth]){
    return(
        <div>
            <li>First: {first}1</li>
            <li>Third: {third}3</li>
            <li>Fifth: {fifth}5</li>
        </div>
    );
}

export function EvenPlayers([,second,,fourth,,sixth]){
return(
        <div>
            <li>Second: {second}2</li>
            <li>Fourth: {fourth}4</li>
            <li>Sixth: {sixth}6</li>
        </div>
    );
}