package view;

import java.util.Scanner;
import controller.ControllerCalculadora;

public class Menu {

    public static void exibir(){
        try {
            Scanner sc = new Scanner(System.in);
            ControllerCalculadora control = new ControllerCalculadora();

            System.out.println("Soma");
            System.out.println("Subtração");
            System.out.println("Multiplicação");
            System.out.println("Divisão");
            System.out.println("Potência");
            System.out.println("Raiz");
            System.out.println("Digite a operação desejada: ");

            String operacao = sc.nextLine();

            System.out.println("Digite o Primeiro Valor");
            double a = sc.nextDouble();
            sc.nextLine();

            System.out.println("Digite o Segundo Valor");
            double b = sc.nextDouble();
            sc.nextLine();

            System.out.println(control.calcular(operacao, a, b));
        }

        catch (ArithmeticException e) {
            System.out.println("Divisao por 0 não dá");
        }

        catch (IllegalArgumentException e) {
            System.out.println("Operação Invalida");
        }
    }
}