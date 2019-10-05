package pl.sda.service;

import pl.sda.dao.UserDao;
import pl.sda.dao.UserDaoImpl;
import pl.sda.mapper.UserMapper;
import pl.sda.model.User;

public class UserServiceImpl implements UserService {
    UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public void saveUser(User user) {
        userDao.saveUser(UserMapper.mapToUserEntity(user));
    }

    @Override
    public User getUser(String login) {
        return UserMapper.mapToUser(userDao.findUser(login).orElse(null));
    }
}
