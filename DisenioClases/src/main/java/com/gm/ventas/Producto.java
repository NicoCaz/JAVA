package com.gm.ventas;

public class Producto {

    private String nombre;
    private int idProducto;
    private double precio;
    private static int contPro;

    private Producto() {
        this.idProducto = ++contPro;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContPro() {
        return contPro;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", idProducto=" + idProducto + ", precio=" + precio + '}';
    }

}
