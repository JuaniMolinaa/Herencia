package Ejercicio1;

import Ejercicio1.Entidades.*;

public class AnimalMain {

    public static void main(String[] args) {

        AnimalEntidad perro = new PerroEntidad("Stitch", "Carnivoro", 16, "Doberman");
        perro.alimentarse();

        PerroEntidad perro1 = new PerroEntidad("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.alimentarse();

        AnimalEntidad gato = new GatoEntidad("Pelusa", "Galletas", 15, "Siames");
        gato.alimentarse();

        AnimalEntidad caballo = new CaballoEntidad("Spark", "Pasto", 25, "Fino");
        caballo.alimentarse();

    }

}
