package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class DescuentoIVA implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando descuento IVA");
        double valorADescontar = valor * 0.15;
        return valor - valorADescontar;
        // return valor * 1.15;
    }

}
