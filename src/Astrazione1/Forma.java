package Astrazione1;

public abstract class Forma {
    private int base = 9;
    private int altezza = 6;

    public int getBase() {
        return base;
    }
    public int getAltezza() {
        return altezza;
    }

    public abstract double calcolaArea();
}
