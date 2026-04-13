package uce.edu.pa2.api.deber;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorWhatsApp {
    
    public void enviar(String telefono, String mensaje) {
        System.out.println("Enviando WhatsApp al: " + telefono);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Mensaje enviado a whatsApp enviado exitosamente");
    }
}
