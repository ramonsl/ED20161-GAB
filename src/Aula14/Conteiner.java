package Aula14;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Created by ramon on 23/05/16.
 */
public class Conteiner {
    String tipo;

    Conteiner next;


    public void mostrar() {

        System.out.println(    "| " + tipo +     "|" );

    }

    public void ler(){
        Scanner tc= new Scanner(System.in);
        System.out.println("Tipo");
        tipo=tc.next();
    }
}
