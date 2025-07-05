package com.restaurantbooking.repository;




import com.restaurantbooking.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
