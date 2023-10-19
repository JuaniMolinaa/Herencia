package Ejercicio2.Entidades;

public class Lavadora extends Electrodomestico {

    protected Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
}
