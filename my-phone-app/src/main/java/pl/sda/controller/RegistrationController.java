package pl.sda.controller;

import pl.sda.entity.UserEntity;
import pl.sda.model.User;
import pl.sda.service.UserService;
import pl.sda.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/zarejestruj")
public class RegistrationController extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //pobierze dane i wstawi do bazy danych
        userService.saveUser(mapToUser(req));
        resp.sendRedirect(req.getContextPath() + "/login");
    }

    private User mapToUser(HttpServletRequest req) {
       return new User(req.getParameter("login"),
                req.getParameter("password"),
                req.getParameter("name"),
                req.getParameter("surname"),
                req.getParameter("email"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //przekierowany a strone z rejestracją
        req.getRequestDispatcher("WEB-INF/view/registration.jsp").forward(req,resp);
    }
}
