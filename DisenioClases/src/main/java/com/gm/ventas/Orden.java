package com.gm.ventas;

public class Orden {

    private int idOrden;
    private Producto vecProductos[];
    private static int canOrden;
    private int canPro;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++canOrden;
        vecProductos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (canPro < MAX_PRODUCTOS) {
            vecProductos[canPro++] = producto;
        } else {
            System.out.println("CANTIDAD MAXIMA DEE PRODUCTOS ALCANZADA ( " + canPro + " )");
        }
    }

    public double total() {
        double suma = 0.0;
        for (int i = 0; i < canPro; i++) {
            suma = vecProductos[i].getPrecio();
        }
        return suma;
    }

    public void mostrarOrden() {
        String nombre;
        System.out.println("Orden nª " + this.idOrden);
        System.out.println("con un total de= " + total());
        for (int i = 0; i < canPro; i++) {
            nombre = vecProductos[i].getNombre();
            System.out.println(" \n " + nombre);
        }

    }
}
