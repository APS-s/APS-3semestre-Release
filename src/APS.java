import java.util.Scanner;

public class APS {
    public static void main(String[] args) {
        // História do Jogo
        System.out.println("O lixo radioativo da cidade de Metrocity ao entrar em contato com as pilhas descartadas incorretamente pela população, criou uma nova forma de vida, os BadCells. \nEsses seres são capazes de se multiplicar e se espalhar rapidamente, e agora estão ameaçando a vida na Terra. \nVocê, um jovem cientista, foi escolhido para salvar o planeta. \nElimine a maior quantidade de BadCells possivel e salve a humanidade!");

        // Instanciamento do Objeto metropolis para que as subclasses possam acessar a matriz.
        Mundo metrocity = new Mundo();

        Scanner input = new Scanner(System.in);

        Jogador J = new Jogador();

        // J que é um objeto da classe Jogador, chama o método printMatriz() da classe Mundo imprimindo-a na tela.
        J.printMatriz();


        // Loop de gameplay
        while (true) {
            System.out.print("Digite uma direção (W, A, S ou D): ");
            String direcao = input.nextLine();
            J.moveJogador(direcao);

            J.printMatriz();

            // 40% de chance do Jogador encontrar BadCell ao andar pela matriz.
            if (Math.random() < 0.4) {
                // Instancimaento do Objeto BadCell para que o método construtor da classe seja chamado imprimindo o inimigo na tela.
                BadCell badCell = new BadCell();
                // Instanciamento do Objeto Combate para que o método construtor da classe seja chamado iniciando o combate.
                Combate combate = new Combate();
                J.printMatriz();
            }

        }
    }
}
