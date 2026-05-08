package uce.edu.pa2.api.tarea5;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class CuponFacebook implements Cupones {

    @Override
    public double validarCupon(double valor) {
        System.out.println("Aplicando cupon de Facebook ");
        double valorCupon = valor * 0.10;
        System.out.println("Valor del cupon de Facebook: " + valorCupon);
        return valor - valorCupon;
        
    }

}
