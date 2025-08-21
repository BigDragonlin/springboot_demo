package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private  String appName;
    @RequestMapping("/")
    public String index() {
        String viewName = about();
        System.out.println(viewName);
        System.out.println("tessttsd");
        System.out.println("____________");
        System.out.println("____________adfadf");
        System.out.println("appName " + appName);
        return viewName;
    }

    public String about() {
        return "about.html";
    }
}
