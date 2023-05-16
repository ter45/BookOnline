
package com.uplink.BookOnlinev2.controller;

import com.uplink.BookOnlinev2.entity.Booking;
import com.uplink.BookOnlinev2.service.BookingService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
 @Autowired
    private BookingService bookingservice;
   
 //Listar reservas
    @GetMapping
    public List<Booking> listar(){
     return bookingservice.listar();
    }
    
       //Métodos de registra una nueva reserva 
    @PostMapping
    public Booking insertar(@RequestBody Booking boo) {
        return bookingservice.insertar(boo);
    }
    
    //Buscar una reserva en la base datos
    @GetMapping("/{id}")
    public ResponseEntity<Booking> buscarbooking(@PathVariable Integer id) {
        Optional<Booking> bookingbuscar = bookingservice.buscar(id);

        if (bookingbuscar.isPresent()) {
            Booking booking = bookingbuscar.get();
            return ResponseEntity.ok(booking);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
 
    //Métodos actualizar  una reserva 
    @PutMapping
    public Booking actualizar(@RequestBody Booking boo) {
        return bookingservice.actualizar(boo);
    }

    //Métodos eliminar  una reserva 
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
         
            bookingservice.eliminar(id);
            
    }
      
}
