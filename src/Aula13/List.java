package Aula13;

/**
 * Created by ramon on 10/05/16.
 */
public class List {

    public Elemento inicio;
    public Elemento fim;
    public int qtd;


    public boolean add(Elemento e){
        if (this.inicio==null){
            this.inicio = e;
            this.fim=e;
            this.qtd++;
            return true;
        }else{
            return false;
        }
    }
    public boolean addInicio(Elemento e){
        if (this.inicio==null){
            return this.add(e);
        }else{
            e.proximo = this.inicio;
            this.inicio =e;
            this.qtd++;
            return true;
        }

    }
    public boolean addMeio(){
        return false;
    }
    public boolean addFim(Elemento e){
        if(this.inicio==null){
            return this.add(e);
        }else{
            this.fim.proximo = e;
            this.fim=e;
            this.qtd++;
            return true;
        }

    }
    public boolean delInicio(){
        return false;
    }
    public boolean delMeio(){
        return false;
    }
    public boolean delFim(){
        return false;
    }
    public boolean update(){
        return false;
    }
    public void listar(){
        if(this.qtd==0){
            System.out.println("Lista Vazia");
        }else{
            Elemento aux= this.inicio;
            while(aux!=null){
                aux.mostrar();
                aux=aux.proximo;
            }
            System.out.println("Lista possui "+this.qtd);
        }
    }



}
