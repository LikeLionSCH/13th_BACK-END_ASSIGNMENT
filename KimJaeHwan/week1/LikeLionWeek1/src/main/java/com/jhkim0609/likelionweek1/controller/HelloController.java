package com.jhkim0609.likelionweek1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    Map<String, Integer> map = new HashMap<>();
    @GetMapping("/hello")
    public String test2(@RequestParam String name, @RequestParam Integer age) {
        map.put(name, age);
        return "name : " + name + "\nage : " + age;
    }
    @GetMapping("/hello/{name}")
    public String test3(@PathVariable String name) {
        if (map.containsKey(name)) {
            return name + "의 나이는 " + map.get(name);
        }
        return name + "은 저장되지 않은 사용자";
    }
}
