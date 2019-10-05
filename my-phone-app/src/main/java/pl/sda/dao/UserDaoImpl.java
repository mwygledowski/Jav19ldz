package pl.sda.dao;

import pl.sda.entity.UserEntity;
import pl.sda.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class UserDaoImpl implements UserDao {

    private static List<UserEntity> users = mockUsers();

    @Override
    public void saveUser(UserEntity user) {
        users.add(user);
    }

    @Override
    public Optional<UserEntity> findUser(String login) {
       return users.stream().filter(u -> u.getLogin().equals(login)).findFirst();
    }

    private static List<UserEntity> mockUsers(){
        List<UserEntity> list = new ArrayList<>();
        UserEntity user = new UserEntity("abc1","abc1","Werka","J","Werka@j.pl");
        list.add(user);
        return list;
    }
}
