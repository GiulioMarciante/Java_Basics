package ereditarietà1;

import ereditarietà1.Animale;
import ereditarietà1.Gatto;

public class MainVerso {
    public static void main(String[] args) {
        Animale animale = new Animale();
        Gatto gatto = new Gatto();

        animale.faiIlVerso();
        gatto.faiIlVerso();
    }
}
