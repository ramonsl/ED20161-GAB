package Aula14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by ramon on 23/05/16.
 */
public class Conteiner {
    String tipo;
    long entrada;
    long saida;
    Conteiner next;


    public void mostrar() {

      //  Calendar c=Calendar.getInstance();
       // c.setTimeInMillis(this.entrada);
        //int hours=c.get(Calendar.HOUR);

        System.out.println(    "| " + tipo +     "|" );
        System.out.println((System.currentTimeMillis() - entrada)/1000 +" segundos" );
        //so fazer a magica pra fazer em horas

    }

    public void ler(){
        Scanner tc= new Scanner(System.in);
        System.out.println("Tipo");
        tipo=tc.next();
        entrada= System.currentTimeMillis();
    }
}
