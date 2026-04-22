package uce.edu.pa2.api.deber2;

import jakarta.inject.Singleton;

@Singleton
public class ContadorVentas {
    private int totalProductosVendidos = 0;

    public int incrementar() {
        return ++totalProductosVendidos;
    }
}