package Enum1;

public class Main {
    public static void main(String[] args) {
       Rettangolo rettangolo = new Rettangolo(5,7, Rettangolo.tipoForma.Rettangolo);
       Triangolo triangolo = new Triangolo(3,6, Triangolo.tipoForma.Triangolo);

        rettangolo.CalcolaArea();
        triangolo.CalcolaArea();
    }
}


