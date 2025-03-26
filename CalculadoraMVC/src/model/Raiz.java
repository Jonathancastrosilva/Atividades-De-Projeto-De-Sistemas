package model;

public class Raiz implements Operador{

    @Override
    public double calcular(double a, double b) {
        return Math.pow(a, 1/b);
    }
}