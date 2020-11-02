package com.ifpb.atividade06.Dao;

import com.ifpb.atividade06.Models.User;

import java.util.HashMap;

public class UserDAO {

    private HashMap<String, User> users;

    public UserDAO(){
        this.users = new HashMap<String, User>();
        this.users.put("dandan", new User("dandan", "123"));
        this.users.put("gabriel", new User("gabriel", "123"));
        this.users.put("ruan", new User("ruan", "123"));
        this.users.put("igor", new User("igor", "123"));
    }

    public User auth(String username, String password){
        User user = this.users.get(username);

        if(user != null) {
            if(user.getPassword().equalsIgnoreCase(password)){
                return user;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

}
