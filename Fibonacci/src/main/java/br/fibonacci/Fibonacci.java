package br.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static boolean pertenceFibonacci(int num) {
        int a = 0, b = 1;
        while (a < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numInformado = scanner.nextInt();
        if (pertenceFibonacci(numInformado)) {
            System.out.println(numInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numInformado + " não pertence à sequência de Fibonacci.");
        }
    }
}
