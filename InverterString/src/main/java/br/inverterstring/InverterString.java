package br.inverterstring;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        String invertida = "";

        for (int i = 0; i < input.length(); i++) {
            invertida = input.charAt(i) + invertida;
        }

        System.out.println("String invertida: " + invertida);
    }
}