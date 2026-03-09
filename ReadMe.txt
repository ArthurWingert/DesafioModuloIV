JOGO RPG TERMINAL 2.0 – INSTRUÇÕES DE EXECUÇÃO

Descrição:
Este projeto consiste em um jogo de RPG em terminal desenvolvido em Java.
O jogador escolhe uma classe de personagem e enfrenta inimigos em batalhas por turnos.
Durante o jogo é possível atacar, defender, usar poções e comprar melhorias em uma loja entre batalhas.

Requisitos:

* Java JDK 8 ou superior instalado
* Terminal ou IDE Java (IntelliJ, Eclipse ou VSCode)

Estrutura do Projeto:
src/

* Main.java
* batalha/

  * Jogo.java
  * Combate.java
* personagem/

  * Personagem.java
  * Guerreiro.java
  * Mago.java
  * Arqueiro.java
  * Inimigo.java
* utilitarios/

  * Loja.java
  * Ranking.java

Como Executar (via IDE):

1. Abra o projeto em uma IDE Java (ex: IntelliJ IDEA).
2. Certifique-se de que a pasta "src" está configurada como Source Root.
3. Localize o arquivo Main.java.
4. Execute o método main.

Como Executar (via terminal):

1. Navegue até a pasta do projeto.

2. Compile os arquivos Java:

javac Main.java batalha/*.java personagem/*.java utilitarios/*.java

3. Execute o programa:

java Main

Como Jogar:

1. Digite seu nome quando solicitado.

2. Escolha uma classe de personagem:

   * Guerreiro (maior vida e defesa)
   * Mago (maior ataque)
   * Arqueiro (equilibrado)

3. Durante as batalhas escolha uma ação:
   1 - Atacar
   2 - Defender
   3 - Usar Poção de Cura

4. Ao derrotar um inimigo:

   * Você ganha pontos
   * Ganha moedas
   * Pode acessar a loja para melhorar atributos

5. O jogo termina quando:

   * O jogador derrota todos os inimigos (vitória)
   * O jogador perde toda a vida (derrota)

Sistema de Pontuação:

* Cada inimigo derrotado concede 10 pontos.
* A pontuação final é exibida ao final do jogo.

Ranking:

* O jogo registra a pontuação do jogador em um ranking simples exibido ao final da partida.

Autor:
Projeto desenvolvido para o desafio final do módulo de programação Java.
