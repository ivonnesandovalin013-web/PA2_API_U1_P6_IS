package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import uce.edu.pa2.api.deber.Producto;
import uce.edu.pa2.api.deber.CarritoService;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        //Modelos de IoC
        //1. DI
        @Inject
        private PedidoService pedidoService;

        //2. Service Locator (Lookup)
        //private PedidoService pedidoService = CDI.current().select(PedidoService.class).get();
        //@Inject
        //private CarritoService carritoService;

        @Override
        public int run(String... args) {

            //Caso 1
            System.out.println("------CASO 1------");
            PedidoService pedidoService = CDI.current().select(PedidoService.class).get();
            Pedido pedido = new Pedido("Ivonne Sandovalin", "Coca Cola", 90, "invonne@gmail.com");
            pedidoService.registrar(pedido);

            //Caso 2
            /*System.out.println("\n------CASO 2------");
            Pedido pedido2 = new Pedido("Ivonne Sandovalin", "Coca Cola", 120, "invonne@gmail.com");
            pedidoService.registrar(pedido2);

            //Caso 2
            System.out.println("\n------CASO 3------");
            Pedido pedido3 = new Pedido("Ivonne Sandovalin", "Coca Cola", 40, "invonne@gmail.com");
            pedidoService.registrar(pedido3);*/

            return 0;
        }
    }

}