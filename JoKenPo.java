package br.com.jokenpo;

import java.util.Scanner;

/**
 * Jogo Pedra , Papel , Tesoura ;
 *
 * @author wende
 */
public class JoKenPo {

    public static void main(String[] args) {
        // logica do jogador 
        int jogador;
        Scanner mao = new Scanner(System.in);
        System.out.println("______ JoKenPo_______");
        System.out.println("_____________________");
        System.out.println("1-  Pedra");
        System.out.println("2-  Papel");
        System.out.println("3-  Tesoura");
        System.out.println("Digite a opção desejada :");
        jogador = mao.nextInt();
        System.out.println("JO--KEN--POOO !");
        switch (jogador) {
            case 1:
                System.out.println("Jogador escolheu Pedra");
                break;
            case 2:
                System.out.println("Jogador escolheu Papel");
                break;
            case 3:
                System.out.println("Jogador escolheu Tesoura");
                break;
            default:
                System.out.println("Opção invalida! ");
                break;
        }
        // logica do computador ;
        int computador = (int) (Math.random() * 3 + 1); // O "3+1" significa que o random vai sortear numeros entre 0 e 2 mas vai somar 1
        switch (computador) {
            case 1:
                System.out.println("Computador escolheu Pedra");
                break;
            case 2:
                System.out.println("Computador escolheu Papel");
                break;
            case 3:
                System.out.println("Computador escolheu Tesoura");
                break;
        }
        //logica do vencedor
        if (jogador != computador) {
            if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
                System.out.println("JOGADOR VENCEU !");
            }else {
                System.out.println("COMPUTADOR VENCEU");
            }   
             
        } else {
            System.out.println("EMPATE !");
        }
    }

}
