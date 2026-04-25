package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;

//Medir el tiempo de un pedido
//@ApplicationScoped
@Dependent
public class TrakingVenta {
    private long tiempoInicio = 0;
    private long tiempoFinal = 0;
    private long tiempoTotalAcumulado = 0;
    private int numeroOperaciones = 0;

    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis();
    }

    public void reiniciar(){
        this.tiempoInicio = 0;
        this.tiempoFinal = 0;
        this.tiempoTotalAcumulado = 0;
        this.numeroOperaciones = 0;
    }

    public void finaliza() {
        this.tiempoFinal = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - tiempoInicio;
        System.out.println("Tiempo ejecución: " + tiempoEjecucion + " ms");
        this.tiempoTotalAcumulado += tiempoEjecucion;
        this.numeroOperaciones++;
        System.out.println("Tiempo ejecución: " + tiempoEjecucion + " ms");
        System.out.println("Tiempo acumulado: " + this.tiempoTotalAcumulado + " ms");
        System.out.println("Cantidad de operaciones: " + this.numeroOperaciones);

    }
}
