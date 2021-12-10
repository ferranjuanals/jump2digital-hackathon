import React from "react";
import "../MonthValues/monthvalues.css"

function MonthValues() {
  return ( 
    <>
    <div className="monthvalues__card">
      <h3 className="monthvalues__title">Accepted requests</h3>
      <p className="monthvalues__data">There are<span className="monthvalues__value">5</span> total accepted resquest </p>
    </div>  
    <div className="monthvalues__card monthvalues__card__green">
      <h3 className="monthvalues__title">Return time</h3>
      <p className="monthvalues__data">The average return time is <span className="monthvalues__value">10</span> days</p>
    </div>  
    <div className="monthvalues__card">
      <h3 className="monthvalues__title">Budget</h3>
      <p className="monthvalues__data">The total budget is <span className="monthvalues__value">1.500$</span></p>
    </div>  
    </>
   );
}

export default MonthValues;