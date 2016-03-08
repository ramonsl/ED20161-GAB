package Aula02;

import java.util.Scanner;

/**
 * Created by ramon on 08/03/16.
 *
 * 1.	Faça um programa que leia um vetor
 * unidimensional de tamanho 10
 * , a leitura deve ser encerrada ao atingir
 * o tamanho do vetor ou o usuário digitar 0.
 * Ao final da leitura mostrar a soma do vetor e a média
 * dos valores lidos.

 */
public class Ex2 {
    public static void main(String arg[]){
        int vet[]= new int[10];
        Scanner tc = new Scanner(System.in);
        int lido;
        int me=0,so=0,i=0;
        do{
            System.out.println("Digite valor "+i);
            lido=tc.nextInt();
            if(lido==0){
                break;
            }
            else{
                so+=lido;
            }
            i++;
        } while (i<10);
        System.out.println("Soma "+ so);
        me=so/i;
        System.out.println("Media "+ me);


    }
}
