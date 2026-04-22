package uce.edu.pa2.api.deber2;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Carrito {
    private List<String> productos = new ArrayList<>();

    public void agregar(String producto) {
        productos.add(producto);
    }

    public void mostrar() {
        System.out.println("Carrito: " + productos);
    }
}