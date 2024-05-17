import java.util.Scanner;

public class Exercicio03 {
    /**
     * <h1>Teamcubation - Exercícios Laços de Repetição</h1>
     * 3 - Tabuada Personalizada
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   16/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a tabuada desejada: ");
        int tabuada = scanner.nextInt();
        System.out.printf("Impressão da tabuada do %d:\n", tabuada);
        for (int i = 1; i <=10; i++){
            System.out.printf("%d X %d = %d\n",tabuada,i, i * tabuada);
        }
        scanner.close();
    }
}
