package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobanteFisico implements ComprobanteTipo {

    @Override
    public void generar(String destino, String mensaje) {
        System.out.println("Generando comprobante físico sin destino: " + destino + " con el mensaje: " + mensaje);
    }

}
