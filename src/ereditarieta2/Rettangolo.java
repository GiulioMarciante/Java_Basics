package ereditarieta2;

public class Rettangolo extends Forma {
    int baseRet = 15;
    int altezzaRet = 22;
    @Override

    public void calcolaArea() {
        System.out.println("l'area del rettangolo è: " + baseRet*altezzaRet);
    }
    public static void main(String[] args){

        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();

        forma.calcolaArea();
        rettangolo.calcolaArea();
    }
 }




