package Enum1;

public class Main {
    public static void main(String[] args) {
       Rettangolo rettangolo = new Rettangolo(5,7,tipoForma.Rettangolo);
       Triangolo triangolo = new Triangolo(3,6,tipoForma.Triangolo);

        rettangolo.CalcolaArea();
        triangolo.CalcolaArea();
    }
}


