package controller;

import model.*;

import java.lang.reflect.InvocationTargetException;

public class ControllerCalculadora {

    public double calcular(String operacao, double a, double b) {

        try {

            Operador operador = (Operador) Class.forName("model."+operacao).getDeclaredConstructor().newInstance();

            return operador.calcular(a, b);
        }

        catch (IllegalAccessException | NoSuchMethodException | ClassNotFoundException | InvocationTargetException | InstantiationException e) {

            throw new IllegalArgumentException("Operação inválida!", e);
        }
    }
}