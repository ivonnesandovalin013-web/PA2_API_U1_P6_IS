package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.pa2.api.deber.Producto;
import uce.edu.pa2.api.deber.CarritoService;

@QuarkusMain
public class Main {

    public static void main(String... args) {

        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {

        @Inject
        private PedidoService pedidoService;
        
        @Inject
        private CarritoService carritoService;

        @Override
        public int run(String... args) {

            System.out.println("------TALLER PEDIDO------");
            Pedido pedido = new Pedido("Ivonne Sandovalin", "Coca Cola", 1200, "invonne@gmail.com");
            this.pedidoService.registrar(pedido);

            System.out.println("\n------DEBER: CARRITO DE COMPRAS------");
            Producto producto = new Producto("PlayStation 5", 499.99, "0999123456");
            this.carritoService.comprar(producto);

            return 0;
        }
    }

}