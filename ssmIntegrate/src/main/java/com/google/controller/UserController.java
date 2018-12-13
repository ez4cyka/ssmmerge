package com.google.controller;


import com.google.domain.User;
import com.google.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping(value = "userhome")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "user")
    public String toUser(){
        return "user";
    }

    @RequestMapping(value = "showuser")
    public String showUserById(@RequestParam(value = "id") Long id, Model model){
        User user = userService.queryUserById(id);
        model.addAttribute("user",user);
        return "user";

    }

    //删除用户,因为返回void所以要设置ResponseStatus为HttpStatus.OK
    @RequestMapping(value = "deleteuser")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteUserById(@RequestParam(value = "id") Long id){
        userService.deleteUserById(id);

    }


}
