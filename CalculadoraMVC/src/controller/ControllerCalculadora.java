package controller;

import model.*;

import java.lang.reflect.InvocationTargetException;

public class ControllerCalculadora {

    public double calcular(String operacao, double a, double b) {

        String operacaoUsada = operacao.substring(0, 1).toUpperCase() + operacao.substring(1).toLowerCase();

        try {

            Operador operador = (Operador) Class.forName("model."+operacaoUsada).getDeclaredConstructor().newInstance();

            return operador.calcular(a, b);
        }

        catch (IllegalAccessException | NoSuchMethodException | ClassNotFoundException | InvocationTargetException | InstantiationException e) {

            throw new IllegalArgumentException("Operação inválida!", e);

        }
    }
}