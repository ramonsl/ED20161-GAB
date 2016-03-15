package Aula04;

/**
 * Created by ramon on 15/03/16.
 */
class func{

        String nome;
        }

public class Funcao {

    public static void main(String[] args) {
        int b=2;
        String s= new String();
        s="amon";
        func f= new func();
        f.nome= "ramon";
        System.out.println(f.nome);
        troca(f);
        System.out.println(f.nome);
    }

    public static void troca(int a){
        a=10;
    }
    public static void troca(String a){
        a="Bilu";
    }
    public static void troca(func f){
        f.nome="biluteteia";
    }
}
