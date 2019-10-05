package pl.sda.todo.dao;

import pl.sda.todo.entity.ToDoEntity;
import pl.sda.todo.service.IdGeneratorService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static pl.sda.todo.service.IdGeneratorService.*;

public class ToDoDao {
    private static List<ToDoEntity> entities = loadMockData();

    private static List<ToDoEntity> loadMockData() {
        List<ToDoEntity> mockedEntities = new ArrayList<>();

        ToDoEntity entity1 = ToDoEntity.builder()
                .id(generateId())
                .login("janusz")
                .name("Zamówić zapiekanki")
                .description("Powinniśmy zamówić przepyszne zapiekanki z Zapiekarni")
                .category("Relax")
                .creationDate(LocalDateTime.of(2019, 10, 5, 15, 3))
                .deadline(LocalDateTime.of(2019, 10, 6, 14, 0))
                .done("N")
                .build();

        ToDoEntity entity2 = ToDoEntity.builder()
                .id(generateId())
                .login("janusz")
                .name("Stworzyć Entity")
                .description("Jeszcze jedno")
                .category("Work")
                .creationDate(LocalDateTime.of(2019, 10, 5, 15, 9))
                .deadline(LocalDateTime.of(2019, 10, 5, 16, 0))
                .done("Y")
                .build();

        entities.add(entity1);
        entities.add(entity2);

        return mockedEntities;
    }

    public List<ToDoEntity> getEntities(String login) {
        return entities.stream()
                .filter(toDoEntity -> toDoEntity.getLogin().equals(login))
                .collect(Collectors.toList());
    }


}