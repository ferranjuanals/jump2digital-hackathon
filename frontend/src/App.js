
import './App.css';
import Header from './components/Header/Header.jsx';
import SelectUpdate from './components/SelectUpdate/SelectUpdate.jsx';
import MonthValues from './components/MonthValues/MonthValues';
import MonthStadistics from './components/MonthStadistics/MonthStadistics';

function App() {
  return (
    <div className="App">
      <div className="App__top">
        <Header />  
        <SelectUpdate />
        <MonthValues />
      </div>
      <div className="App__bottom">
        <MonthStadistics />
      </div>
    </div>
  );
}

export default App;
