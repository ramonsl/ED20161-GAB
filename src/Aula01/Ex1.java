package Aula01;

import java.util.Scanner;

/**
 * Created by ramon on 01/03/16.
 *
 *
 * 1.	Faça um programa que leia um vetor unidimensional
 * de tamanho 10, aonde os valores devem ser entre 1 e 10.
 * Ao final da leitura mostrar a soma do vetor.
 * Mostrar o menor elemento lido e o maior.

 */
public class Ex1 {

    public static void main(String args[]){

        Scanner tc = new Scanner(System.in);
        int lido;

        int ma=0,so=0,me=0;
        int mat[] =new int [10];

      for (int i=0;i<10;i++) {
          do {
              System.out.println(i + "Digite o valor entre 1 e 10");
              lido = tc.nextInt();
          }
          while ((lido >= 10) || (lido <= 1));
          mat[i]=lido;
          if(i==0){
              ma=lido;
              me=lido;
          }else{
              if(ma < lido){
                  ma=lido;
              }
              if (me > lido){
                  me=lido;
              }

          }
          so+=lido;
      }

        System.out.println("Maior "+ma);
        System.out.println("Menor "+me);
        System.out.println("Soma "+so);
    }
}
