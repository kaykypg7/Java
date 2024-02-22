import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("10 - Digite o primeiro numero:");
        double n1 = s.nextDouble();
        System.out.println("10 - Digite o segundo numero:");
        double n2 = s.nextDouble();
        double soma = n1 + n2;
        double divisao =  n1 / n2;
        System.out.println("10 - A soma de " +n1+ " + "+n2+ " é igual a: "  + soma);
        System.out.println("10 - A divisao de " +n1+ " por " +n2+ " é igual a: " + divisao);
    }
}
