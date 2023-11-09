package Interfaccia1;

public class Rettangolo implements Forma {

    double base = 5;
    double altezza = 10;

    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double CalcolaArea() {
        double area = base*altezza;
        System.out.println("Il calcolo dell'area del rettangolo è: " + area);
        return 0;
    }
}
