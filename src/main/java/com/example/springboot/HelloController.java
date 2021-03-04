package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fdy
 * @date 2021-03-04 10:31:35
 * @email fdy19930621@163.com
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public @ResponseBody Object users(){
        List<String> userList = new ArrayList<>();
        userList.add("tom");
        userList.add("marry");
        userList.add("jack");
        System.out.println("user_api is get");
        return userList;
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public @ResponseBody Object login(String name, String pwd) {

        Map<String, Object> map = new HashMap<>();
        if (("jack".equals(name)) && "123".equals(pwd)){
            map.put("status", 0);
        }else {
            map.put("status", -1);
        }
        System.out.println("login_api is get");
        return map;
    }
    @RequestMapping(value = "info", method = RequestMethod.GET)
    public @ResponseBody Object info(String name, String pwd){
        List<String> userList1 = new ArrayList<>();
        userList1.add(name);
        userList1.add(pwd);
        userList1.add(name.length()+"");
        System.out.println("info api is get");
        return userList1;
    }
}