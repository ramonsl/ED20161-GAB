package Revisao;

/**
 * Created by ramon on 28/06/16.
 */
public class Lista {

    public Nodo inicio;
    public Nodo fim;
    public int qtd;

    void addInicio(Nodo c){

        if(inicio==null){
            this.inicio=c;
            this.fim=c;
            qtd++;
        }else{
            c.proximo=this.inicio;
            this.inicio=c;
            this.qtd++;
        }

    }

    void addFimEasy(Nodo c){
        if(inicio==null){
            addInicio(c);
        }else{
            this.fim.proximo=c;
            this.fim = c;
            this.qtd++;
        }

    }

    void addFimHard(Nodo c){
        if(inicio==null){
            addInicio(c);
        }else{
          Nodo aux=this.inicio;
          while (aux.proximo!=null){
              aux=aux.proximo;
          }

            aux.proximo =c;
            this.fim=c;
            this.qtd++;

        }

    }

    void addPosicao(Nodo c,int p){
        //na minha lista o 0 é a primeira posiçao
        if(p==0){
            addInicio(c);
        }else if(p>=qtd-1){
            addFimEasy(c);
        }else{
            Nodo aux= this.inicio;
            Nodo ant=null;
            for(int i=0;i<p; i++){
                ant =aux;
                aux=aux.proximo;
            }
            ant.proximo =c;
            c.proximo=aux;
            this.qtd++;

        }
    }
    void removerPosicao(int p){
        if (p==0){
     //       removerInicio();
        }else if(p>=qtd-1){
            //removerFim();
        }else{
            Nodo rem=this.inicio;
            Nodo ant=null;
            for(int i=0;i<p;i++){
                ant=rem;
                rem=rem.proximo;
            }
            ant.proximo=rem.proximo;
            qtd--;
        }
    }

}
