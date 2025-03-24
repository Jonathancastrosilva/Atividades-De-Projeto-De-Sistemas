package factorymethod;

import java.util.Objects;
import java.util.Scanner;
import factorymethod.model.*;
import factorymethod.factory.*;

public class Application {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            double a = 0, b = 0;
            int opcao = 0;
            boolean continua = true;

            while (continua) {
                try {
                    System.out.print("Digite o primeiro número: ");
                    a = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    b = scanner.nextDouble();
                    System.out.println("Digite uma operação ( 1 = Adicao, 2 = Subtracao, 3 = Multiplicacao ou 4 = Divisao), Qualquer outro inteiro = Nada Acontece (= ): ");
                    opcao = scanner.nextInt();
                    scanner.nextLine();

                    continua = false;
                } catch (Exception e) {
                    // Captura qualquer exceção que aconteça (por exemplo, se o usuário digitar uma string)
                    System.out.println("Entrada inválida! Por favor, digite um número válido.");
                    scanner.nextLine();
                }
            }

            if (opcao == 1){
                System.out.println(a + " + " + b + " = " + (a + b));
            }
            else if (opcao == 2){
                System.out.println(a + " - " + b + " = " + (a - b));
            }
            else if (opcao == 3){
                System.out.println(a + " * " + b + " = " + (a * b));
            }
            else if (opcao == 4){
                if (b == 0) {
                System.out.println("Dividir por 0... IMPOSSIVEL");
                }
                else{
                System.out.println(a + " / " + b + " = " + (a / b));
                }
            }
            else {
                System.out.println("Nenhuma operacao selecionada");
            }
        }
    }
}