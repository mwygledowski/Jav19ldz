package pl.sda.todo.service;

import pl.sda.todo.dao.ToDoDao;
import pl.sda.todo.entity.ToDoEntity;
import pl.sda.todo.mapper.ToDoMapper;
import pl.sda.todo.model.ToDoModel;

import java.util.List;

public class ToDoService {
    private final ToDoDao toDoDao = new ToDoDao();

    public List<ToDoModel> getToDo(String login) {
        return ToDoMapper.map(toDoDao.getEntities(login));
    }
}