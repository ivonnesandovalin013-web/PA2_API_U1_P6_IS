package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ComprobanteSelector {

    @Inject
    private ComprobantePDF pdf;
    @Inject
    private ComprobanteFisico fisico;

    public ComprobanteTipo seleccionar(String destino) {
        if (destino == null) {
            // PDF
            return fisico;
        } else {
            // FISICO
            return pdf;
        }
    }

}
