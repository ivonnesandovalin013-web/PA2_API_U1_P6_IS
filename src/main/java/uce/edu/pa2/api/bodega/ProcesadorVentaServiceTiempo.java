package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaServiceTiempo {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo // Con esta anotacion le decimos que queremos medir el tiempo de este metodo. Se va a interceptar este metodo y se va a ejecutar antes de ejercutar el metodo procesar.
    @Log
    public void procesar(Venta venta) {
        //System.out.println("Entro al metodo con los siguiente valores: " + venta.getCliente());
        //inicia el venta
        System.out.println("Procesando pedido");
        // consultado el stock de cada item
        // consultando en la base de datos
        // voy a similar un tiempo de demora
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }

        // registra estadisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del pedido");
        //this.reProcesar(venta);

    }

    @MedirTiempo
    public void reProcesar(Venta venta) {

        System.out.println("Reprocesando pedido");
        // consultado el stock de cada item
        // consultando en la base de datos
        // voy a similar un tiempo de demora
        try {
            Thread.sleep(250);
        } catch (Exception e) {

        }

        // registra estadisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final el reproceso");

    }

}
