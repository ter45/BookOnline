
package com.uplink.Bookonlinev1.controller;

import com.uplink.Bookonlinev1.entity.Reserva;
import com.uplink.Bookonlinev1.service.ReservaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
  
    @Autowired
    private  ReservaService reservaservice;
    
    //Métodos de listar las reservas
    @GetMapping
    public List<Reserva> listar(){
      return reservaservice.listar();
    }
    //Métodos de registra una reserva 
    @PostMapping
    public Reserva insertar(@RequestBody Reserva res){
        return reservaservice.insertar(res);
    }
    //Métodos actualizar  una reserva 
    @PutMapping
    public Reserva actualizar(@RequestBody Reserva res){
        return reservaservice.actualizar(res);
    }
    //Métodos eliminar  una reserva 
    @DeleteMapping
    public void eliminar(@RequestBody Reserva res){
        reservaservice.eliminar(res);
    }
}
