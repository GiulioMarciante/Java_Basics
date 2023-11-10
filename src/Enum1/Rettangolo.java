package Enum1;

public class Rettangolo extends Forma {

    public Rettangolo (double base, double altezza) {
        super(base, altezza, TipoForma.Rettangolo);
    }

    @Override
    public double calcolaArea() {
        double area = base*altezza;
        System.out.println("Il calcolo dell'area del " + TipoForma.Rettangolo+ " è: "  + area );
        return area;
    }
}