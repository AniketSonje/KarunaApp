import React, { useState } from 'react';
import { Router, Route, Redirect } from 'react-router-dom';
import { createBrowserHistory } from 'history';
import NavbarGuest from './components/common/NavbarGuest';
import NavbarAuthenticated from './components/common/NavbarAuthenticated';
import LoginPage from './pages/LoginPage';
import SignupPage from './pages/SignUpPage';
import HomePage from './pages/HomePage';

const history = createBrowserHistory();

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogout = () => {
    setIsLoggedIn(false);
    // handle any additional logout logic
  };

  return (
    <Router history={history}>
      {isLoggedIn ? (
        <NavbarAuthenticated onLogout={handleLogout} />
      ) : (
        <NavbarGuest />
      )}
      {isLoggedIn ? (
        <>
          <Route exact path="/">
            <HomePage />
          </Route>
          <Redirect to="/" />
        </>
      ) : (
        <>
          <Route exact path="/login">
            <LoginPage />
          </Route>
          <Route exact path="/signup">
            <SignupPage />
          </Route>
          <Redirect to="/login" />
        </>
      )}
    </Router>
  );
}

export default App;
