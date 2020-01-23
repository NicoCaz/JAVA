package com.componentes;

public class Raton extends DispositivosDeEntrada {

    private int idRaton;
     private double precio;
    private static int contRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++contRatones;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getPrecio(){
        return precio;
    }
     
    public int getIdRaton() {
        return idRaton;
    }

    public static int getContRatones() {
        return contRatones;
    }

    public static void setContRatones(int contRatones) {
        Raton.contRatones = contRatones;
    }
    

    @Override
    public String toString() {
        return super.toString() + "Raton{" + "idRaton=" + idRaton + "cantidad de ratones= " + contRatones + '}';
    }

}
