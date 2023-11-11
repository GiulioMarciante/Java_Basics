package Astrazione1;

public class Triangolo extends Forma {
    public double calcolaArea() {
        System.out.println("L'area del triangolo è: " + getBase()*getAltezza()/2);
        return 0;
    }
}
