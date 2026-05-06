package uce.edu.pa2.api.deber4;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoIVA implements Impuesto {

    @Override
    public double calcular(double valor) {
        System.out.println("Calculando impuesto IVA");
        double valorAImponer = valor * 0.15;
        System.out.println("Valor del IVA : " + valorAImponer);
        return valor + valorAImponer;
    }

}
