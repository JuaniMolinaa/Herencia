package Ejercicio2.Entidades;


public class Televisor extends Electrodomestico {
    
    protected Double resolucion;
    protected Boolean TDT;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(Double resolucion, Boolean TDT, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }
    
    
    
}
