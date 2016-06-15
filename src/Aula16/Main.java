package Aula16;

import Aula13.List;

/**
 * Created by ramon on 14/06/16.
 */
public class Main {
    public static void main(String[] args) {
        Elemento a = new Elemento();
        a.nome="a";
        Elemento c = new Elemento();
        c.nome="c";
        Elemento b = new Elemento();
        b.nome="b";
        Elemento d = new Elemento();
        d.nome="d";
        Elemento z = new Elemento();
        z.nome="z";

        ListaO lista= new ListaO();

        lista.add(a);
        lista.add(d);
        lista.add(z);
        lista.add(b);
        lista.add(c);
        lista.list();

    }
}
