package com.componentes;

public class Monitor {

    private int idMonitor;
    private String marca;
    private double tamanio;
    private double precio;
    private static int contMonitores;

    public Monitor() {
        idMonitor = ++contMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContMonitores() {
        return contMonitores;
    }

    public static void setContMonitores(int contMonitores) {
        Monitor.contMonitores = contMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + ", precio=" + precio + '}';
    }

    
    
    
    
}
