import React, { useContext} from 'react';
import '../SelectUpdate/selectupdate.css';
import {monthContext} from '../../context/monthContext';

export default function SelectUpdate(){
    const {month, setMonth} = useContext(monthContext);
    const {months, setMonths} = useContext(monthContext);

const getInputValue = (event) => {
    setMonth(event.target.value)
}

const updateDataFromApi = () => {
    setMonths(months);
}

    return (
        <div className="selectupdate__div">
<select name="selectmonth" className="selectupdate__select" onChange={ event => getInputValue(event)}>
<option disabled selected>Select date</option>
    {months.map((month) => <option key={month.name} value={month.name}>{month.name}</option>)}
</select>
<button className="selectupdate__button" onClick={() => updateDataFromApi()}>Update data</button>
</div>
    );
}