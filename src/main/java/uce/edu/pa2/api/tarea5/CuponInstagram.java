package uce.edu.pa2.api.tarea5;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class CuponInstagram implements Cupones {

    @Override
    public double validarCupon(double valor) {
        System.out.println("Aplicando cupon de Instagram ");
        double valorCupon = valor * 0.05;
        System.out.println("Valor del cupon de Instagram: " + valorCupon);
        return valor - valorCupon;
    }

}
