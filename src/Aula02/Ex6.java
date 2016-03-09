package Aula02;

import java.util.Scanner;

/**
 * Created by ramon on 08/03/16.
 */


public class Ex6 {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.cargo = "Professor";
        f.nome = "Ramon Lummertz";
        f.salario = 200.00;

        Scanner tc = new Scanner(System.in);
        Funcionario f2= new Funcionario();
        System.out.println("Digite nome:");
        f2.nome= tc.nextLine();
        System.out.println("Digite cargo:");
        f2.cargo=tc.nextLine();
        System.out.println("Digite Salario:");
        f2.salario = tc.nextDouble();


        System.out.println("Nome :"+f2.nome);
        System.out.println("Cargo :"+f2.cargo);
        System.out.println("Salario :"+f2.salario);

    }

}
