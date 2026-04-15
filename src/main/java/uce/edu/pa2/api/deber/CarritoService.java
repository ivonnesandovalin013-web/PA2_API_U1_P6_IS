package uce.edu.pa2.api.deber;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CarritoService {

    @Inject
    private NotificadorWhatsApp notificadorWhatsApp;

    public void comprar(Producto producto) {
        System.out.println("procesando compra");
        System.out.println("producto: " + producto.getNombre());
        System.out.println("precio: $" + producto.getPrecio());
        System.out.println("guardando en la base de datos");

        notificadorWhatsApp.enviar(producto.getTelefono(),
                "Su compra de " + producto.getNombre() + " por $" + producto.getPrecio()
                        + " ha sido registrada con éxito");
    }
}