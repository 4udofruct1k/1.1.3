package jm.task.core.jdbc;


import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Maxim", "Gurev", (byte) 20);
        userService.saveUser("Andrei", "Ivanov", (byte) 25);
        userService.saveUser("Ivan", "Rybakov", (byte) 21);
        userService.saveUser("Zaur", "Tregulov", (byte) 33);
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
