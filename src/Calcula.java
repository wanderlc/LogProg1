import java.util.Scanner;

public class Calcula {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double[] valores = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "° valor bruto: ");
            valores[i] = valor.nextDouble();
        }

        for (double valorBruto : valores) {
            double descInss = CalculaInss.calcula(valorBruto);
            double descIr = CalculaIr.calcula(valorBruto);
            double valorLiquido = valorBruto - descInss - descIr;

            System.out.printf("\nValor Bruto: R$ %.2f%n", valorBruto);
            System.out.printf("Desconto INSS: R$ %.2f%n", descInss);
            System.out.printf("Desconto Imposto de Renda: R$ %.2f%n", descIr);
            System.out.printf("Valor Líquido: R$ %.2f%n", valorLiquido);
        }
    }
}