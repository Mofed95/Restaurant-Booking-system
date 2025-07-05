package com.restaurantbooking.service;


import com.restaurantbooking.model.Booking;
import com.restaurantbooking.model.User;
import com.restaurantbooking.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private final BookingRepository bookingRepo;

    public BookingService(BookingRepository bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public Booking save(Booking booking) {
        return bookingRepo.save(booking);
    }

    public List<Booking> getAll() {
        return bookingRepo.findAll();
    }

    public List<Booking> getByUser(User user) {
        return bookingRepo.findByUser(user);
    }

    public Optional<Booking> getById(Long id) {
        return bookingRepo.findById(id);
    }

    public void delete(Long id) {
        bookingRepo.deleteById(id);
    }
}
