import java.util.*; //importação de todos os módulos da biblioteca util
import java.time.*;// importação de todos os módulos da biblioteca time

public class Variavel { //declaração do método executor main()
    public static void main(String[] args) { //declaração da classe Variavel
        int horaAtual = LocalDateTime.now().getHour(); // o (.) ponto INVOCA o operador                        
        int minutoAtual = LocalDateTime.now().getMinute(); // o (.) ponto INVOCA o operador                        
        int segundoAtual = LocalDateTime.now().getSecond(); // o (.) ponto INVOCA o operador                        
        System.out.println("Time Now : " + horaAtual + ":" + minutoAtual + ":" + segundoAtual); //concatenando e declaração da variaval horaAtual + minutoAtual + segundoAtual que vai receber em numero inteiro o resultado da chamada d método getHour
        System.out.println("Soma Total = " +horaAtual + minutoAtual + segundoAtual); //declaração da variaval horaAtual + minutoAtual + segundoAtual que vai receber em numero inteiro o resultado da chamada d método getHour
        System.out.println(horaAtual + minutoAtual + segundoAtual); //declaração da variaval horaAtual + minutoAtual + segundoAtual que vai receber em numero inteiro o resultado da chamada d método getHour
              
        //fazer todas as explicações em inglês
        //(imprimir/ mostrar) na saida a hora do sistema                 
        //shif + alt + seta para baixo: cria uam cópia da linha abaixo e seta linha de cima

           
    }//finalizaou método executor main()
}// finalizar classe Variável

    
