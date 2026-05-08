package uce.edu.pa2.api.tarea5;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CuponInstagram implements Cupones {

    @Override
    public double validarCupon(double valor) {
        System.out.println("Aplicando cupon de Instagram ");
        double valorCupon = valor * 0.05;
        System.out.println("Valor del cupon de Instagram: " + valorCupon);
        return valor - valorCupon;
    }

}
