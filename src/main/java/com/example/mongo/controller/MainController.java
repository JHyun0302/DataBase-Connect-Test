package com.example.mongo.controller;

import com.example.mongo.firstdb.repository.Table1Repository;
import com.example.mongo.seconddb.repository.Table2Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final Table1Repository table1Repository;

    private final Table2Repository table2Repository;

    @GetMapping("/")
    public String main(Model model) {

        model.addAttribute("Data1", table1Repository.findAll());
        model.addAttribute("Data2", table2Repository.findAll());

        return "main";
    }
}
