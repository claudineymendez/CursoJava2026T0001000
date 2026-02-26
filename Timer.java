import java.util.*; //importação de todos os módulos da biblioteca util
import java.time.*;// importação de todos os módulos da biblioteca time
public class Timer {

        public static void main (String[]args){
            int contador = 0;         
                     
            while (true){
            //System.out.println("O número é: "+ contador);
            int horaAtual = LocalDateTime.now().getHour(); // o (.) ponto INVOCA o operador                        
            int minutoAtual = LocalDateTime.now().getMinute(); // o (.) ponto INVOCA o operador                        
            int segundoAtual = LocalDateTime.now().getSecond(); // o (.) ponto INVOCA o operador                        
            System.out.println("Time Now : " + horaAtual + ":" + minutoAtual + ":" + segundoAtual); //concatenando e declaração da variaval horaAtual + minutoAtual + segundoAtual que vai receber em numero inteiro o resultado da chamada d método getHour
                try {
                    Thread.sleep(1000);

                }  catch (Exception e){
                    System.out.println("Erro: "+ e);
                }        
                try {
                    if((System.getProperty("os.name")).contains("Windows")) {
                    new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();       

                    } else{
                        System.out.println("\033[H\0332J]");        
                        System.out.flush();    
                    }                    
                } catch (Exception e) {
                    System.out.println("Erro: "+ e);
                }
            contador++;    
            } //fecha while
        } //fecha static
} //}fecha a class
