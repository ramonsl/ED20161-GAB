package Aula02;

import java.util.Scanner;

/**
 * Created by ramon on 08/03/16.
 *
 * 1.	Faça um programa que leia um vetor de 10 elementos,
 * o vetor deve aceitar na primeira leitura apenas
 * valores entre 1 e 3. Nas leituras subsequentes o
 * valor deve ser maior ao seu antecessor.

 */
public class Ex3 {
    public static void main(String arg[]){
        int vet[]= new int[10];
        Scanner tc = new Scanner(System.in);
        int lido;
      for (int i=0;i<10;i++){
          System.out.println("Laço " +i);
          if(i==0){
              System.out.println("Digite o valor entre 1 e 3");
              do{
                  lido=tc.nextInt();
                  vet[i]=lido;
              }while ((lido>3)&&(lido>0) );
          }else{
              System.out.println("Digite o valor maior que "+ vet[i-1]);
              do{
                  lido=tc.nextInt();
                  vet[i]=lido;
              }while (lido <= vet[i-1] );
          }
      }

    }
}
