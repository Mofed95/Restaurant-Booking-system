package com.restaurantbooking.controller;


import com.restaurantbooking.model.Food;
import com.restaurantbooking.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
@CrossOrigin
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @PostMapping
    public Food create(@RequestBody Food food) {
        return foodService.save(food);
    }

    @GetMapping
    public List<Food> getAll() {
        return foodService.getAll();
    }

    @GetMapping("/{id}")
    public Food get(@PathVariable Long id) {
        return foodService.getById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Food update(@PathVariable Long id, @RequestBody Food food) {
        food.setFoodId(id);
        return foodService.save(food);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        foodService.delete(id);
    }
}

