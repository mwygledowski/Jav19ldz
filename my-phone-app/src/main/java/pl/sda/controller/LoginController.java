package pl.sda.controller;

import pl.sda.service.AuthenticationService;
import pl.sda.service.AuthenticationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    private final AuthenticationService authenticationService = new AuthenticationServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/view/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        authenticationService.authenticate(req);
        Boolean isAuthenticated  = authenticationService.isAuthenticated(req);

        if(isAuthenticated){
            resp.sendRedirect(req.getContextPath() + "/koszyk");
        } else {
            req.setAttribute("invalidLogin",true);
            req.getRequestDispatcher("WEB-INF/view/login.jsp").forward(req,resp);
        }
    }
}
