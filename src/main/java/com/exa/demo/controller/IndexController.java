package com.exa.demo.controller;

import com.exa.demo.bean.Students;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class IndexController {
    private static final Logger log = LoggerFactory.getLogger(IndexController.class);

    //     c查出数据在页面展示

    @RequestMapping(value = "/index")
    public String success(Model model) {
        ArrayList<Students> stulist = new ArrayList<Students>();
        stulist.add(new Students("1", "2", "3", "nan"));
        model.addAttribute("datas", stulist);
//        model.addAttribute(stulist);
        return   "model";
    }
}
