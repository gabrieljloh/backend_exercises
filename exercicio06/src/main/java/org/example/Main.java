package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema netflix = new Cinema();
        netflix.adicionarFilme("Batman", 10.0f, 16);
        netflix.adicionarFilme("Barbie", 8.0f, 16);
        netflix.adicionarFilme("Vingadores", 20.0f, 16);
        netflix.adicionarFilme("Homem Aranha", 15.0f, 16);
        netflix.adicionarFilme("Psicopata Americano", 12.0f, 16);

        Scanner scanner = new Scanner(System.in);
        while(true) {
            Ingresso ingresso = new Ingresso();

            System.out.println("Digite o seu nome: ");
            String nomeDigitado = scanner.nextLine();
            ingresso.setCliente(nomeDigitado);

            System.out.println("Digite o filme que deseja assistir: ");
            String filmeDigitado = scanner.nextLine();
            ingresso.setFilme(filmeDigitado);

            System.out.println("Digite o seu assento desejado (de A1 a F5): ");
            String assentoDigitado = scanner.nextLine();
            ingresso.setAssento(assentoDigitado);


        }
    }
}