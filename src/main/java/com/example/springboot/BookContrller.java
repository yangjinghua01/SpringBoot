package com.example.springboot;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class BookContrller {
    @GetMapping("/book/{id}")
    public String book(@PathVariable Integer id){
        return "hhhhhh"+id;
    }
    @PostMapping("/save")
    public ApiResult<User> save(@RequestBody User user){
        String name = user.getName();
        int id = user.getId();
        System.out.println("name:"+name + "id:"+id);
        System.out.println(1 / 0);
        return ApiResult.success(user);
    }
    @GetMapping("/test1")
    public String test1() {
        return "当前时间：" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
    @GetMapping("/test2")
    public Integer test2() {
        System.out.println(1 / 0);
        return Integer.MAX_VALUE;
    }

}
