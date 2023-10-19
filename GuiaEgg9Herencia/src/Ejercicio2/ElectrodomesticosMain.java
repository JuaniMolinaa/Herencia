package Ejercicio2;

import Ejercicio2.Entidades.*;
import Ejercicio2.Servicios.*;

public class ElectrodomesticosMain {

    public static void main(String[] args) {
        Televisor tv = new Televisor();
        Lavadora lava = new Lavadora();

        LavadoraServicio lavaSv = new LavadoraServicio();
        TelevisorServicio tvsv = new TelevisorServicio();

        System.out.println("CARGANDO LAVADORA:");
        lavaSv.crearLavadora();
        Double precioLavadora = lavaSv.precioFinal();

        System.out.println("El precio final de la lavadora es: " + precioLavadora + "\n");

        System.out.println("CARGANDO TELEVISOR");
        tvsv.crearTelevisor();
        Double precioTelevisor = tvsv.precioFinal();
        System.out.println("El precio final del televisor es: " + precioTelevisor + "\n");

    }

}
