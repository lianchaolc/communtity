package com.exa.demo.controller;

import com.exa.demo.bean.Students;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RequestMapping
@Controller
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(@RequestParam("user") String user){
//        if(user.equals("aaa")){
//        }
        return "Hello World";
    }

    //查出用户数据，在页面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users",Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
    //     c查出数据在页面展示
//    @GetMapping(value = "/success")
////    @RequestMapping("/success")
//    public String success(Model model) {
//        List<Students> stulist=new ArrayList<Students>();
//        stulist.add(new Students("1","2","3","nan"));
//        stulist.add(new Students("1","2","3","nan"));
//        stulist.add(new Students("1","2","3","nan"));
//        stulist.add(new Students("1","2","3","nan"));
//        stulist.add(new Students("1","2","3","nan"));
//        stulist.add(new Students("1","2","3","nan"));
//        model.addAttribute(stulist);
//
////        map.put("hello", "你好");
////        map.put("users", Arrays.asList("zhangsan", "lisi", "wangmazi", "大大大"));
//        log.info(stulist.toString());
//        return "success"+model;
//    }
    @GetMapping("/hello5")
    public String t5(Model model){
        String html = "<p style='color:red'>html文本</p>";
        model.addAttribute("html",html);
        model.addAttribute("t1",true);
        model.addAttribute("t2",true);
        return "index5";
    }

}
