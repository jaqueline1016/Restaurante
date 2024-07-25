/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopractica2;

import java.time.LocalDateTime;

/**
 *
 * @author William
 */
public class RegistroHistorial {
    String vehiculo;
    int distancia;
    String monto;
    String fecha_hora_creacion;
    String fecha_hora_entrega;

    public RegistroHistorial(String vehiculo, int distancia, String monto,String fecha_hora_creacion, String fecha_hora_entrega) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.monto = monto;
        this.fecha_hora_creacion = fecha_hora_creacion;
        this.fecha_hora_entrega = fecha_hora_entrega;
    }
    
    
    
}
