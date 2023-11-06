package getter2;

import getter2.Auto;

public class AutoMain {
    public static void main(String[] args) {
        Auto auto1 = new Auto(2000, "GA20BQ", "Audi", "TT");
        System.out.println("La marca dell'auto è: " + auto1.getMarca());
        System.out.println("Il modello dell'auto è: " + auto1.getModello());
        System.out.println("La cilindrata dell'auto è: " + auto1.getCilindrata());
        System.out.println("La targa dell'auto è: " + auto1.getTarga()+ "\n");
        System.out.println(auto1+ "\n");

        System.out.println("La marca dell'auto è diventata: " + auto1.setMarca("Fiat"));
        System.out.println("Il modello dell'auto è diventata: " + auto1.setModello("Panda"));
        System.out.println("La cilindrata dell'auto è diventata: " + auto1.setCilindrata(1000));
        System.out.println("La targa dell'auto è diventata: " + auto1.setTarga("BC39TW")+ "\n");
        System.out.println(auto1.toString());
    }
}
