import java.util.Scanner;

public class Exercicio04 {
    /**
     * <h1>Teamcubation - Exercícios Laços de Repetição</h1>
     * 4 - Cálculo de Bônus Salarial
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @author  Marcos Ferreira Shirafuchi
     * @version 1.0
     * @since   16/05/2024
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do sálario base do funcuinário: ");
        double salarioDoFuncionario = scanner.nextDouble();
        System.out.println("Digite o numero de anos de serviço:");
        int anosDeServico = scanner.nextInt();
        double salarioReajustado =0;
        if (anosDeServico > 5){
            salarioReajustado = salarioDoFuncionario + (salarioDoFuncionario *0.05) ;
        }else{
            salarioReajustado = salarioDoFuncionario + (salarioDoFuncionario *0.02);
        }
        System.out.println("Impressão dos salários:");
        System.out.println("Salario Base: " + String.format("R$ %.2f", salarioDoFuncionario));
        System.out.println("Salario Reajustado: "+ String.format("R$ %.2f", salarioReajustado));
        scanner.close();
    }
}
