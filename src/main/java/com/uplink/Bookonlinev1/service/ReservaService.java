
package com.uplink.Bookonlinev1.service;

import com.uplink.Bookonlinev1.entity.Reserva;
import com.uplink.Bookonlinev1.repo.ReservaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService{
    
    @Autowired
    private ReservaRepo reservarepo;
    
    public Reserva insertar(Reserva res){
     return reservarepo.save(res);   
    }
    
    public Reserva actualizar(Reserva res){
        return reservarepo.save(res);
    }
    public List<Reserva> listar(){
        return reservarepo.findAll();
    }
    public void eliminar(Reserva res){
        reservarepo.delete(res);
    }
}
