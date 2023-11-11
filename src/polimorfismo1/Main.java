package polimorfismo1;

public class Main {
    public static void main(String[] args){

        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();

        forma.calcolaArea();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}
