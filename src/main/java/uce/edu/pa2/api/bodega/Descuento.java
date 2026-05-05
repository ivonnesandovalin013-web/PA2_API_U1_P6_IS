package uce.edu.pa2.api.bodega;

public interface Descuento {
    //va a recibir un valor y va a retornar el valor con el descuento aplicado pero no sabemos el como se va a aplicar el descuento,cada clase que implemente esta interfaz va a aplicar el descuento de una manera diferente
    public double aplicar(double valor);

}
