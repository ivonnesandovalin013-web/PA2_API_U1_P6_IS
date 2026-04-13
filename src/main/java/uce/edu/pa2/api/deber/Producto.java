package uce.edu.pa2.api.deber;

public class Producto {
    private String nombre;
    private double precio;
    private String telefono;

    public Producto() {}

    public Producto(String nombre, double precio, String telefono) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}