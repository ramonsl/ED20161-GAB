package Aula06;

public class Pilha {
    int topo;
    int base;
    boolean isInit=false;
    int[] vet= new int[10];

   public boolean inicializar() {
        //inicializar
       this.topo=-1;
       this.base=-1;
       this.isInit=true;
       System.out.println("Pilha inicializada");
       return true;
    }

    public boolean isEmpty(){
        if (this.topo ==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (this.topo==9){
            return true;
        }else{
            return false;
        }
    }




    public boolean push(int a){

        if (isFull()){
            System.out.println("Pilha Cheia Windows Me");
            return false;
        }else{
            if (this.isInit==true){
            this.topo++;
            this.vet[this.topo] =a;
            System.out.println(this.vet[this.topo] +" adicionado");
             return true;
            }else{
                System.out.println("Pilha nao inicializada");
                return false;
            }
        }
    }

    public boolean pop(){

        if (isEmpty()){
            System.out.println("Pilha vazia Windows Me");
            return false;
        }else{
            System.out.println(this.vet[this.topo] +" removido");
            this.topo--;
            return true;
        }
    }

    public boolean pull(int b){

        if(isEmpty()){
            System.out.println("Pilha vazia Windows Me");
            return false;
        }else{
            this.vet[this.topo]=b;
            System.out.println(this.vet[this.topo] + " Atualizado");
            return true;
        }

    }
    public boolean top(){
        if (!isEmpty()){
            System.out.println(this.vet[this.topo] + " TOP");
            return true;
        }else{
            System.out.println(" pilha vazia");
            return false;

        }
    }


}
