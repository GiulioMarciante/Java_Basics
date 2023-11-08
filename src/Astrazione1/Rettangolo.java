package Astrazione1;

public class Rettangolo extends Forma{
    public void calcolaArea() {
        System.out.println("L'area del rettangolo è: " + getBase()*getAltezza());
    }
}
