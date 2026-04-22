package uce.edu.pa2.api.deber2;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent  
public class ServicioTienda {

    @Inject
    private ImpuestoGlobal impuesto;

    @Inject
    private ContadorVentas contador;

    @Inject
    private Carrito carrito;  

    public void comprar(String cliente, String producto, double precioBase) {
        System.out.println("\n--- Cliente: " + cliente + " ---");
        carrito.agregar(producto);
        carrito.mostrar();

        double total = precioBase * (1 + impuesto.getTasa());
        System.out.println("Impuesto aplicado: " + (impuesto.getTasa() * 100) + "%");
        System.out.println("Total a pagar: $" + total);

        int vendidos = contador.incrementar();
        System.out.println("Productos vendidos en total (global): " + vendidos);
    }
}
