package br.soma;

public class Soma {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K++;
            SOMA += K;
        }
        System.out.println(SOMA);
    }
}
