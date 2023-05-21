import java.util.Scanner;

public class Jogador extends Mundo{
    public static int vida = 100;
    public static int ataque = 25;
    public static int defesa = 10;
    public int posicaoJogadorLinha;
    public int posicaoJogadorColuna;
    Scanner input;

    // Metodo construtor que busca a posição atual do jogador na matriz.
    public Jogador() {
        input = new Scanner(System.in);
        // Encontra a posição atual do jogador na matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].equals("J")) {
                    posicaoJogadorLinha = i;
                    posicaoJogadorColuna = j;
                    break;
                }
            }
        }
    }

    public void moveJogador(String direcao) {
    // O jogador pode mover-se apenas entre espaços vazios (" ")
        // Move o jogador para cima (W)
        if (direcao.equalsIgnoreCase("W")) {
            // Verifica se o jogador pode se mover para cima
            if (posicaoJogadorLinha > 0 && matriz[posicaoJogadorLinha - 1][posicaoJogadorColuna].equals(" ")) {
                matriz[posicaoJogadorLinha][posicaoJogadorColuna] = " "; // Remove o jogador da posição atual na matriz
                posicaoJogadorLinha--; // Move o jogador para cima na matriz
                matriz[posicaoJogadorLinha][posicaoJogadorColuna] = "J"; // Coloca o jogador na nova posição na matriz
            }
        }
        // Move o jogador para baixo (S)
        else if (direcao.equalsIgnoreCase("S")) {
            // Verifica se o jogador pode se mover para baixo
            if (posicaoJogadorLinha > 0 && matriz[posicaoJogadorLinha + 1][posicaoJogadorColuna].equals(" ")) {
                matriz[posicaoJogadorLinha][posicaoJogadorColuna] = " "; // Remove o jogador da posição atual na matriz
                posicaoJogadorLinha++; // Move o jogador para baixo na matriz
                matriz[posicaoJogadorLinha][posicaoJogadorColuna] = "J"; // Coloca o jogador na nova posição na matriz
            }
        }
        // Move o jogador para esquerda (A)
        else if (direcao.equalsIgnoreCase("A")) {
            // Verifica se o jogador pode se mover para esquerda
            if (posicaoJogadorColuna > 0 && matriz[posicaoJogadorLinha][posicaoJogadorColuna - 1].equals(" ")) {
                matriz[posicaoJogadorLinha][posicaoJogadorColuna] = " "; // Remove o jogador da posição atual na matriz
                posicaoJogadorColuna--; // Move
                matriz[posicaoJogadorLinha][posicaoJogadorColuna] = "J"; // Coloca o jogador na nova posição na matriz
            }
        }
        // Move o jogador para direita (D)
        else if (direcao.equalsIgnoreCase("D")) {
            // Verifica se o jogador pode se mover para esquerda
            if (posicaoJogadorColuna > 0 && matriz[posicaoJogadorLinha][posicaoJogadorColuna + 1].equals(" ")) {
                matriz[posicaoJogadorLinha][posicaoJogadorColuna] = " "; // Remove o jogador da posição atual na matriz
                posicaoJogadorColuna++; // Move
                matriz[posicaoJogadorLinha][posicaoJogadorColuna] = "J"; // Coloca o jogador na nova posição na matriz
            }
        }
    }
    public static void dano() {
        Jogador.vida -= (BadCell.ataque - Jogador.defesa);
    }

}


