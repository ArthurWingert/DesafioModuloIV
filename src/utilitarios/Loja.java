package utilitarios;

import personagem.Personagem;
import java.util.Scanner;

public class Loja {

    public static void abrirLoja(Personagem jogador, Scanner scanner) {

        System.out.println("\n=== LOJA ===");
        System.out.println("Moedas: " + jogador.getMoedas());
        System.out.println("1- +5 Ataque (10 moedas)");
        System.out.println("2- +20 Vida (10 moedas)");
        System.out.println("3- Sair");

        try {
            int escolha = Integer.parseInt(scanner.nextLine());

            if (jogador.getMoedas() >= 10) {

                switch (escolha) {
                    case 1:
                        jogador.aumentarAtaque(5);
                        jogador.adicionarMoedas(-10);
                        System.out.println("Ataque aumentado!");
                        break;

                    case 2:
                        jogador.aumentarVida(20);
                        jogador.adicionarMoedas(-10);
                        System.out.println("Vida aumentada!");
                        break;
                }
            } else {
                System.out.println("Moedas insuficientes!");
            }

        } catch (Exception e) {
            System.out.println("Entrada inválida.");
        }
    }
}