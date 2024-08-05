// import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner  s = new Scanner(System.in);

    int escolha;
    int numeros;
    // Random gerador = new Random();

do{
     System.out.println("Escolha uma opção:"
        +"\n1- Sorteador de numeros"
        +"\n2- Sair");
        escolha = s.nextInt();


        clearConsole.cls();
        switch (escolha) {
            case 1:
                System.out.println("Digite a quantos numeros que deseja sortear:"); 
                numeros = s.nextInt();
                clearConsole.cls();
                int[] arrayNum = new int[numeros];
                System.out.println("O sorteio deverá ocorrer entre:\nValor inicial: ");
                int vInicial = s.nextInt();
                clearConsole.cls();
                System.out.println("\nValor Final: ");
                int vFinal = s.nextInt();
                int intervalo = vFinal - vInicial + 1;
                clearConsole.cls();



                for(int i = 0; i < numeros; i++){
                    int numRandom = (int)(Math.random() * intervalo) + vInicial;
                    arrayNum[i] = numRandom;
                    if (numeros == 1) {
                        System.out.println("O numero sorteado é: \n"+ Color.ANSI_RED+numRandom+Color.ANSI_RESET);
                        break;
                    }
                   
                    
                }
                
                if(numeros!=1){
                System.out.println("Os numeros sorteados são :");
                for(int j = 0; j< arrayNum.length;j++){
                        
                    System.out.println(Color.ANSI_RED+arrayNum[j]+Color.ANSI_RESET);
                    
                } 
            }
                  
                
                // gerador.nextInt(vInicial,vFinal);
                // System.out.println("");
                break;
        

            default:
            if(escolha!=2){
            System.out.println(Color.ANSI_RED+"\n + ************************"+"Digite uma opção válida"+ "****************************"+ Color.ANSI_RESET);
                break;
            }
        }

}while (escolha!= 2);
    System.out.println("Você Saiu");
    s.close();
}

    }
