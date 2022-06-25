package com.mycompany.hotel;
import java.util.Scanner;


/*
Descriação da atividade: O hotel da Colônia de Férias dos Professores está com uma promoção para as férias de julho. A
promoção é válida para quem chegar a partir do dia 1 de julho e sair no dia 1 de agosto.

Bruno gosta muito da professora Vilma, e para agradá-la quer ajudá-la a planejar suas férias, escre-
vendo um programa para calcular o total (em Reais) que a professora Vilma vai gastar, dependendo do dia em que chegar no hotel.
*/


public class Hotel {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Insira o valor da diária");
        int D = n.nextInt(); // diária do hotel
        System.out.println("Insira o quanto a diária irá aumentar");
        int A = n.nextInt(); // aumento da diário
        System.out.println("Insira o dia que você irá chegar");
        int N = n.nextInt(); // dia da chegada no hotel
        int valor = 0;
        if(D >= 1 && D <= 1000 && A >= 1 && A <= 1000 && N >= 1 && N <= 31){
            if(N == 1){
            valor = 31 * D;
        }else if(N > 1 && N < 16){
          valor = (31 - (N-1)) * (D + ((N - 1) * A));
        }else if(N >= 16){
          valor = (31 - (N-1)) * (D + (14 * A));
        }System.out.println(valor);
        }else{
      System.out.println("Erro");
    }
  }
}
