package com.example.springbootJokes.controller;


import com.example.springbootJokes.service.JokesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokesController {

    @Autowired
    private JokesServiceImpl jokesServiceImpl;

    @RequestMapping(method = RequestMethod.GET)
    public String getQuotes(Model model){
        model.addAttribute("joke",jokesServiceImpl.getJoke());
        return "checkNorris";
    }

}
