package com.sena;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<Producto> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }

    public void listarProductos() {
        System.out.println("=== PRODUCTOS EN EL CARRITO ===");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
