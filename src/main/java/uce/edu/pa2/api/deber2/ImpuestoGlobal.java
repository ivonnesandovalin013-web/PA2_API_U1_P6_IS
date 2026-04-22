package uce.edu.pa2.api.deber2;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImpuestoGlobal {
    private double tasa = 0.19; // 19% de impuesto

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double nuevaTasa) {
        this.tasa = nuevaTasa;
    }
}