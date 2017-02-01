package com.pataleta.musicService.controllers;

import com.pataleta.musicService.model.User;
import com.pataleta.musicService.model.workWithDB;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.ResultSet;


@Controller
public class MainController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView checkUser(@ModelAttribute("userJSP") User user) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            String userLogin = user.getName();
            String userPassword = user.getPassword();
            ResultSet resultSet = workWithDB.executeQuery(" SELECT * FROM user WHERE login='" + userLogin + "'  ");
            if (resultSet == null) {
                System.out.print("null ");
                modelAndView.setViewName("index");
                return modelAndView;
            } else {
                modelAndView.setViewName("musicCatalog");
                modelAndView.addObject("userJSP", user);
                return modelAndView;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return modelAndView;
        }
    }
}