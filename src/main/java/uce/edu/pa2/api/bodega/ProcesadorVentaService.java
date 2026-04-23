package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaService {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;
    @Inject
    private TrakingVenta trakingVenta;

    public void procesar(Venta venta) {
        // inicia la venta
        this.trakingVenta.iniciar();
        System.out.println("Procesando pedido");
        // consultado el stock de cada item
        // consultando en la base de datos

        // voy a similar un tiempo de demora
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }

        // finaliza la venta
        this.trakingVenta.finaliza();

        // registra estadisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());

    }

}
