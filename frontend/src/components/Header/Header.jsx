import React from 'react'
import Logo from '../../assets/logo.png'
import './header.css'


function Header() {
    return (
        <header className="header__container">
            <div>
                <img src={Logo} alt="Logo" className='header__logo'/>
            </div>
            <div className="header__div">
                <h1 className="header__title">Welcome Back! 👋</h1>
            </div>
        </header>
    )
}

export default Header
