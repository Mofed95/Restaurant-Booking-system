package com.restaurantbooking.repository;


import com.restaurantbooking.model.Booking;
import com.restaurantbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUser(User user);
}
