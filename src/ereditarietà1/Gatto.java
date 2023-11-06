package ereditarietà1;

import ereditarietà1.Animale;

public class Gatto extends Animale {

    public String versoGatto = "miao";

    @Override
    public void faiIlVerso() {
        System.out.println("il gatto fa " + versoGatto);
    }
}

