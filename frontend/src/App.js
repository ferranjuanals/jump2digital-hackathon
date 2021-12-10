
    import './App.css';
import Header from './components/Header/Header.jsx';
import SelectUpdate from './components/SelectUpdate/SelectUpdate.jsx';
    import MonthValues from './components/MonthValues/MonthValues';
function App() {
  return (
    <div className="App">
        <Header />  
        <SelectUpdate />
          <MonthValues />
    </div>
  );
}

export default App;
