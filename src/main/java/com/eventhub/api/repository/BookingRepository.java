package com.eventhub.api.repository;

import com.eventhub.api.entity.Booking;
import com.eventhub.api.enums.BookingStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> findByBookingCode(String bookingCode);
    Page<Booking> findByUserId(Long userId, Pageable pageable);
    Page<Booking> findByEventId(Long eventId, Pageable pageable);
    Page<Booking> findByStatus(BookingStatus status, Pageable pageable);
}
