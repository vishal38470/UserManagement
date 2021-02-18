package com.user.management.service;

import java.util.HashMap;
import java.util.Map;

import com.user.management.model.User;

public class UserService {
    static Map<Integer, User> users = new HashMap<Integer, User>();
 int counter =1;





    ////////////////insert////////////////
    public int insertUser(String name, int age, String address) {


        int ID = counter ;
        counter++;

        users.put(ID, new User(ID, name, age, address));

        return ID;

    }

    ///////remove////////////////
    public void deleteUser(int ID) {
        users.remove(ID);

    }

    ///////////////////getuser/////////////////
    public User getUser(int ID) {

        return users.get(ID);




    }

    //////update/////////////////
    public void updateUser(int ID, String name, int age, String address) {

        User user = this.getUser(ID);
        user.setName(name);
        user.setAge(age);
        user.setAddress(address);

    }

    public Map<Integer, User> getAllUsers() {

        return users;
    }


}
