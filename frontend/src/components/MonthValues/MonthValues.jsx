import React, { useContext} from "react";
import "../MonthValues/monthvalues.css";
import {monthContext} from '../../context/monthContext';

function MonthValues() {
  const {month, setMonth} = useContext(monthContext);
  const {months, setMonths} = useContext(monthContext);

 const currentMonth = months.find((element) => element.name === month);
 console.log(currentMonth);

  return ( 
    <>
    <div className="monthvalues__card">
      <h3 className="monthvalues__title">Accepted requests</h3>
      <p className="monthvalues__data">There are <span className="monthvalues__value">{currentMonth.acceptedRequests}</span> total accepted requests </p>
    </div>  
    <div className="monthvalues__card monthvalues__card__green">
      <h3 className="monthvalues__title">Return time</h3>
      <p className="monthvalues__data">The average return time is <span className="monthvalues__value">{currentMonth.loanReturnTime}</span> days</p>
    </div>  
    <div className="monthvalues__card">
      <h3 className="monthvalues__title">Budget</h3>
      <p className="monthvalues__data">The total budget is <span className="monthvalues__value">{currentMonth.budget}$</span></p>
    </div>  
    </>
   );
}

export default MonthValues;