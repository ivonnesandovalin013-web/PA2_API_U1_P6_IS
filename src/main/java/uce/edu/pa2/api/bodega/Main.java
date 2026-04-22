package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.deber2.Carrito;
import uce.edu.pa2.api.deber2.ImpuestoGlobal;
import uce.edu.pa2.api.deber2.ServicioTienda;


@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {
        /*@Inject
        private AmbitoAplicacion ambitoAplicacion;

        @Inject
        private ClaseIntermedia claseIntermedia;

        @Inject
        private AmbitoRequest ambitoRequest;

        @Inject
        private AmbitoInject ambitoInject;

        @Inject
        private AmbitoSingleton ambitoSingleton;*/

        @Inject
        private ServicioTienda servicioAna;

        @Inject
        private Carrito carritoLuis;

        @Inject
        private ImpuestoGlobal impuestoGlobal;

        @Inject 
        private ServicioTienda servicioLuis; 

        @Override
        public int run(String... args) {

            /*System.out.println(this.ambitoAplicacion);

            System.out.println(this.ambitoAplicacion.incrementar());
            System.out.println(this.ambitoAplicacion.incrementar());
            System.out.println(this.ambitoAplicacion.incrementar());

            this.claseIntermedia.imprimirObjetoValor();

            System.out.println("*********************AMBITO REQUEST**********************");
            /*System.out.println(this.ambitoRequest.incrementar());
            System.out.println(this.ambitoRequest.incrementar());
            System.out.println(this.ambitoRequest.incrementar());*/

            /*System.out.println("*********************AMBITO DEPENDENT**********************");
            System.out.println(this.ambitoInject.incrementar());
            System.out.println(this.ambitoInject.incrementar());
            System.out.println(this.ambitoInject.incrementar());

            this.claseIntermedia.imprimirObjetoValorInject();

            System.out.println("*********************AMBITO SINGLETON**********************");
            System.out.println(this.ambitoAplicacion);
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());
            System.out.println(this.ambitoSingleton.incrementar());

            this.claseIntermedia.imprimirObjetoValorSingleton();*/

            System.out.println("===== REFERENCIAS DE OBJETOS =====");
            System.out.println("servicioAna   = " + servicioAna);
            System.out.println("servicioLuis  = " + servicioLuis);
            System.out.println("carritoLuisDirecto = " + carritoLuis);
            System.out.println("impuestoGlobal = " + impuestoGlobal);

            System.out.println("\n===== TIENDA VIRTUAL =====");
            System.out.println("Impuesto inicial: " + (impuestoGlobal.getTasa() * 100) + "%");

            // Ana compra (usa su servicio y su carrito interno)
            servicioAna.comprar("Ana", "Laptop", 800);

            // Luis compra con su propio servicio (debe tener su propio carrito interno)
            servicioLuis.comprar("Luis", "Mouse", 20);

            // También Luis tiene un carrito inyectado directamente (independiente)
            carritoLuis.agregar("Pan");
            System.out.print("Carrito directo de Luis: ");
            carritoLuis.mostrar();

            System.out.println("\n===== CAMBIO DE IMPUESTO GLOBAL =====");
            impuestoGlobal.setTasa(0.10);
            System.out.println("Nuevo impuesto: " + (impuestoGlobal.getTasa() * 100) + "%");

            // Ana vuelve a comprar (mismo servicioAna, mismo carrito interno)
            servicioAna.comprar("Ana", "Teclado", 50);

            // Mostrar de nuevo referencias para ver que no cambiaron
            System.out.println("\n===== REFERENCIAS (después) =====");
            System.out.println("servicioAna   = " + servicioAna);
            System.out.println("servicioLuis  = " + servicioLuis);
            System.out.println("impuestoGlobal = " + impuestoGlobal);


            return 0;
        }
    }

}