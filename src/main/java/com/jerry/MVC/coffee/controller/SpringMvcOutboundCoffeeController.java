package com.jerry.MVC.coffee.controller;

import com.jerry.Dto.CoffeeResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@RestController
//@RequestMapping("/coffees")
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
