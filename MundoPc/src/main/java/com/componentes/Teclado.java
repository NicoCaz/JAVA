// CLASE HIJA DE DISPOSITIVOS DE ENTRADA;
package com.componentes;


public class Teclado extends DispositivosDeEntrada{
    private int idTeclado;
    private static int contTeclado;
     private double precio;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado=++contTeclado;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return precio;
    }
    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    public static int getContTeclado() {
        return contTeclado;
    }

    public static void setContTeclado(int contTeclado) {
        Teclado.contTeclado = contTeclado;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" + "idTeclado=" + idTeclado + "cantidad de teclados= " + contTeclado + '}';
    }
    
    
    
    
    
    
    
}
