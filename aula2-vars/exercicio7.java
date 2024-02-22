import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("7 - Digite a temperatura em celsius:");         //atividade 7
        double celsius = s.nextInt();
        double fahrenheit = (celsius* 9/5) + 32;
        System.out.println("7 - A conversão de " + celsius + "°C para fahrenheit é: " + fahrenheit+ "°F");
    }
}
