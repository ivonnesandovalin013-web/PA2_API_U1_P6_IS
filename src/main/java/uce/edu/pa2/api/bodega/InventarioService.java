package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InventarioService {
    @MedirTiempo
    public void registrar(Venta venta) {

        System.out.println("-----REGISTRAR EN EL INVENTARIO-----");
        // consultado el stock de cada item
        // consultando en la base de datos
        // voy a similar un tiempo de demora
        try {
            Thread.sleep(500);
        } catch (Exception e) {

        }
        System.out.println("-----FINAL DEL REGISTRO EN EL INVENTARIO-----");

    }


}
