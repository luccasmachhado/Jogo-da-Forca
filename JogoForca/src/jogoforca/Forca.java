package jogoforca;
import java.util.Scanner;
import objetos.Boneco;
import java.util.Random;
public class Forca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Boneco jogador = new Boneco();
        Random nTipoPChave = new Random();
        Random nPChave = new Random();
        String pRecheios[] = {"PEPPERONI","MUÇARELA","BAUNILHA"};
        String pBebidas[] = {"Batido","Iogurte","Achocolatado"};
        int tipoPChave = nTipoPChave.nextInt(2);
        
        String pChave = "";
        if(tipoPChave == 0){
            pChave =  pRecheios[nPChave.nextInt(3)];
        }
        if(tipoPChave == 1){
            pChave =  pBebidas[nPChave.nextInt(3)];
        }
        
        jogador.setBracoEsq(true);
        jogador.setBracoDir(true);
        jogador.setTronco(true);
        jogador.setPernaEsq(true);
        jogador.setPernaDir(true);
        System.out.println("DIGITE SEU NOME");
        String nome = "";
        nome = teclado.nextLine();
        jogador.setNome(nome);
        jogador.showBoneco();
        System.out.println(pChave);
    }
}
