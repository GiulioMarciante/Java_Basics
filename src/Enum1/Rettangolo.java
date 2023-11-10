package Enum1;

public class Rettangolo extends Forma {
    double base;
    double altezza;

    public Rettangolo(double base, double altezza, tipoForma forma) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double CalcolaArea() {
        double area = base*altezza;
        System.out.println("Il calcolo dell'area del " + tipoForma.Rettangolo+ " è: "  + area );
        return 0;
    }
}