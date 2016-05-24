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

        inicializar(a,b);
        int op=0;

        do {
            a.showPark();
            b.showPark();

            System.out.println("1 Para Add");
            System.out.println("2 Para Rem");
            System.out.println("9 mostrar o park");
            op=tc.nextInt();

            switch (op){
                case 1:{
                    Conteiner c1= new Conteiner();
                    c1.ler();
                    System.out.println("Digite o codigo da Pilha");
                    int p=tc.nextInt();
                    if(p==22){
                        a.push(c1);
                    }else if(p==33){
                        b.push(c1);
                    }

                    break;
                }

                case 2:{
                    System.out.println("Digite o codigo da Pilha");
                    int p=tc.nextInt();
                    if(p==22){
                        a.pop();
                    }else if(p==33){
                        b.pop();
                    }

                    break;

                }

                case 9:{
                    a.showPark();

                    break;
                }
            }

            System.out.println("   "); System.out.println("   ");
        }while (op!=10);



    }

    public static void inicializar(Pilha p1, Pilha p2){


        p1.nome = "Estacionamento 1";
        p1.cod = 1;


        p2.nome = "Estacionamento 33";
        p2.cod = 2;




    }



}
