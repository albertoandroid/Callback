package com.example.alten.callback;

import java.util.ArrayList;
import java.util.List;

public class WebServiceMock {

    public void login (String user, String password, CallBack callBack){
        Boolean check = checkLogin(user, password);
        if(check){
            callBack.onSuccess("Usuario Correcto");
        }else{
            callBack.onFailure("Usuario Incorrecto");
        }
    }

    public boolean checkLogin(String user, String password){

        List<User> userList = new ArrayList<>();
        User usuario = new User("Alberto", "12345");
        User usuario2 = new User("Maria", "maria33");
        userList.add(usuario);
        userList.add(usuario2);

        for(User user1: userList){
            if(user1.getId().equals(user)){
                if(user1.getPassword().equals(password)){
                    return true;
                }
            }
        }
        return false;
    }
}
