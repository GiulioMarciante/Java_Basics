package polimorfismo1;

public class Triangolo extends Forma {
    @Override
    public double calcolaArea() {
        double area = getBase()*getAltezza()/2;
        System.out.println("l'area del Triangolo è: " + area);
        return area;
    }
}
