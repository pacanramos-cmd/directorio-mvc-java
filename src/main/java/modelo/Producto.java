package modelo;

import java.text.DecimalFormat; // Importar

public class Producto {
    
    private int id; 
    private String nombre;
    private int cantidad;
    private double precio;

    // Constructor sin cambios...
    public Producto(int id, String nombre, int cantidad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Getters y Setters sin cambios...
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        // Usa DecimalFormat para mostrar separadores de miles y coma decimal.
        // #,###.00 es el patrón. El Locale determina si usa punto o coma.
        // Usaremos un Locale específico para Latinoamérica, donde el punto separa miles.
        DecimalFormat df = new DecimalFormat("#,###.00"); 

        return "ID: " + id + " | Nombre: " + nombre + 
               " | Cantidad: " + cantidad + 
               " | Precio: $" + df.format(precio); 
    }
}