package Aula02;

/**
 * Created by ramon on 15/03/16.
 */


        import java.util.Scanner;

class Carro {

    String marca;
    String cor;
    int ano;
    float preco;
}

public class Ex7 {
    static Carro c = new Carro();
    static Scanner tc = new Scanner(System.in);
    static Carro[] vetCarros = new Carro[20];
    static int x=0;

    public static void main(String[] args) {
        int menu;
        do{
            System.out.print("- 1 - Ler carro\n"+ "- 2 - Verifica iguais por preço\n"+ "- 3 - Busca por marca\n"+ "- 4 - Busca por Marca, ano e cor\n"+ "- 5 - Sair\n"+ "- Sua opção: ");
            menu = tc.nextInt();
            switch(menu){
                case 1:{
                    if (x<20) {
                        x = LeCarro(x);
                    }
                    else{
                        System.out.println("ERROR! LIMITE DE CARROS ATINGIDO!");
                    }
                    break;
                }
                case 2:{
                    VerificaPreco();
                    break;
                }
                case 3:{
                    BuscaMarca();
                    break;
                }
                case 4:{
                    BuscaPorMarcaAnoCor();
                    break;
                }
                case 5:{
                    System.out.println("Saindo....");
                    break;
                }
                default:
                    System.out.println("Opção Invalida!");
            }
        }while(menu!=5);
    }

    private static int LeCarro(int x){
        vetCarros[x] = new Carro();
        tc.nextLine();
        do{
            System.out.println("Marca:");
            vetCarros[x].marca = tc.nextLine();
            System.out.println("Ano:");
            vetCarros[x].ano = tc.nextInt();
            System.out.println("Cor:");
            tc.nextLine();
            vetCarros[x].cor = tc.nextLine();
            System.out.println("Preço:");
            vetCarros[x].preco =  tc.nextFloat();

            x++;

            tc.nextLine();
            System.out.println("Continuar?(s/n)");
            String nao = tc.nextLine();
            if (!nao.contentEquals("s")){
                break;
            }
            else{
                System.out.println("--Nova Leitura--");
            }
        }while(x<20);

        return x;
    }

    private static void VerificaPreco(){
        System.out.println("Informe o preço:");
        float busca = tc.nextFloat();
        boolean search = true;
        for(int i=0;i < x;i++){
            if (vetCarros[i].preco <= busca){
                System.out.println("Marca: "+ vetCarros[i].marca +" // Cor: "+ vetCarros[i].cor +" // Ano: "+ vetCarros[i].ano);
                search = false;
            }
        }
        if (search){
            System.out.println("Não foram encontrados veículos!");
        }
    }

    private static void BuscaMarca(){
        tc.nextLine();
        System.out.println("Informe a marca:");
        String marca = tc.nextLine();
        boolean search = true;
        for (int i=0;i < x;i++) {
            if (vetCarros[i].marca.contentEquals(marca)) {
                System.out.println("Preço: " + vetCarros[i].preco + " // Cor: " + vetCarros[i].cor + " // Ano: " + vetCarros[i].ano);
                search = false;
            }
        }
        if (search) {
            System.out.println("Não foram encontrados veículos!");
        }

    }

    private static void BuscaPorMarcaAnoCor(){
        tc.nextLine();
        System.out.println("Informe os seguintes dados para busca: "+
                "\nMarca: ");
        String marca = tc.nextLine();
        System.out.println("Ano: ");
        int ano = tc.nextInt();
        tc.nextLine();
        System.out.println("Cor: ");
        String cor = tc.nextLine();
        boolean ok=true;
        for(int i=0; i<x; i++){
            if(vetCarros[i].marca.contentEquals(marca))
                if(vetCarros[i].ano == ano)
                    if(vetCarros[i].cor.contentEquals(cor)){
                        System.out.println("Preço: "+ vetCarros[i].preco );
                        ok=false;
                    }
        }
        if(ok)
            System.out.println("Não foram encontrados veículos!");
    }

}
