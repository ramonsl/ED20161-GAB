package Aula14;

import java.util.Scanner;

/**
 * Created by ramon on 23/05/16.
 */
public class Main {


   public static Scanner tc= new Scanner(System.in);

    public static void main(String[] args) {
        Pilha a= new Pilha();
        Pilha b= new Pilha();
        Pilha c= new Pilha();
        inicializar(a,b,c);
        int op=0;

        do {
            System.out.println("1 Para Add");
            System.out.println("2 Para Rem");
            System.out.println("9 mostrar o park");
            op=tc.nextInt();

            switch (op){
                case 1:{
                    Conteiner c1= new Conteiner();
                    c1.ler();
                    a.push(c1);
                    break;
                }
                case 9:{
                    a.showPark();
                    b.showPark();
                    c.showPark();
                    break;
                }
            }

            System.out.println("   "); System.out.println("   ");
        }while (op!=10);



    }

    public static void inicializar(Pilha p1, Pilha p2, Pilha p3){


        p1.nome = "Estacionamento 1";
        p1.cod = 22;


        p2.nome = "Estacionamento 33";
        p2.cod = 33;


        p3.nome = "Estacionamento tempo";
        p3.cod = 11;



    }



}
