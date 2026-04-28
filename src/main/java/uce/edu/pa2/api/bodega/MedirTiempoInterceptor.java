package uce.edu.pa2.api.bodega;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo // no se ejecuta el interceptor si no para que se vincule con la anotacion
@Interceptor
public class MedirTiempoInterceptor {
    @AroundInvoke // indicamos que este metodo se ejecutara alrededor de la ejecucion de un
                  // metodo. Cada vez que se invoque al metodo procesar se ejecutara el metodo
                  // medir.
    public Object medir(InvocationContext context) throws Exception { // Debe retonar un object, reciba un
                                                                      // InvocationContext y lanzar una exception.
        System.out.println("Se ejecuto antes del metodo ");
        long inicio = System.currentTimeMillis();

        Object resultado = context.proceed(); // Inicia la ejecucion del metodo original, si no se llama al proceed
                                              // nunca se ejecutara el metodo original.
        // mientras no le de la orden del interceptor, el metodo medir no se ejecutara.
        // Pasa a la linea 14 una vez que se termine de ejecutar el metodo de negocio,
        // posteriormente ya puede medir el tiempo.
        long fin = System.currentTimeMillis();

        long tiempoTranscurrido = fin - inicio;

        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido + " ms\n");
        return resultado; // Retorna el resultado del metodo original, si no se retorna el resultado del
                          // metodo original, el metodo original no retornara nada y se perdera la
                          // funcionalidad del metodo original.
        // si retornamos null en lugar del resultado del metodo original, el metodo
        // original no retornara nada y se perdera la funcionalidad del metodo original.
    }
    // si colocamos el sleep mediria el tiempo en ejecutar el interceptor, pero lo
    // que queremos medir es el tiempo de ejecucion del metodo procesar, por lo
    // tanto el sleep se colocaria en el metodo procesar.
    // mientras no le de la orden del interceptor, el metodo medir no se ejecutara,
    // por lo tanto el tiempo transcurrido sera 0ms, pero si colocamos el sleep en
    // el metodo procesar, el tiempo transcurrido sera el tiempo que tarda en
    // ejecutar el metodo procesar.
}
