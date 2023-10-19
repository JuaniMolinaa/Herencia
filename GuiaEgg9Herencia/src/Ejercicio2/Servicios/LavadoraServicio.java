package Ejercicio2.Servicios;

import Ejercicio2.Entidades.*;
import java.util.Scanner;

public class LavadoraServicio extends ElectrodomesticoServicio {

    private Scanner obj = new Scanner(System.in).useDelimiter("\n");

    private Lavadora lava = new Lavadora();

    private ElectrodomesticoServicio electroService = new ElectrodomesticoServicio();

    public void crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga que tiene la lavadora");
        lava.setCarga(obj.nextDouble());
    }//cierra crearLavadora

    @Override
    public Double precioFinal() {
        //llama al metodo precioFinal de clase padre
        Double precioNormal = super.precioFinal();

        Double precioPeso = 0d;
        //precioNormal obtiene el valor del precio Padre
        //Double precioNormal = e.getPrecio();

        if (lava.getCarga() > 30) {
            precioPeso = 500d;
        }
        Double precioFinalLavadora = precioNormal + precioPeso;

        lava.setPrecio(precioFinalLavadora);

        return precioFinalLavadora;
    }//cierra precioFinal

}
