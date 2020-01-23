package com.gm.ventas;

public class Ventas {

    public static void main(String[] args) {
        Producto p1 = new Producto("camisa", 50);
        Producto p2 = new Producto("pantalo", 100);

        Orden orden1 = new Orden();
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.mostrarOrden();
    }
}
