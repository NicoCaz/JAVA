package com.MundoPc;

import com.componentes.*;

public class MundoPc {

    public static void main(String[] args) {
        Orden orden1 = new Orden();
        Teclado teclado1 = new Teclado("comun", "pindorcho");
        Raton raton1 = new Raton("comun b", "miguelito");
        Monitor monitor1 = new Monitor("versus", 23);
        teclado1.setPrecio(320);
        raton1.setPrecio(400);
        monitor1.setPrecio(3450);
        Computadora pc1 = new Computadora("desktop numero 45", monitor1, teclado1, raton1);

        System.out.println(pc1.getPrecio());

        orden1.agregaComputadora(pc1);
        System.out.println("Precio total de la orden=  " + orden1.calculoTotal());
        orden1.mostrarOrden();

    }
}
