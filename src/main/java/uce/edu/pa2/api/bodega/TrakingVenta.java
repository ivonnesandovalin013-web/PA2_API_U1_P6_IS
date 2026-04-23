package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

//Medir el tiempo de un pedido
//@ApplicationScoped
@Dependent
public class TrakingVenta {
    private long tiempoInicio = 0;
    private long tiempoFinal = 0;
    
    public void iniciar(){
        this.tiempoInicio = this.tiempoInicio + System.currentTimeMillis();
    }

    public void finaliza(){
        this.tiempoFinal = this.tiempoFinal + System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - tiempoInicio;
        System.out.println("Tiempo ejecución: " + tiempoEjecucion+ " ms");
    }
}
