package uce.edu.pa2.api.bodega;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {

    // @Inject
    /*
     * private NotificadorMail notificadorMail;
     * 
     * //DI por constructor
     * 
     * @Inject
     * public PedidoService(NotificadorMail notificadorMail){
     * this.notificadorMail = notificadorMail;
     * }
     */

    // DI por atributo
    /*
     * @Inject
     * private NotificadorMail notificadorMail;
     */

    // DI por metodo
    /*private NotificadorMail notificadorMail;

    @Inject
    public void setNotificador(NotificadorMail notificadorMail) {
        this.notificadorMail = notificadorMail;
    }*/
        @Inject
        private NotificadorSelector selector;
        @Inject
        private ComprobanteSelector comprobante;

    public void registrar(Pedido pedido, PagoEstrategia pago) {
        // Lógica para registrar el pedido
        System.out.println("registrando pedido");
        System.out.println("cliente: " + pedido.getCliente());
        System.out.println("Total " + pedido.getTotal());
        System.out.println("guardando en la base de datos");

        pago.realizar(pedido.getTotal());

        Notificador notificador = this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), "Pedido Registrado");
        comprobante.seleccionar(pedido.getDestino()).generar(pedido.getDestino(), "Comprobante generado");
        

    }

}

