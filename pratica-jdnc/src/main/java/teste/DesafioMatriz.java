/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author beril
 */
public class DesafioMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f;
        int g;
        System.out.println("Digite o valor de linhas");
        f = scan.nextInt();
        System.out.println("Digite o valor de colunas");
        g = scan.nextInt();
        int [][] matriz = new int [f][g];
        for(int i = 0;i<f;i++){
            for(int j = 0;j<g;j++){
                System.out.println("Digite um n");
                matriz[i][j] = scan.nextInt();
            }            
        }
        
        System.out.println("Digite um numero para localizar na matriz!");
        int n = scan.nextInt();
        boolean encontrado = false;
        for(int i = 0;i<f;i++){
            for(int j = 0;j<g;j++){
                if(matriz[i][j] == n){
                    System.out.println("O numero esta na posição: " + i + "," + j);
                    encontrado = true;
                    
                    try {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    } catch (Exception e) {
                    }
                    try {
                        System.out.println("esquerda: " + matriz[i][j - 1]);
                    } catch (Exception e) {
                    }
                    try {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    } catch (Exception e) {
                    }
                    try {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    } catch (Exception e) {
                    }
                    
                }
            }
        }
        if(!encontrado){
            System.out.println("O número não foi encontrado na matriz");
        }
    }
}
