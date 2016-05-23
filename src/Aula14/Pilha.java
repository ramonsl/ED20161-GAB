package Aula14;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Scanner;

/**
 * Created by ramon on 23/05/16.
 */
public class Pilha {
    Conteiner base;
    Conteiner topo;
    int cod;
    String nome;
    int qtd;
    int max=5;
    public void init(){
        Scanner tc= new Scanner(System.in);
        System.out.println("Digite nome:");
        nome= tc.next();
        System.out.flush();
        System.out.println("Digite Cod:");
        cod= tc.nextInt();
        System.out.flush();
        System.out.println("Qtd maxima:");
        max= tc.nextInt();
        System.out.flush();
    }
    public void showPark(){
      //  Scanner tc= new Scanner(System.in);
        list();
        System.out.println("--------------------------");
        System.out.println("["+ nome + "]"+ "{"+cod+"}");

    }


    public void list(){
        Conteiner aux= this.base;
        if(base==null){
            System.out.println("------------------------");
            System.out.println("|                      | ");
            System.out.println("|                      | ");
            System.out.println("|                      | ");
            System.out.println("|                      | ");
            System.out.println("        VAZIA          ");
            System.out.println("------------------------");
        }else{
            while (aux!=null){
                System.out.println(  aux.toString());
                aux=aux.next;
            }
        }

    }


    public boolean push(Conteiner c){
        if(base == null){
            this.base=c;
            this.topo=c;
            this.qtd++;
            return true;
        }
        else{
            if(this.qtd==max){
                System.out.println("Pilha acima do limete");
                return false;
            }else{
                Conteiner aux=this.base;
                while (aux.next!=null){
                    aux=aux.next;
                }
                aux.next=c;
                this.topo=c;
                return true;
            }
        }
    }

}
