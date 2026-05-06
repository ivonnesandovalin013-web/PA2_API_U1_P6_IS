package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.deber4.ProcesadorImpuestoService;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private ProcesadorImpuestoService impuestoService;

        @Override
        public int run(String... args) {

            Compra comp1 = new Compra("Ivonne Sandovalin", Double.valueOf(100));
            this.impuestoService.procesarImpuestos(comp1);

            return 0;
        }
    }

}