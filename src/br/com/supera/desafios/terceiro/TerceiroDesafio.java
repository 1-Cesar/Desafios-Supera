package br.com.supera.desafios.terceiro;
/**
 * @author Cesar
 * @see Teste Supera
 */
import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int k;
        int n;
        int vericaPar;
        int pares = 0;

        System.out.println("Digite o valor alvo: ");
        k = leia.nextInt();

        System.out.println("Digite o tamanho do array: ");
        n = leia.nextInt();

        int[] arrayInteiro = new int[n];

        for (int x = 0; x < arrayInteiro.length; x++) {
            System.out.println("Digite o " + (x + 1) + "º" + " número do Array");
            arrayInteiro[x] = leia.nextInt();
        }

        for (int x = 0; x < arrayInteiro.length; x++) {
            for (int y = 0; y < arrayInteiro.length; y++) {
                vericaPar = arrayInteiro[x] - arrayInteiro[y];

                if (vericaPar == k) {
                    pares = pares + 1;
                }
            }
        }

        System.out.println("\nNúmero de pares que satisfazem o critério: " + pares);

        leia.close();
    }
}
