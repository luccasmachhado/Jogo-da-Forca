/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoforca;

/**
 *
 * @author RCR
 */
public class Jogador {
    private String nome;
    private int erro = 0;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getErro() {
        return erro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setErro(int erro) {
        this.erro = erro;
        if(erro == 1){
        System.out.println("=======================");
        System.out.println("|                     |");
        System.out.println("|                    ( )");
        System.out.println("|                        ");
        System.out.println("|                        ");
        System.out.println("|                        ");
        System.out.println("|                        ");
        System.out.println("|                        ");
        System.out.println("=                        ");
        System.out.println("Este é você "+ this.nome);
        
        }
        else if(erro == 2){
        System.out.println("=======================");
        System.out.println("|                     |");
        System.out.println("|                    ( )");
        System.out.println("|                     |");
        System.out.println("|                     |");
        System.out.println("|                        ");
        System.out.println("|                        ");
        System.out.println("|                        ");
        System.out.println("=                        ");
        System.out.println("Este é você "+ this.nome);
        }
        else if(erro == 3){
        System.out.println("=======================");
        System.out.println("|                     |");
        System.out.println("|                    ( )");
        System.out.println("|                     |");
        System.out.println("|                     |");
        System.out.println("|                      \\");
        System.out.println("|                        ");
        System.out.println("|                        ");
        System.out.println("=                        ");
        System.out.println("Este é você "+ this.nome);
        }
        
        else if(erro == 4){
        System.out.println("=======================");
        System.out.println("|                     |");
        System.out.println("|                    ( )");    
        System.out.println("|                     |");
        System.out.println("|                     |");
        System.out.println("|                    / \\");
        System.out.println("|                        ");
        System.out.println("|                        ");
        System.out.println("=                        ");
        System.out.println("VAI PERDER HEIN (⊙.⊙) " + this.nome);
        }
        
        else if(erro == 5){
        System.out.println("=======================");
        System.out.println("|                     |");
        System.out.println("|                    ( )");    
        System.out.println("|                    /|\\");
        System.out.println("|                     |");
        System.out.println("|                    / \\");
        System.out.println("|                        ");
        System.out.println("|                        ");
        System.out.println("=");
        
        System.out.println("========================================");
        System.out.println("|| GAME  OVER!!, TENTE NA PRÓXIMA (╥﹏╥) ||");
        System.out.println("========================================");
        }
        
    }
    
    
    
}
