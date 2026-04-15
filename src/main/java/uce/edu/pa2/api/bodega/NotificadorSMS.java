package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorSMS implements Notificador {
    public void enviar(String destino, String mensaje) {
        System.out.println("se envia el SMS al numero: " + destino);
        System.out.println("con el mensaje: " + mensaje);
    }
}
