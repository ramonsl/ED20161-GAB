package Aula06;

/**
 * Created by ramon on 29/03/16.
 */
public class main {

    public static void main(String[] args) {
        Pilha p = new Pilha();

      //  p.inicializar();

        ///add o elemento 1
        p.push(1);

        ///add o elemento 3
        p.push(3);

        ///add o elemento 5
        p.push(5);


        p.pop();
        p.top();
        p.pull(123);
        p.top();



    }
}