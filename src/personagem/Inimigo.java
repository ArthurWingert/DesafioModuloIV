package personagem;

import java.util.Random;

public class Inimigo extends Personagem {

    private static final String[] NOMES = {"Goblin", "Orc", "Esqueleto", "Bandido"};

    public Inimigo() {
        super(gerarNome(),
                new Random().nextInt(30) + 70,
                new Random().nextInt(10) + 15,
                new Random().nextInt(5) + 5);
    }

    private static String gerarNome() {
        return NOMES[new Random().nextInt(NOMES.length)];
    }
}