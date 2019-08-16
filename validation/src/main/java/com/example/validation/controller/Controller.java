package com.example.validation.controller;

import com.example.validation.entity.Add;
import com.example.validation.entity.Car;
import com.example.validation.entity.Car1;
import com.example.validation.entity.Car2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;

/**
 * 描述
 * @author Ryze
 * @date 2019-04-08 9:11
 */
@RestController
@Validated
@RequestMapping("/test")
public class Controller {


    @GetMapping("/test1")
    public String test1(@RequestParam @Size(min = 6, max = 8) String code) {
        return code;
    }

    @GetMapping("/test11")
    public String test11(@Size(min = 6, max = 8) String code) {
        return code;
    }

    @GetMapping("/test12/{code}")
    public String test12(@PathVariable @Size(min = 6, max = 8) String code) {
        return code;
    }


    @PostMapping("/test13")
    public String test13(@RequestParam @Size(min = 6, max = 8) String code) {
        return code;
    }
    @PostMapping("/test2")
    public String test2(@Valid @RequestBody Car car) {
        return car.toString();
    }

    @PostMapping("/test3")
    public String test3(@Validated(Add.class) @RequestBody Car car) {
        return car.toString();
    }


    @PostMapping("/test4")
    public String test4(@Validated({Default.class, Add.class}) @RequestBody Car car) {
        return car.toString();
    }
    @PostMapping("/test5")
    public String test5(@Validated({Default.class, Add.class}) @RequestBody Car1 car) {
        return car.toString();
    }
    @PostMapping("/test6")
    public String test6(@Validated Car2 car) {
        return car.toString();
    }
}
