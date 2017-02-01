package com.pataleta.musicService.model;


import com.pataleta.musicService.model.User;
import com.pataleta.musicService.model.workWithDB;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import java.sql.ResultSet;
import java.util.ArrayList;

public class listOfUsers {

    private ArrayList<User> listOfAuthors;

  public listOfUsers(){
        try {


            ResultSet resultSet = workWithDB.executeQuery("select * from authors");
            listOfAuthors = new ArrayList<User>();
            while (resultSet.next()) {
                listOfAuthors.add(new User(
                        resultSet.getString("nameAuthor"),
                        "123"
                ));
            }
        }catch (Exception e){
            listOfAuthors = new ArrayList<User>();
        }
    }

    public ArrayList<User> getListOfAuthors() {

        return listOfAuthors;
    }
}
