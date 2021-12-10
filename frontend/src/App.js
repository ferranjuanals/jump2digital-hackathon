
import './App.css';
import Header from './components/Header/Header.jsx';
import SelectUpdate from './components/SelectUpdate/SelectUpdate.jsx';
import MonthValues from './components/MonthValues/MonthValues';
import MonthStadistics from './components/MonthStadistics/MonthStadistics';
import {monthContext} from '../src/context/monthContext';
import { useState } from 'react';
import monthsArray from '../src/assets/mockedData.json';

function App() {
  const [month, setMonth] = useState('january2020');
  const [months, setMonths] = useState(monthsArray);

  return (
    <monthContext.Provider value={{month, setMonth, months, setMonths}}>
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
    </monthContext.Provider>
  );
}

export default App;
