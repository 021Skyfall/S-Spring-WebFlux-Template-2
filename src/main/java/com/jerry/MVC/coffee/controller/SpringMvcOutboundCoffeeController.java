package com.jerry.MVC.coffee.controller;

import com.jerry.MVC.coffee.Dto.CoffeeResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffees")
public class SpringMvcOutboundCoffeeController {
    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@PathVariable("coffee-id") long coffeeId) throws InterruptedException {
        CoffeeResponseDto responseDto =
                new CoffeeResponseDto(coffeeId, "카페라떼", "CafeLattee", 4000);

        // (1)
        Thread.sleep(5000);
        return ResponseEntity.ok(responseDto);
    }
}
