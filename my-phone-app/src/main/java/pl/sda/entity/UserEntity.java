package pl.sda.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@AllArgsConstructor
public class UserEntity {
    private String login;
    private String password;
    private String name;
    private String surname;
    private String email;
}
