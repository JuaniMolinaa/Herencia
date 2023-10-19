package Ejercicio2.Servicios;

import Ejercicio2.Entidades.Electrodomestico;
import com.sun.org.apache.regexp.internal.CharacterArrayCharacterIterator;
import java.util.Scanner;

public class ElectrodomesticoServicio {

    private Scanner obj = new Scanner(System.in).useDelimiter("\n");

    protected Electrodomestico e = new Electrodomestico();

    //recibe un caracter, lo pasa a Mayuscula y compara si coincide con las letras validas
    public void comprobarConsumoEnergetico(char letra) {

        Character.toUpperCase(letra);

        if (!(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F')) {
            e.setConsumoEnergetico('F');
        } else {
            e.setConsumoEnergetico(Character.toUpperCase(letra));
        }
    }//cierra comprobarConsumoEnergetico

    //recibe un string color, compara con los colores validos y setea el color
    public void comprobarColor(String color) {

        if (!(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris"))) {
            e.setColor("blanco");
        } else {
            e.setColor(color);
        }

    }//cierra comprobarColor

    public void crearElectrodomestico() {

        String colorUser;
        Character consumoEnerUser;
        int peso;

        //carga el precio base de $1000
        e.setPrecio(1000d);

        System.out.println("Ingrese el color del electrodoméstico (blanco-negro-rojo-azul-gris)");
        colorUser = obj.next();
        comprobarColor(colorUser);

        System.out.println("Ingrese el consumo energético (letra entre A y F)");
        consumoEnerUser = obj.next().charAt(0);
        comprobarConsumoEnergetico(consumoEnerUser);

        System.out.println("Ingrese el peso en kg del electrodoméstico");
        e.setPeso(obj.nextDouble());

    }//cierra crearElectrodomestico

    public Double precioFinal() {

        Double precioConsumo = 0d;
        Double precioPeso = 0d;

        Character consumoEner = e.getConsumoEnergetico();

        if (consumoEner == 'A' || consumoEner == 'a') {
            precioConsumo = 1000d;
        } else {
            if (consumoEner == 'B' || consumoEner == 'b') {
                precioConsumo = 800d;
            } else {
                if (consumoEner == 'C' || consumoEner == 'c') {
                    precioConsumo = 600d;
                } else {
                    if (consumoEner == 'D' || consumoEner == 'd') {
                        precioConsumo = 500d;
                    } else {
                        if (consumoEner == 'E' || consumoEner == 'e') {
                            precioConsumo = 300d;
                        } else {
                            precioConsumo = 100d;
                        }//if F
                    }//if E
                }//if D
            }//if C
        }//if B

        if (e.getPeso() >= 1 && e.getPeso() <= 19) {
            precioPeso = 100d;
        } else {
            if (e.getPeso() >= 20 && e.getPeso() <= 49) {
                precioPeso = 500d;
            } else {
                if (e.getPeso() >= 50 && e.getPeso() <= 80) {
                    precioPeso = 800d;
                } else {
                    if (e.getPeso() > 80) {
                        precioPeso = 1000d;
                    }
                }
            }
        }
        Double precioAux = e.getPrecio();
        Double precioFinal = precioAux + precioConsumo + precioPeso;
        e.setPrecio(precioFinal);

        return precioFinal;

    }//cierra precioFinal

}//cierra ElectrodomesticoServicio
