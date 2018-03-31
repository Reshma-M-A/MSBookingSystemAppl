package com.api.bookingsystem.controllers;

import java.util.List;

import com.api.bookingsystem.model.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.api.bookingsystem.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/welcome")
    public ModelAndView firstPage() {
        return new ModelAndView("welcome");
    }

    @RequestMapping(value = "/addNewUser", method = RequestMethod.GET)
    public ModelAndView show() {
        return new ModelAndView("addUser", "emp", new SystemUser(){});
    }

    @RequestMapping(value = "/addNewUser", method = RequestMethod.POST)
    public ModelAndView processRequest(@ModelAttribute("user") SystemUser user) {

        userService.insertUser(user);
        List<SystemUser> users = userService.getAllUsers();
        ModelAndView model = new ModelAndView("getUsers");
        model.addObject("users", users);
        return model;
    }

    @RequestMapping("/getUsers")
    public ModelAndView getUsers() {
        List<SystemUser> users = userService.getAllUsers();
        ModelAndView model = new ModelAndView("getUsers");
        model.addObject("users", users);
        return model;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "login";
    }




}
