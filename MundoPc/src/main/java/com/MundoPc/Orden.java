//CREA LA ORDEN DE LA COMPUTADORA PARA SER VENDIDA
package com.MundoPc;

public class Orden {

    private int idOrden;
    private static final int MAX_COMPUTADORAS = 15;
    private Computadora vecComputadoras[]; 
    private static int contOrdenes;
    private int contComputadoras;

    public Orden() {
        idOrden = ++contOrdenes;
        vecComputadoras = new Computadora[MAX_COMPUTADORAS];
        
    }

    public void agregaComputadora(Computadora computadora) {
        if (contComputadoras > MAX_COMPUTADORAS) {
            System.out.println("MAXIMO DE COMPUTADORAS ALCANZADO!!!");
        } else {
            vecComputadoras[contComputadoras++] = computadora;
        }

    }

    public double calculoTotal() {
        double total = 0;
        for (int i = 0; i < contComputadoras; i++) {
            total =total +  vecComputadoras[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("La orden con ID= " + this.idOrden + " tiene un costo de= " + calculoTotal() + ", a continuacion se mostraran los detalles: \n \n");
        for(int i=0;i<contComputadoras;i++)
            System.out.println("Computadora numero "+ i+1 + " con un precio de : " + vecComputadoras[i].getPrecio());
    }
}

