package pl.sda.service;

import pl.sda.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class AuthenticationServiceImpl implements AuthenticationService {



    private UserService userService = new UserServiceImpl();

    private static final String IS_AUTHENTICATED = "isAuthenticated";

    @Override
    public void authenticate(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        User user = userService.getUser(login);
        if (user == null) {
            session.setAttribute(IS_AUTHENTICATED, false);
            return;
        }
        if (user.getPassword().equals(password)) {
            session.setAttribute(IS_AUTHENTICATED, true);
            return;
        }
        session.setAttribute(IS_AUTHENTICATED, false);
    }

    @Override
    public void logout(HttpServletRequest req) {
        req.getSession().setAttribute(IS_AUTHENTICATED, false);
    }

    @Override
    public boolean isAuthenticated(HttpServletRequest req) {
        return (Boolean) req.getSession().getAttribute(IS_AUTHENTICATED);
    }

}
