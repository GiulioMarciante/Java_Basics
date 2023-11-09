package Enum1;

public class Rettangolo implements Forma {
    enum tipoForma{
        Rettangolo
    }
    double base = 5;
    double altezza = 10;
    private final tipoForma forma;

    public Rettangolo(double base, double altezza, tipoForma forma) {
        this.base = base;
        this.altezza = altezza;
        this.forma = forma;
    }

    @Override
    public double CalcolaArea() {
        double area = base*altezza;
        System.out.println("Il calcolo dell'area del " + tipoForma.Rettangolo+ " è: "  + area );
        return 0;
    }
}