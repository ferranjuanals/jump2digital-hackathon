import React from 'react';
import '../SelectUpdate/selectupdate.css';

export default function SelectUpdate(){
    return (
        <div className="selectupdate__div">
<select name="selectmonth" className="selectupdate__select">
    <option disabled selected>Select month</option>
    <option value="january">January</option>
    <option value="february">February</option>
    <option value="march">March</option>
    <option value="april">April</option>
    <option value="may">May</option>
    <option value="june">June</option>
    <option value="july">July</option>
    <option value="august">August</option>
    <option value="september">September</option>
    <option value="october">October</option>
    <option value="november">November</option>
    <option value="december">December</option>
</select>
<button className="selectupdate__button">Update data</button>
</div>
    );
}