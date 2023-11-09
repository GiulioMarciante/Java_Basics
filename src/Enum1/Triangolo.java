package Enum1;

public class Triangolo implements Forma {
    enum tipoForma{
        Triangolo
    }
    double base = 5;
    double altezza = 10;

    private final tipoForma forma;
    public Triangolo(double base, double altezza,tipoForma forma){
        this.base = base;
        this.altezza = altezza;
        this.forma = forma;
    }

    @Override
    public double CalcolaArea() {
        double area = base*altezza/2;
        System.out.println("Il calcolo dell'area del " + tipoForma.Triangolo+ " è: "  + area );
        return 0;
    }
}