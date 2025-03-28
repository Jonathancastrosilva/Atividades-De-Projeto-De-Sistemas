package view;

import java.util.Scanner;
import java.text.Normalizer;

import controller.ControllerCalculadora;

public class Menu {

    public static void exibir(){

        boolean continua = true;

        Scanner sc = new Scanner(System.in);
        ControllerCalculadora control = new ControllerCalculadora();
        
        while (continua == true){

            System.out.println("Adicao, Subtracao, Multiplicacao, Divisao, Potencia, Raiz ou Sair");
            System.out.print("Digite a operação desejada: ");
    
            String operacao = sc.nextLine();
            operacao = operacao.substring(0, 1).toUpperCase() + operacao.substring(1).toLowerCase();

            if (operacao.equals("Sair")){
                System.out.println("Saindo");
                continua = false;
                break;
            }
    
            try {

                System.out.print("Digite o Primeiro Valor: ");
                double a = sc.nextDouble();
                sc.nextLine();
    
                System.out.print("Digite o Segundo Valor: ");
                double b = sc.nextDouble();
                sc.nextLine();
    
                System.out.println("Resultado = " + control.calcular(operacao, a, b));
            }
    
            catch (ArithmeticException e) {

                System.out.println("Divisao por 0 não dá");
            }
    
            catch (IllegalArgumentException e) {

                System.out.println("Operação Invalida");
            }
        }   
    }
}