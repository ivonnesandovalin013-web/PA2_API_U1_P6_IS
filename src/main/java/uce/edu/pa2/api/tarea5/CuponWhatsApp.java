package uce.edu.pa2.api.tarea5;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)    
public class CuponWhatsApp  implements Cupones {

    @Override
    public double validarCupon(double valor) {
       System.out.println("Aplicando cupon de WhatsApp ");
        double valorCupon = valor * 0.02;
        System.out.println("Valor del cupon de WhatsApp: " + valorCupon);
        return valor - valorCupon;
    }

}
