package utilitarios;

import java.util.HashMap;
import java.util.Map;

public class Ranking {

    private static Map<String, Integer> ranking = new HashMap<>();

    public static void adicionarPontuacao(String nome, int pontos) {
        ranking.put(nome, pontos);
    }

    public static void exibirRanking() {
        System.out.println("\n=== RANKING ===");
        ranking.forEach((nome, pontos) ->
                System.out.println(nome + " - " + pontos + " pontos"));
    }
}