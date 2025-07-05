package com.restaurantbooking.service;


import com.restaurantbooking.model.Food;
import com.restaurantbooking.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    private final FoodRepository foodRepo;

    public FoodService(FoodRepository foodRepo) {
        this.foodRepo = foodRepo;
    }

    public Food save(Food food) {
        return foodRepo.save(food);
    }

    public List<Food> getAll() {
        return foodRepo.findAll();
    }

    public Optional<Food> getById(Long id) {
        return foodRepo.findById(id);
    }

    public void delete(Long id) {
        foodRepo.deleteById(id);
    }
}
