
package com.uplink.BookOnlinev2.service;

import com.uplink.BookOnlinev2.entity.Booking;
import com.uplink.BookOnlinev2.repository.Reposito;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private Reposito reposito;

    //Lista los datos de una reseva 
    public List<Booking> listar() {
        return reposito.findAll();
    }

    //Insercion de los datos en la bd de la reserva
    public Booking insertar(Booking boo) {
        return reposito.save(boo);
    }

    //Actualizacion de los datos de una reserva en la bd
    public Booking actualizar(Booking boo) {
        return reposito.save(boo);
    }

    //Buscar una reserva por su id
    public Optional<Booking> buscar(Integer bookingId) {
        return reposito.findById(bookingId);
    }

//Elimina los datos de una reserva en la bd
    public void eliminar(Integer boo) {
        reposito.deleteById(boo);
    }
}
