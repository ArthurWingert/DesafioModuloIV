package batalha;

import personagem.*;
import utilitarios.*;

import java.util.*;

public class Jogo {

    private Scanner scanner = new Scanner(System.in);
    private Personagem jogador;
    private List<Inimigo> inimigos = new ArrayList<>();
    private int pontuacao = 0;

    public void iniciarJogo() {

        System.out.println("=== RPG TERMINAL 2.0 ===");

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        jogador = selecionarClasse(nome);

        gerarInimigos();

        Combate combate = new Combate(scanner);

        while (jogador.estaVivo() && !inimigos.isEmpty()) {

            Inimigo inimigo = inimigos.remove(0);

            boolean venceu = combate.iniciar(jogador, inimigo);

            if (venceu) {
                pontuacao += 10;
                jogador.adicionarMoedas(10);
                System.out.println("Vitória! +10 moedas");
                Loja.abrirLoja(jogador, scanner);
            }
        }

        fimDeJogo();
    }

    private Personagem selecionarClasse(String nome) {

        while (true) {
            System.out.println("\nEscolha sua classe:");
            System.out.println("1- Guerreiro: Alta vida e defesa");
            System.out.println("2- Mago: Alto ataque, pouca vida");
            System.out.println("3- Arqueiro: Equilibrado");

            try {
                int op = Integer.parseInt(scanner.nextLine());

                switch (op) {
                    case 1: return new Guerreiro(nome);
                    case 2: return new Mago(nome);
                    case 3: return new Arqueiro(nome);
                    default: System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Digite número válido!");
            }
        }
    }

    private void gerarInimigos() {
        for (int i = 0; i < 3; i++)
            inimigos.add(new Inimigo());
    }

    private void fimDeJogo() {

        System.out.println("\n=== FIM DE JOGO ===");

        if (jogador.estaVivo()) {
            System.out.println("VOCÊ VENCEU!");
        } else {
            System.out.println("VOCÊ PERDEU!");
        }

        System.out.println("Pontuação: " + pontuacao);

        Ranking.adicionarPontuacao(jogador.getNome(), pontuacao);
        Ranking.exibirRanking();
    }
}