import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("8- Digite a temperatura em fahrenheit:");          //atividade 8
        double fahrenheit  = s.nextInt();
        double celsius = (fahrenheit -32)*5/9;
        System.out.println("8 - A conversão de " + fahrenheit + "°F para celsius é: " + celsius+ "°C");
    }
}
