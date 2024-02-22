import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("9 - Digite o primeiro numero:");
        int n1 = s.nextInt();
        System.out.println("9 - Digite o segundo numero:");
        int n2 = s.nextInt();
        int soma = n1 + n2;
        
        System.out.println("9 - A soma de " +n1+ " + "+n2+ " é igual a:"  + soma);
        
    }
}
