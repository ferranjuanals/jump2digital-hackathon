import React from "react";
import "../MonthValues/monthvalues.css"

function MonthValues() {
  return ( 
    <>
    <div className="monthvalues__card">
      <h3 className="monthvalues__title">Accepted requests</h3>
      <p className="monthvalues__data">You have <span className="monthvalues__value">5</span> accepted requests</p>
    </div>  
    <div className="monthvalues__card monthvalues__card__green">
      <h3 className="monthvalues__title">Your return time</h3>
      <p className="monthvalues__data">Your return time is <span className="monthvalues__value">10</span> days</p>
    </div>  
    <div className="monthvalues__card">
      <h3 className="monthvalues__title">Budget</h3>
      <p className="monthvalues__data">Your total budget is <span className="monthvalues__value">1.500$</span></p>
    </div>  
    </>
   );
}

export default MonthValues;