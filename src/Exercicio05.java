import java.util.Scanner;

public class Exercicio05 {
    /**
     * <h1>Teamcubation - Exercícios Laços de Repetição</h1>
     * 5 - Tradução de Notas Musicais
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   16/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra da nota musical entre A,B,C,D,E ou F:");
        char letra = scanner.next().toUpperCase().charAt(0);
        switch (letra){
            case 'A':
                System.out.println("Dó");
                break;
            case 'B':
                System.out.println("Ré");
                break;
            case 'C':
                System.out.println("Mi");
                break;
            case 'D':
                System.out.println("Fá");
                break;
            case 'E':
                System.out.println("Sol");
                break;
            case 'F':
                System.out.println("Lá");
                break;
            default:
                System.out.println("Letra inválida!");
        }

        scanner.close();
    }
}
