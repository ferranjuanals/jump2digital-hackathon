import React, {useContext} from 'react'
import './monthstadistics.css'
import { LineChart, Line, CartesianGrid, XAxis, YAxis, Tooltip } from 'recharts';
import {monthContext} from '../../context/monthContext';

function MonthStadistics() {
    const {months, setMonths} = useContext(monthContext);
    months.map(month => {

    })
    console.log(months)
    return (
        <div className="MonthStadistics__container">
            <div className="MonthStadistics__div">
               <h1 className="MonthStadistics__header">Statistics</h1>
            </div>
            <div className="MonthStadistics__border">
                <div className="MonthStadistics__graphtitle">
                    Requested Money
                </div>
                <div className="MonthStadistics__graph">
                            <LineChart width={300} height={280} data={months}>
                                <Line type="monotone" dataKey="numberOfRequests" stroke="#8884d8" />
                                <CartesianGrid stroke="#ccc" />
                                <XAxis dataKey="name" />
                                <YAxis dataKey="numberOfRequests"/>
                                <Tooltip />
                            </LineChart>
                </div>
                <div className="MonthStadistics__graphtitle">
                    Users
                </div>
                <div className="MonthStadistics__graph">
                         <LineChart width={300} height={280} data={months}>
                                <Line type="monotone" dataKey="numberOfNewUsers" stroke="#8884d8" />
                                <CartesianGrid stroke="#ccc" />
                                <XAxis dataKey="name" />
                                <YAxis dataKey="numberOfNewUsers"/>
                                <Tooltip />
                            </LineChart>
                </div>
            </div>
        </div>
    )
}

export default MonthStadistics
