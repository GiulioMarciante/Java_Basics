package Interfaccia1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo (5,7);
        Triangolo triangolo = new Triangolo(3,6);

        rettangolo.CalcolaArea();
        triangolo.CalcolaArea();
    }
}
