package br.com.supera.desafios.segundo;
/**
 * @author Cesar
 * @see Teste Supera
 */
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor monetário: ");
        double dinheiroTotal = leia.nextDouble();

        int nota = (int) dinheiroTotal;
        int moeda = (int) ((dinheiroTotal - nota) * 100);

        int nota100 = nota / 100;
        nota -= nota100 * 100;

        int nota50 = nota / 50;
        nota -= nota50 * 50;

        int nota20 = nota / 20;
        nota -= nota20 * 20;

        int nota10 = nota / 10;
        nota -= nota10 * 10;

        int nota5 = nota / 5;
        nota -= nota5 * 5;

        int nota2 = nota / 2;
        nota -= nota2 * 2;

        int moeda1 = nota;

        int moeda50 = moeda / 50;
        moeda -= moeda50 * 50;

        int moeda25 = moeda / 25;
        moeda -= moeda25 * 25;

        int moeda10 = moeda / 10;
        moeda -= moeda10 * 10;

        int moeda05 = moeda / 5;
        moeda -= moeda05 * 5;

        int moeda01 = moeda;

        System.out.println("\nNOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00 \n");

        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda05 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");

        leia.close();
    }
}
