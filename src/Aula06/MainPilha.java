package Aula06;

/**
 * Created by ramon on 28/06/16.
 */
public class MainPilha {
    static int  pilha[] = new int[10];
    static int base=-1;
    static int topo =-1;
    static int tam;

    public static void main(String[] args) {

        pop();
        push(1);
        push(2);
        push(3);
        pop();
        push(3);
        push(4);
        top();
        pop();
        top();
    }

    public static void lista(){
        for (int i=0;i<=topo;i++){
            System.out.println(pilha[i]);
        }
    }

    public static void top(){
        System.out.println(pilha[topo]);
    }

    public static boolean pop(){
        if(topo==-1){
            System.out.println("Pilha vazia daa");
            return false;
        }else {
            if(topo==0){
                base--;
            }
            topo--;
            return true;
        }

    }
    public static boolean push(int a){
        if(topo==9){
            System.out.println("Pilha cheia");
            return false;
        }
        if(topo==-1){
            topo++;
            base++;
            pilha[topo]=a;
        }else{
            topo++;
            pilha[topo]=a;
        }
return false;
    }

}
