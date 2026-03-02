package View;

import java.util.Scanner;
import Controller.Multiplicador;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        // Instanciando a classe de multiplcacao
        Multiplicador controller = new Multiplicador();

        int resultado = controller.multiplicar(a, b);

        System.out.println("Resultado da multiplicação: " + resultado);

        sc.close();
    }
}