package model;

public class Potencia implements Operador{

    @Override
    public double calcular(double a, double b) {
        return Math.pow(a, b);
    }
}