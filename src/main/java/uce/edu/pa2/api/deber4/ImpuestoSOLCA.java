package uce.edu.pa2.api.deber4;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoSOLCA implements Impuesto {

    @Override
    public double calcular(double valor) {
        System.out.println("Calculando impuesto SOLCA");
        double valorAImponer = valor * 0.02;
        System.out.println("Valor de SOLCA : " + valorAImponer);
        return valor + valorAImponer;
    }

}
