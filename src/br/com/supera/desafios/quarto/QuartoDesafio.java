package br.com.supera.desafios.quarto;
/**
 * @author Cesar
 * @see Teste Supera
 */
import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de casos teste: ");
        int n = leia.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nDigite a " + (i + 1) + "º frase a ser decifrada: \n");
            String frase = readLine(leia);

            StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2));

            parte1.reverse();
            parte2.reverse();

            System.out.println(parte1 + parte2.toString());
        }
    }

    public static String readLine(Scanner leia) {
        String line = leia.nextLine();
        while (line.isEmpty())
            line = leia.nextLine();
        return line;
    }
}


