package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DescuentoPorTemporada implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando descuento por temporada");
        double valorADescontar = valor * 0.25;
       // System.out.println("Valor a descontar: " + valorADescontar);
        return valor - valorADescontar;
    }

}
