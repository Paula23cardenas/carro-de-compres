package com.sena;

public class Producto {


    private String nombre;
    private double precio;
    private int cantidad;


    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        setPrecio(precio);
        setCantidad(cantidad);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        this.cantidad = cantidad;
    }

    public void vender(int cantidadVendida) {
        if (cantidadVendida < 0) {
            throw new IllegalArgumentException("La cantidad vendida no puede ser negativa.");
        }
        if (cantidadVendida > cantidad) {
            throw new IllegalArgumentException("No hay suficiente stock.");
        }
        cantidad -= cantidadVendida;
    }

    
    @Override
    public String toString() {
        return "Producto: " + nombre +
                ", Precio: $" + precio +
                ", Cantidad: " + cantidad;
    }
}
