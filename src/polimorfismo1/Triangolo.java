package polimorfismo1;

public class Triangolo extends Forma {
    @Override
    public void calcolaArea() {
        System.out.println("l'area del Triangolo è: " + setBase(8)*setAltezza(10)/2);
    }
}
