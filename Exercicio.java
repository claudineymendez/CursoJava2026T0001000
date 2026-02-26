import java.util.*; //importação da biblioteca

public class Exercicio {
    // Exercícios de calculadora, usando 01= Soma; 02=Multilicação; 03=Divisão e 04=Subtraido
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número a ser somado e tecle Enter");//01 
        //System.out.println("Digite o primeiro número a ser multiplicado e tecle Enter");//02
        //System.out.println("Digite o primeiro número a ser dividido e tecle Enter");//03
        //System.out.println("Digite o primeiro número a ser subtraido e tecle Enter");//04
        String respostaUsuario = inputScanner.nextLine().trim();
        int numeroUm = Integer.valueOf(respostaUsuario);
        System.out.println("Digite o segundo numero a ser somado e tecle Enter");//01 
        // System.out.println("Digite o segundo numero a ser multiplicado e tecle Enter");//02
        //System.out.println("Digite o segundo numero a ser dividido e tecle Enter");//03
        //System.out.println("Digite o segundo numero a ser subtraido e tecle Enter");//04
        respostaUsuario = inputScanner.nextLine().trim();
        int numeroDois = Integer.valueOf(respostaUsuario);
        //double resultado = (double) numeroUm / numeroDois; //código para utilizar quanto estiver DIVIDINDO
        System.out.println("O resultado da soma é: " +(numeroUm + numeroDois));//01 
        //System.out.println("O resultado da Multiplicação é: " +(numeroUm * numeroDois));//02
        //System.out.println("O resultado da Divisão é: " +(resultado));//03
        //System.out.println("O resultado da Subtração é: " +(numeroUm - numeroDois));//04
        inputScanner.close();

    } //fecha static 
    
} //}fecha a class
