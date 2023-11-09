package Interfaccia1;

public class Triangolo implements Forma {
    double base = 5;
    double altezza = 10;
    public Triangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double CalcolaArea() {
        double area = base*altezza/2;
        System.out.println("Il calcolo dell'area del triangolo è: " + area);
        return 0;
    }
}
