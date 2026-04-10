# Carro de Compras

## Descripción

Este proyecto consiste en una aplicación que simula el funcionamiento de un carrito de compras. Permite agregar productos, visualizarlos y gestionar la información dentro del sistema.

El objetivo principal es aplicar conceptos de programación y lógica para representar un sistema real de compras.

---

## Objetivo

Desarrollar una aplicación que permita gestionar productos dentro de un carrito de compras, aplicando buenas prácticas de programación y organización del código.

---

## Funcionalidades

* Agregar productos al carrito
* Mostrar productos agregados
* Calcular total de la compra
* Gestionar información de cada producto

---

## Estructura del proyecto

```bash
carro-de-compres/
├── src/
│   ├── Producto.java
│   ├── Carrito.java
│   └── Main.java
└── README.md
```

---

## Explicación del código

### Clase Producto

Esta clase representa un producto dentro del sistema.

```java
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
```

✔ Se usa **encapsulación** (atributos privados)
✔ Métodos getter para acceder a los datos

---

### Clase Carrito

Esta clase gestiona los productos agregados.

```java
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Producto> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - $" + p.getPrecio());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
}
```

✔ Uso de listas para almacenar productos
✔ Métodos para agregar, mostrar y calcular total
✔ Representa la lógica principal del sistema

---

### Clase Main

Clase principal donde se ejecuta el programa.

```java
public class Main {
    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        Producto p1 = new Producto("Camisa", 50000);
        Producto p2 = new Producto("Pantalón", 80000);

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);

        carrito.mostrarProductos();

        System.out.println("Total: $" + carrito.calcularTotal());
    }
}
```

✔ Se crean los objetos
✔ Se agregan al carrito
✔ Se muestra la información

---

## Cómo ejecutar el proyecto

1. Abrir la terminal en la carpeta `src`
2. Compilar:

```bash
javac *.java
```

3. Ejecutar:

```bash
java Main
```

---

## Salida esperada

```bash
Camisa - $50000
Pantalón - $80000
Total: $130000
```

---

## Conceptos aplicados

* Encapsulación
* Uso de listas (ArrayList)
* Programación orientada a objetos
* Separación de responsabilidades

---

## Conclusión

Este proyecto permite entender cómo funciona un sistema básico de carrito de compras y cómo organizar el código en clases que representen entidades reales.

---

## Autor

Paula Cardenas
