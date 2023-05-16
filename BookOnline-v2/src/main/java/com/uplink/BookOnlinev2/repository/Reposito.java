
package com.uplink.BookOnlinev2.repository;

import com.uplink.BookOnlinev2.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Reposito extends JpaRepository<Booking, Integer> {
    
}
