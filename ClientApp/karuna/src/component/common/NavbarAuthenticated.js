import React from 'react';


const NavbarAuthenticated = ({ onLogout }) => {
  return (
    <nav>
      <ul>
        <li>
          <button onClick={onLogout}>Logout</button>
        </li>
      </ul>
    </nav>
  );
};

export default NavbarAuthenticated;
