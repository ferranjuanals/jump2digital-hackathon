import React from 'react'
import './monthstadistics.css'
import { LineChart, Line, CartesianGrid, XAxis, YAxis, Tooltip } from 'recharts';

function MonthStadistics() {
    const data = [{name: 'January', pv: 2360}, {name: 'February', pv: 2400},{name: 'January', pv: 2360}, {name: 'February', pv: 2400},{name: 'January', pv: 2360}, {name: 'February', pv: 2400},{name: 'January', pv: 2360}, {name: 'February', pv: 2400},{name: 'January', pv: 2360}, {name: 'February', pv: 2400},{name: 'January', pv: 2360}];

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
                    <LineChart width={300} height={280} data={data} margin={{ top: 50, right: 20, bottom: 5, left: 0 }}>
                        <Line type="monotone" dataKey="pv" stroke="#8884d8" />
                        <CartesianGrid stroke="#ccc" strokeDasharray="5 5" />
                        <XAxis dataKey="name" />
                        <YAxis />
                        <Tooltip />
                    </LineChart>
                </div>
                <div className="MonthStadistics__graphtitle">
                    Users
                </div>
                <div className="MonthStadistics__graph">
                    <LineChart width={300} height={280} data={data} margin={{ top: 50, right: 20, bottom: 5, left: 0 }}>
                        <Line type="monotone" dataKey="pv" stroke="#8884d8" />
                        <CartesianGrid stroke="#ccc" strokeDasharray="5 5" />
                        <XAxis dataKey="name" />
                        <YAxis />
                        <Tooltip />
                    </LineChart>
                </div>
            </div>
        </div>
    )
}

export default MonthStadistics
