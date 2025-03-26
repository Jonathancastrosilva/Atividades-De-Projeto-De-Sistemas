package model;

public class Adicao implements Operador{
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}
