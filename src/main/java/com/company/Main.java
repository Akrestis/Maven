package com.company;

import com.company.Dao.UserDao;
import com.company.model.User;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        userDao.removeAll();

        System.out.println("=============================================================");

        userDao.addUser(new User("Alex", 11));
        userDao.addUser(new User("Ben", 22));
        userDao.addUser(new User("Carl", 33));
        userDao.addUser(new User("Den", 44));


        System.out.println("Users: " + userDao.getAllUsers());

        System.out.println("=============================================================");

        User user = userDao.getUser(3);
        System.out.println("User by id: " + user);

        user = userDao.getUserByName("Alex");
        System.out.println("User by name: " + user);

        user.setAge(55);
        userDao.updateUser(user);

        user = userDao.getUserByName("Alex");
        System.out.println("Updated user: " + user);

        System.out.println("=============================================================");

        userDao.removeUser(2);
        System.out.println("Users: " + userDao.getAllUsers());

        userDao.removeUserByName("Ben");
        System.out.println("Users: " + userDao.getAllUsers());

        System.out.println("=============================================================");

        userDao.close();
    }
}
