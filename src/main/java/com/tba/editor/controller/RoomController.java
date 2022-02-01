package com.tba.editor.controller;

import com.tba.editor.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController
{
    @Autowired
    private RoomRepository repository;

    @GetMapping
    public String index(Model model)
    {
        model.addAttribute("rooms", repository.findAll());
        return "rooms/index";
    }
}
