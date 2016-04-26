package Aula06;

public class Fila {
    int inicio;
    int fim;
    boolean isInit=false;
    int[] vet = new int[10];

    public boolean inicializar(){
        this.inicio =-1;
        this.fim=-1;
        isInit=true;
        return true;
    }
    public boolean isFull(){
        if (this.fim==9){
            System.out.println("Fila cheia");
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if (this.fim==-1){
            System.out.println("Fila vazia");
            return true;
        }else{
            return false;
        }
    }





    public boolean add(int a){

        if (isFull()){
            System.out.println("Fila Cheia Windows Me");
            return false;
        }else{
            if (this.isInit==true){
                this.fim++;
                this.vet[this.fim] =a;
                System.out.println(this.vet[this.fim] +" adicionado");
                return true;
            }else{
                System.out.println("Fila não inicializada");
                return false;
            }
        }
    }

    public boolean remover(){
        if (!isEmpty()){
            for (int i=0; i< this.fim;i++){
                this.vet[i]=this.vet[i+1];
            }
            this.fim--;
            return true;
        }
        return false;
    }
    public void mostraFila(){
        for (int i=0; i<= this.fim;i++){
            System.out.printf(String.valueOf(this.vet[i]));
        }
    }





}
