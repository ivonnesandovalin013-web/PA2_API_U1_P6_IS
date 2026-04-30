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
        private ProcesadorVentaServiceTiempo procesadorVentaServiceTiempo;
        @Inject
        private InventarioService inventarioService;
      

        @Override
        public int run(String... args) {

            Venta v1 = new Venta("Ivonne Sandovalin", 70.0);
            this.procesadorVentaServiceTiempo.procesar(v1);
            //this.procesadorVentaServiceTiempo.reProcesar(v1);
            //this.inventarioService.registrar(v1);

            return 0;
        }
    }

}