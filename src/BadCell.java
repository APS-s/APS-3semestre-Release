import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BadCell {
    public static int vida = 50;
    public static int ataque = 20;
    public static int defesa = 10;

    // Metodo construtor que imprime o arquivo badCell.txt
    public BadCell(){
        File file = new File("badCell.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
    public static void dano() {
        BadCell.vida -= (Jogador.ataque - BadCell.defesa);
    }

}
