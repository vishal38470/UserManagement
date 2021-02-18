package com.user.management.service;

import java.util.HashMap;
import java.util.Map;

import com.user.management.model.User;

public class UserService {
    static Map<Integer, User> users = new HashMap<Integer, User>();
    int counter = 1;

    ////////////////insert////////////////
    public int insertUser(String name, int age, String address) {


        int id = counter;
        counter++;

        users.put(id, new User(id, name, age, address));

        return id;

    }

    ///////remove////////////////
    public void deleteUser(int id) {
        users.remove(id);

    }

    ///////////////////getuser/////////////////
    public User getUser(int id) {

        return users.get(id);

    }

    //////update/////////////////
    public void updateUser(int id, String name, int age, String address) {

        User user = this.getUser(id);
        user.setName(name);
        user.setAge(age);
        user.setAddress(address);
    }

    public Map<Integer, User> getAllUsers() {

        return users;
    }


}
