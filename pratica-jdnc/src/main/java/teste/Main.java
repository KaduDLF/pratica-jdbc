
package teste;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um nome");
        String nome = scan.nextLine();
        
        System.out.println("Digite uma idade");
        int idade = scan.nextInt();
        
        Usuario usu = new Usuario(nome, idade);
        
        usu.inserir();
        
        System.out.println("Digite um id para ser removido");
        int idSelect = scan.nextInt();
        
        usu.remover(idSelect);
    }
}
