package personagem;

public class Personagem {

    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected int pocoes = 3;
    protected boolean defendendo = false;
    protected int moedas = 0;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar(Personagem alvo) {
        int dano = this.ataque - alvo.defesa;

        if (alvo.defendendo) {
            dano /= 2;
            alvo.defendendo = false;
        }

        if (dano < 0) dano = 0;

        alvo.tomarDano(dano);
        System.out.println(nome + " causou " + dano + " de dano!");
    }

    public void defender() {
        defendendo = true;
        System.out.println(nome + " está defendendo!");
    }

    public void tomarDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
    }

    public void usarPocao() {
        if (pocoes > 0) {
            vida += 20;
            pocoes--;
            System.out.println("Poção usada! +20 vida");
        } else {
            System.out.println("Sem poções!");
        }
    }

    public boolean estaVivo() { return vida > 0; }

    public String getNome() { return nome; }
    public int getVida() { return vida; }
    public int getPocoes() { return pocoes; }
    public int getMoedas() { return moedas; }

    public void adicionarMoedas(int valor) { moedas += valor; }

    public void aumentarAtaque(int valor) { ataque += valor; }
    public void aumentarVida(int valor) { vida += valor; }
}