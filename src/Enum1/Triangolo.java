package Enum1;

public class Triangolo extends Forma {

    public Triangolo(double base, double altezza) {
        super(base, altezza, TipoForma.Triangolo);
    }

    @Override
    public double calcolaArea() {
        double area = base*altezza/2;
        System.out.println("Il calcolo dell'area del " + TipoForma.Triangolo+ " è: "  + area );
        return area;
    }
}