package ereditarieta1;

public class Gatto extends Animale {

    public String versoGatto = "miao";

    @Override
    public void faiIlVerso() {
        System.out.println("il gatto fa " + versoGatto);
    }
}

