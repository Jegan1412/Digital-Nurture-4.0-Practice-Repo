import logo from './logo.svg';
import './App.css';
import trainersMock from './TrainersComponents/TrainersMock';
import TrainersList from './TrainersComponents/TrainerList';
import { Home } from './Home';

function App() {
  return (
    <div className="App">
      <h1>My Academy Trainers App</h1>
      <a href="">Home</a>
      <span> | </span>
      <a href="">Show Trainers</a>
      <Home/>
      <h1>Trainers List</h1>
      <ul>
        {trainersMock.map(trainer => <TrainersList trainer={trainer}/>)}
      </ul>
    </div>
  );
}

export default App;
