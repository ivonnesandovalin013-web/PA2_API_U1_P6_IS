package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    @Inject
    private NotificadorMail notificadorMail;
    
    public void registrar(Pedido pedido) {
        // Lógica para registrar el pedido
        System.out.println("registrando pedido");
        System.out.println(" cliente: " + pedido.getCliente());
        System.out.println("Total " + pedido.getTotal());
        System.out.println("guardando en la base de datos");

       
        notificadorMail.enviar(pedido.getCorreo(), "Su pedido ha sido registrado con éxito");


    }



}
