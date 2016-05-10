package Aula13;

/**
 * Created by ramon on 10/05/16.
 */
public class Main {

    public static void main(String[] args) {
        List lista= new List();

        Elemento e= new Elemento();
        e.ler();
        lista.addInicio(e);

        Elemento f= new Elemento();
        f.ler();
        lista.addInicio(f);

        Elemento g= new Elemento();
        g.ler();
        lista.addFim(g);

        lista.listar();
    }
}
