package ereditarieta2;

public class Rettangolo extends Forma {
    @Override
    public double calcolaArea() {
        double area = getBase()*getAltezza();
        System.out.println("l'area del Rettangolo è: " + area );
        return area;
    }
 }




