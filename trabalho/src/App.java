import java.util.Scanner;
																																																																																																																																																																																																											
public class App {
 public static void main(String[] args) {
     // criando o scanner para entrada de dados
     Scanner  s = new Scanner(System.in);
// criando as variáveis
 int escolha;
 int numeros;
 
// utilizando o do while para que o programa continue executando até que o usuário escolha a opção 2-Sair
do{
  System.out.println("Escolha uma opção:"
     +Color.ANSI_YELLOW+"\n1- Sorteador de numeros"+Color.ANSI_RESET
     +Color.ANSI_RED+"\n2- Sair"+ Color.ANSI_RESET);

     //repete o enquanto a escolha do usuario não for um numero valido
     while (!s.hasNextInt()) {   
        System.out.println(Color.ANSI_RED + "Entrada inválida. Digite uma opção corretamente." + Color.ANSI_RESET);
        s.next(); // consome a entrada inválida
    }
     escolha = s.nextInt(); // pede para digitar

     // esse método limpa o console chamado de um uma classe própria
     clearConsole.cls();


     // para caso o usuário escolha a opção 1
     switch (escolha) {
         case 1:
             System.out.println("Digite a quantos numeros que deseja sortear:"); 
             while (!s.hasNextInt()) {
                System.out.println(Color.ANSI_RED + "Entrada inválida. Digite um número." + Color.ANSI_RESET);
                s.next();
            }
             numeros = s.nextInt(); // pede para digitar
             
            
            
             int[] arrayNum = new int[numeros]; // armazena a opção digitado no array
             System.out.println("O sorteio deverá ocorrer entre:\nValor inicial: ");
             //repete o enquanto a escolha do usuario não for um numero valido
             while (!s.hasNextInt()) {   
                System.out.println(Color.ANSI_RED + "Entrada inválida. Digite um valor corretamente." + Color.ANSI_RESET);
                s.next(); // consome a entrada inválida
            }
             int vInicial = s.nextInt(); // valor inicial para qual o número vai ser sorteado



             System.out.println("\nValor Final: ");
              //repete o enquanto a escolha do usuario não for um numero valido
             while (!s.hasNextInt()) {   
                System.out.println(Color.ANSI_RED + "Entrada inválida. Digite um valor corretamente." + Color.ANSI_RESET);
                s.next(); // consome a entrada inválida
            }
             int vFinal = s.nextInt();  // valor final para qual o número vai ser sorteado
             
             // armazena a quantidade de possibilidades que irá ter entre o valor inicial e final que o usuario digigou
             int intervalo = vFinal - vInicial + 1;
             clearConsole.cls();



             for(int i = 0; i < numeros; i++){
            	 // gera um numero aleatorio entre o valor inicial e final que o usuario informou
                 int numRandom = (int)(Math.random() * intervalo) + vInicial;
                 // armazena o primeiro numero gerado dentro do array 
                 arrayNum[i] = numRandom;
                 
                 
                 
                 
                 //condicao para caso seja apenas um número digitado
                 if (numeros == 1) {
                     System.out.println("O numero sorteado é: \n"+ Color.ANSI_RED+numRandom+Color.ANSI_RESET); // exibe o numero sorteado
                     break; // para de sortear.
                 }
                
                 
             }
             //condição para caso sejam vários números a serem sorteados
             if(numeros!=1){
             System.out.println("Os numeros sorteados são :");
 
             //for que percorre o array, exibindo todos os numeros sorteados
             for(int j = 0; j< arrayNum.length;j++){
                     
                 System.out.println(Color.ANSI_GREEN+arrayNum[j]+Color.ANSI_RESET);
                 
             } 
            }
             break;
     
            // irá executar caso a escolha do usuaro não for nenhuma das opçãoes 
         default:
         if(escolha!=2){
         System.out.println(Color.ANSI_RED+"\n + ***********************"+"Digite uma opção válida"+ "*"+ Color.ANSI_RESET);
             break;
         }
     }
    
// encerra o programa quando o usuario digitar 2
}while (escolha!= 2); // enquando a escolha do usuário não for diferente de 2.
 System.out.println("Programa Encerrado"); // Exibindo que o programa foi encerrado
 s.close(); // fechando o scanner
}


}
