package ereditarieta2;

public class Forma {
    private int base = 7;
    private int altezza = 4;

    public int getBase(){
        return base;
    }

    public int getAltezza(){
        return altezza;
    }

    public void calcolaArea(){

        System.out.println("Per il calcolo dell'area delle forme i valori sono: " + getBase() + " e " + getAltezza());

    }
}
