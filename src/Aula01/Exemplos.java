package Aula01;


import javax.swing.*;
import java.util.Scanner;

/**
 * Created by ramon on 01/03/16.
 */
public class Exemplos {

    public static void main(String args[]){
        int C=0;
        float F =0;
        boolean B=true;
        boolean b=true;
        char Cc;
        String umaString;

        Scanner tc = new Scanner(System.in);

      //  JOptionPane.showInputDialog(null,"Digite o valor");

        int[] vetor= new int[10];
        int [][] matrix = new int[10][10];

        if(b==false){
            System.out.println("b é falso "+ F +" Java");

            tc.next();
            tc.nextLine();

        }else{
            System.out.println("b é true");
        }

        do {

        }while (C<10);

        while (C<10){

        }

        for (int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }

        switch (C){

            case 1:{
                   int j=10;
                break;
            }
            case 2:{
                int j =12;
            }

        }


    }


}
