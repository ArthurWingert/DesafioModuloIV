package batalha;

import personagem.*;
import java.util.Random;
import java.util.Scanner;

public class Combate {

    private Scanner scanner;

    public Combate(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean iniciar(Personagem jogador, Inimigo inimigo) {

        System.out.println("\nUm " + inimigo.getNome() + " apareceu!");

        while (jogador.estaVivo() && inimigo.estaVivo()) {

            exibirStatus(jogador, inimigo);
            turnoJogador(jogador, inimigo);

            if (inimigo.estaVivo()) {
                turnoInimigo(jogador, inimigo);
            }
        }

        return jogador.estaVivo();
    }

    private void exibirStatus(Personagem j, Inimigo i) {
        System.out.println("\n--- STATUS ---");
        System.out.println(j.getNome() + " Vida: " + j.getVida() + " | Moedas: " + j.getMoedas());
        System.out.println(i.getNome() + " Vida: " + i.getVida());
    }

    private void turnoJogador(Personagem j, Inimigo i) {

        while (true) {
            System.out.println("\n1- Atacar\n2- Defender\n3- Usar Poção");

            try {
                int escolha = Integer.parseInt(scanner.nextLine());

                switch (escolha) {
                    case 1: j.atacar(i); return;
                    case 2: j.defender(); return;
                    case 3: j.usarPocao(); return;
                    default: System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Digite número válido!");
            }
        }
    }

    private void turnoInimigo(Personagem j, Inimigo i) {

        if (new Random().nextInt(100) < 80)
            i.atacar(j);
        else
            i.defender();
    }
}