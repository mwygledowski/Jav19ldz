package pl.sda.todo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum Category {
    RELAX, WORK, HOME, HOBBY, EDUCATION, FAMILY, HEALTH;
}
