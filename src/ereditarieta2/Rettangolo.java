package ereditarieta2;

public class Rettangolo extends Forma {
    @Override
    public void calcolaArea() {
        System.out.println("l'area del Rettangolo è: " + getBase()*getAltezza());
    }
    public static void main(String[] args){

        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();

        forma.calcolaArea();
        rettangolo.calcolaArea();
    }
 }




