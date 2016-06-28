package Revisao;

/**
 * Created by ramon on 28/06/16.
 */



public class MainVetor {

   static int  fila[] = new int[10];
    static int inicio=-1;
    static int fim =-1;
    static int tam;

    public static void main(String[] args) {

        del();
        listar();


    }
    public static void listar(){
        if(fim==-1){
            System.out.println("Fila vazia...");

        }else{
        for(int i=inicio; i<=fim; i++){
            System.out.println(fila[i]);
        }
    }}


    public static boolean del() {
        if (inicio != -1) {
            fim--;
            for (int i = 0; i < fim; i++) {
                fila[i] = fila[i + 1];
            }
            return true;
        } else {
            System.out.println("Fila vazia");
            return false;
        }
    }
    public static boolean add(int a){
        if(inicio==-1){
            inicio++;
            fim++;
            fila[fim]=a;
            System.out.println("Add primeiro elemento");
            return true;
        }else{
            if (fim==9){
                System.out.println("Fila Cheia");
                return false;
            }else{
                fim++;
                fila[fim]=a;
                System.out.println("Add elemento");
                return true;


            }
        }

    }


}
