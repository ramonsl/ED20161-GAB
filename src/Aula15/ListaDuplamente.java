package Aula15;

/**
 * Created by ramon on 31/05/16.
 */
public class ListaDuplamente {
    Item inicio;
    Item fim;
    int qtd;

    boolean addInicio(Item c){
        if(this.inicio ==null){
            this.inicio=c;
            this.fim=c;
            this.qtd++;
            return true;
        }else{
            this.inicio.anterior = c;
            c.proximo = this.inicio;
            this.inicio =c;
            this.qtd++;
            return true;
        }
    }
    boolean addFim(Item c){
        if(this.inicio ==null){
             return addInicio(c);
        }else{
            this.fim.proximo =c;
            c.anterior = this.fim;
            this.fim = c;
            this.qtd++;
            return true;
        }
    }

}
