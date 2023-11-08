package Astrazione1;

public class Triangolo extends Forma {
    public void calcolaArea() {
        System.out.println("L'area del triangolo è: " + getBase()*getAltezza()/2);
    }
}
