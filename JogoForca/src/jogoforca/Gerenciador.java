/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoforca;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author RCR
 */
public class Gerenciador {

    private Jogador jogador;
    private Palavra palavras[] = new Palavra[11];
    private String letrasJogadas = "";
    private int atual = 0;

    public Gerenciador(Jogador jogador) {
        this.jogador = jogador;
    }

    public void iniciar() {
        while (jogador.getErro() <= 5) {
            recebeJogada();
        }
    }

    public void criarDicionario() {
        palavras[0] = new Palavra("Nova Caledonia", "Pais");
        palavras[1] = new Palavra("Kiwano", "Fruta");
        palavras[2] = new Palavra("Lamborghini", "Modelo de Carro");
        palavras[3] = new Palavra("Stranger Things", "Series");
        palavras[4] = new Palavra("Resident Evil: Welcome to Racoon City", "Filmes");
        palavras[5] = new Palavra("The Promised Neverland", "Animes");
        palavras[6] = new Palavra("Garrafa", "Objetos");
        palavras[7] = new Palavra("apaaaiiiiz", "Frases do ratinho");
        palavras[8] = new Palavra("Cuphead", "Jogos");
        palavras[9] = new Palavra("Lucas", "Pessoas");
        palavras[10] = new Palavra("Azul petroleo", "Cores");
        // Embaralhar
        Collections.shuffle(Arrays.asList(palavras));

    }

    public Palavra getPalavra(int indice) {
        return palavras[indice];
    }

    public void recebeJogada() {
        Scanner teclado = new Scanner(System.in);
        dica();
        System.out.println("Você deseja digitar a palavra ou letra?");
        System.out.println("1 - Palavra Completa");
        System.out.println("2 - Letra");

        int resposta = teclado.nextInt();
        verificarJogada("");
        if (resposta == 1) {
            recebePalavraCompleta();
            // palavra
        } else if (resposta == 2) {
            // letra

            recebeLetra();
        }
        

        //verificar se ja esta na string
//        this.letrasJogadas += letra;
    }

    private void recebePalavraCompleta() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        String palavraCompleta = teclado.nextLine().toUpperCase();
        if (acertou(palavraCompleta)) {
            System.out.println("Parabéns!! você acertou a palavra "
                    + palavras[atual].getPalavra());
            atual++;
        } else {
            System.out.println(palavraCompleta);
            
                    
            System.out.println("Você errou!");
            jogador.setErro(jogador.getErro() + 1);
        }
    }

    private void recebeLetra() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a letra: ");
        String letra = teclado.nextLine().toUpperCase();
        if (verificarLetra(letra)) {
            letrasJogadas += letra;
            if (!palavras[atual].getPalavra().contains(letra)) {
                jogador.setErro(jogador.getErro() + 1);
                System.out.println("Você errou!! Erros: " + jogador.getErro());
            }
            verificarJogada(letra);
        } else {
            System.out.println("Letra já existente");
            System.out.println(letrasJogadas);
        }

    }

    public void verificarJogada(String letra) {
        char letras[] = palavras[atual].getPalavra().toCharArray();
        char _letrasJogadas[] = letrasJogadas.toCharArray();
        char letrasCriptografada[] = palavras[atual].criptografar().toCharArray();
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < _letrasJogadas.length; j++) {
                if (letras[i] == _letrasJogadas[j]) {
                    letrasCriptografada[i] = letras[i];
                }
            }
        }
        System.out.println(letrasCriptografada);

    }

    public boolean verificarLetra(String letra) {
        char letras[] = letrasJogadas.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    public void letrasJogadas() {
        System.out.println(this.letrasJogadas);
    }

    public boolean verificaPalavra(String palavra) {
        if (palavra.equals(palavras[atual])) {
            atual++;
            letrasJogadas = "";
            return true;
        } else {
            jogador.setErro(jogador.getErro() + 1);
            return false;
            
            
        }
    }

    public boolean acertou(String palavraCompleta) {
        return palavras[atual].getPalavra().equals(palavraCompleta);
    }

    public void dica() {
        System.out.println("DICA: " + palavras[atual].getCategoria());
    }
  


}

    
    

