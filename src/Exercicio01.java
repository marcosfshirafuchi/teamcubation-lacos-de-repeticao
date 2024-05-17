import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    /**
     * <h1>Teamcubation - Exercícios Laços de Repetição</h1>
     * 1 - Contagem de Números Positivos e Negativos
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   16/05/2024
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de números desejada:");
        int quantidadeDeNumeros = scanner.nextInt();
        List<Integer> listaDeNumeros = new ArrayList<>();
        for (int i = 1; i <= quantidadeDeNumeros; i++){
            System.out.printf("Digite o %dº numero: ",i);
            int numero = scanner.nextInt();
            listaDeNumeros.add(numero);
        }
        int numerosPositivos=0;
        int numerosNegativos=0;
        for (Integer numeros: listaDeNumeros){
            if (numeros >=0){
                numerosPositivos++;
            }else{
                numerosNegativos++;
            }
        }
        System.out.println();
        System.out.println("Impressão das quantidade números positivos e negativos:");
        System.out.println();
        System.out.println("Quantidade de números positivos: " +numerosPositivos);
        System.out.println("Quantidade de números negativos: " + numerosNegativos);
        scanner.close();
    }
}
