package Astrazione1;

public class Rettangolo extends Forma{
    public double calcolaArea() {
        System.out.println("L'area del rettangolo è: " + getBase()*getAltezza());
        return 0;
    }
}
