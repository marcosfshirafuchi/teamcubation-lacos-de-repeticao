import java.util.Scanner;

public class Exercicio02 {
    /**
     * <h1>Teamcubation - Exercícios Laços de Repetição</h1>
     * 2 - Verificação de Números Pares e Ímpares
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   16/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        if(numero %2 == 0){
            System.out.printf("O número %d eh Par!",numero);
        }else {
            System.out.printf("O número %d eh Impar!",numero);
        }
        scanner.close();
    }
}
