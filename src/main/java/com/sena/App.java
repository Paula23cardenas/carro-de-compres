package com.sena;

public class App {
    public static void main(String[] args) {

       
     Producto producto1 = new Producto("PC Gamer", 3500000.00, 1);
     Producto producto2 = new Producto("Celular Samsung", 1200000.00, 2);
     Producto producto3 = new Producto("Tablet Lenovo", 900000.00, 1);
      Producto producto4 = new Producto("Audifonos Bluetooth", 200000.00, 3);


   Carrito carrito = new Carrito();

     carrito.agregarProducto(producto1);
     carrito.agregarProducto(producto2);
     carrito.agregarProducto(producto3);
     carrito.agregarProducto(producto4);

        
     carrito.listarProductos();

        
    double total = carrito.calcularTotal();
     System.out.println("Subtotal: $" + total);

    
    double totalConIVA = total * 1.19;
    System.out.println("Total a pagar con IVA (19%): $" + totalConIVA);

    producto1.setPrecio(3300000.00);
    producto1.setCantidad(2);
    System.out.println("Producto actualizado: " + producto1.getNombre() +
             " | Precio: $" + producto1.getPrecio() +
            " | Cantidad: " + producto1.getCantidad());

    producto2.vender(1);
    System.out.println("Cantidad restante de " + producto2.getNombre() + ": " + producto2.getCantidad());
     try {
            producto3.vender(2);
            System.out.println("Cantidad restante de " + producto3.getNombre() + ": " + producto3.getCantidad());
     } catch (IllegalArgumentException e) {
          System.out.println("Error al vender: " + e.getMessage());
        }

    }
}


