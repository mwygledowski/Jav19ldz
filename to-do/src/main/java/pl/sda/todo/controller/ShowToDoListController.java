package pl.sda.todo.controller;

import pl.sda.todo.service.ToDoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/to-do/home")
public class ShowToDoListController extends HttpServlet {

    private ToDoService toDoService = new ToDoService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = "janusz";
        req.setAttribute("toDoList",toDoService.getToDo(login));
        req.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(req,resp);
    }
}
