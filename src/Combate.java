import java.util.InputMismatchException;
import java.util.Scanner;

public class Combate{

    public Combate() {
        System.out.println("Você encontrou um inimigo!\nO que deseja fazer?\n1 - Atacar\n2 - Fugir");
        Scanner input = new Scanner(System.in);
        int escolha;
        // loop para garantir que o usuário digite um número inteiro.
        while (true) {
            try {
                escolha = input.nextInt();
                break; // sair do loop se a escolha for um número inteiro válido
            } catch (InputMismatchException e) {
                System.out.println("Escolha inválida. Por favor, digite um número inteiro.");
                input.nextLine(); // limpar o buffer do scanner antes de tentar ler novamente
            }
        }

        if (escolha == 1) {
            boolean continuarLuta = true;
            while (continuarLuta) {
                BadCell.dano();
                Jogador.dano();
                if (Jogador.vida <= 0) {
                    System.out.println("Só melhore");
                    continuarLuta = false;
                    System.exit(1);
                } else if (BadCell.vida <= 0) {
                    System.out.println("Você venceu!");
                    if(Jogador.vida < 100)
                        Jogador.vida += (Jogador.vida * 20/100);
                    BadCell.vida = 50;
                    continuarLuta = false;
                }else if(escolha == 2) {
                    System.out.println("Você fugiu!");
                    if(Jogador.vida < 100)
                        Jogador.vida += (Jogador.vida * 10/100);
                    BadCell.vida = 50;
                    continuarLuta = false;
                } else {
                    System.out.println("Vida do jogador: " + Jogador.vida + "\nVida do inimigo: " + BadCell.vida);
                    System.out.println("O que deseja fazer?\n1 - Atacar\n2 - Fugir");
                    try {
                        escolha = input.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Escolha inválida. Por favor, digite um número inteiro.");
                        return; // encerra o construtor se a escolha for inválida
                    }
                }
            }
        } else if (escolha == 2) {
            if(Jogador.vida < 100)
                Jogador.vida += (Jogador.vida * 10/100);
            BadCell.vida = 50;
            System.out.println("Você fugiu!");
        } else {
            System.out.println("Escolha inválida!");
        }
    }


}
