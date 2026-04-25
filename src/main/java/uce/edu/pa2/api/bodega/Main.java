package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorVentaService procesadorVentaService;
        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;
        @Inject
        private ProcesadorVentaEnLineaService procesadorVentaEnLineaService;
        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Override
        public int run(String... args) {

            Venta v1 = new Venta("Ivonne Sandovalin", 70.0);
            this.procesadorVentaService.procesar(v1);

            Venta v2 = new Venta("Nayely Tarco", 40.0);
            this.procesadorVentaService.procesar(v2);

            Venta v3 = new Venta("David Castillo", 20.0);
            this.procesadorVentaService.procesar(v3);

            Venta v4 = new Venta("David Castillo", 20.0);
            this.procesadorVentaService1.procesar(v4);

            Venta v5 = new Venta("David Castillo", 20.0);
            this.procesadorVentaService1.procesar(v5);

            Venta v6 = new Venta("Daye Castillo", 10.0);
            this.procesadorVentaEnLineaService.procesar(v6);

            Venta v7 = new Venta("Daye Castillo", 10.0);
            this.procesadorVentaEnLineaService.procesar(v7);

            this.estadisticasVentasGlobales.registrarVenta(v1.getTotal());
            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();

            return 0;
        }
    }

}