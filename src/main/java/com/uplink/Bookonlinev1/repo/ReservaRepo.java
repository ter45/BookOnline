
package com.uplink.Bookonlinev1.repo;

import com.uplink.Bookonlinev1.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepo extends JpaRepository<Reserva, Integer>{
    
}
