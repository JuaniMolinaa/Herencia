/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2.Servicios;

import Ejercicio2.Entidades.*;
import java.util.Scanner;

public class TelevisorServicio extends ElectrodomesticoServicio {

    private Scanner obj = new Scanner(System.in).useDelimiter("\n");

    private Televisor tele = new Televisor();

    private ElectrodomesticoServicio electroService = new ElectrodomesticoServicio();

    public void crearTelevisor() {
        int opc;
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolución en pulgadas del televisor");
        tele.setResolucion(obj.nextDouble());

        System.out.println("¿El televisor posee sintonizador TDT?");
        System.out.println("Ingrese 1 si posee, 2 si no posee, de otro modo, por defecto se asignará que no posee");
        opc = obj.nextInt();
        if (opc == 1) {
            tele.setTDT(true);
        } else {
            tele.setTDT(false);
        }
    }//cierra crearTelevisor

    @Override
    public Double precioFinal() {
        super.precioFinal();

        Double precioResolucion = 1d;
        int precioTDT = 0;

        if (tele.getResolucion() > 40) {
            precioResolucion = 1.3;
        }
        if (tele.getTDT() == true) {
            precioTDT = 500;
        }

        Double precioNormal = e.getPrecio();

        Double precioFinalTelevisor = ((precioNormal + precioTDT) * precioResolucion);

        tele.setPrecio(precioFinalTelevisor);
        
        return precioFinalTelevisor;
    }//cierra precioFinal

}
