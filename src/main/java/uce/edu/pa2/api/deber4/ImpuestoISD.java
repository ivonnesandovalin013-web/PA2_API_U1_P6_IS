package uce.edu.pa2.api.deber4;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoISD implements Impuesto {

    @Override
    public double calcular(double valor) {
        System.out.println("Calculando impuesto ISD");
        double valorAImponer = valor * 0.05;
        System.out.println("Valor del ISD : " + valorAImponer);
        return valor + valorAImponer;
    }

}
