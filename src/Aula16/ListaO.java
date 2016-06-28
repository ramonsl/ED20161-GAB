package Aula16;

/**
 * Created by ramon on 14/06/16.
 */
public class ListaO {

        Elemento inicio;
        Elemento fim;
        int qtd;

        boolean add(Elemento c){
            if(inicio==null){
                return addInicio(c);
            }else {
                Elemento aux= this.inicio;
                int cont=0;
                while (aux!=null  ){
                    cont++;
                    if(c.nome.compareTo(aux.nome)<0){
                        break;
                    }
                    aux =aux.prx;
                }
                if(cont ==0){
                return     addInicio(c);
                }
                else if(cont == qtd){
                    return addFim(c);
                }else {
                    return addPosicao(c, cont);
                }
            }
        }

    boolean list(){
        Elemento aux= this.fim;
        while (aux!=null){
            System.out.println(aux.nome);
            aux=aux.ant;
        }
        return true;
    }



        boolean addInicio(Elemento c){
            if(this.inicio ==null){
                this.inicio=c;
                this.fim=c;
                this.qtd++;
                return true;
            }else{
                this.inicio.ant = c;
                c.prx = this.inicio;
                this.inicio =c;
                this.qtd++;
                return true;
            }
        }
        boolean addFim(Elemento c){
            if(this.inicio ==null){
                return addInicio(c);
            }else{
                this.fim.prx =c;
                c.ant = this.fim;
                this.fim = c;
                this.qtd++;
                return true;
            }
        }

    boolean addPosicao(Elemento c, int p) {


            Elemento aux= this.inicio;
            for (int i=1;i<p;i++){
                aux=aux.prx;
            }
            Elemento ant=  aux.ant; // ELEMENTO ANTERIOR
            Elemento prox=  aux; // ELEMENTO PROXIMO


            c.prx =prox;
            prox.ant=c;
            ant.prx=c;
            c.ant=ant;
        this.qtd++;
            return true;

    }








}
