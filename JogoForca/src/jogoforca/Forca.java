package jogoforca;
import java.util.Scanner;
public class Forca {
       
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);
            System.out.println("DIGITE SEU NOME");
            String nome = teclado.nextLine().toUpperCase();
            Jogador jogador = new Jogador(nome);
            Gerenciador gerenciador = new Gerenciador(jogador);
            
            gerenciador.criarDicionario();
            
            gerenciador.iniciar();
           
            
                    
    }
}
