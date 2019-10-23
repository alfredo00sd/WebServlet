package services;

import models.User;

import java.util.ArrayList;
import java.util.List;

public class UserServices {

    public List<User> getAllUsers(){
        //Create the user
        User esmeralda = new User("Esmeralda","Sanchez Lopez",23);
        User alfredo = new User("Alfredo","Acosta peña",20);
        User carmen = new User("Carmen","Estrada Londoño",21);

        //add it to an arrayList
        ArrayList<User> users = new ArrayList<>();
        users.add(esmeralda);
        users.add(alfredo);
        users.add(carmen);

        //return the list within all the users...
        return users;
    }
}
