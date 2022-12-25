package br.com.supera.desafios.primeiro;
/**
 * @author Cesar
 * @see Teste Supera
 */
import java.util.*;

public class PrimeiroDesafio {
    public static void main(String[] args) {

        Scanner leia = new Scanner((System.in));
        Integer numero;
        List<Integer> array = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.err.println("Para gerar o relatório, digite um número menor ou igual à 1 ou maior do que 100000 \n");

        do {
            System.out.println("Digite um número: ");
            numero = Math.abs(leia.nextInt());

            if (numero > 1 && numero <= 100000) {

                if (numero % 2 == 0) {
                    pares.add(numero);
                } else {
                    impares.add(numero);
                }
            }
        } while (numero > 1 && numero <= 100000);

        pares = pares.stream().sorted().toList();
        impares = impares.stream().sorted(Collections.reverseOrder()).toList();

        array.addAll(pares);
        array.addAll(impares);

        System.out.println("\n");

        array.forEach(System.out::println);

        leia.close();
    }
}
