package Aula02;
import java.util.Scanner;
/**
 * Created by ramon on 15/03/16.
 */

    public class Ex8 {

        static Scanner tc = new Scanner(System.in);
        static Produto[] estoque = new Produto[100];
        static int i=0;

        private static int LeEstoque(){
            estoque[i] = new Produto();
            System.out.println("Digite 'sair' para interromper a leitura. ");
            while(i<100){
                System.out.println("- Produto "+i+
                        "\nNome: ");
                estoque[i].nome = tc.next();
                if(estoque[i].nome.contentEquals("sair"))
                    break;
                System.out.println("Setor: ");
                estoque[i].setor = tc.next();
                System.out.println("Quantidade: ");
                estoque[i].qtd = tc.nextInt();
                System.out.println("Preço:");
                estoque[i].preco = tc.nextFloat();

                i++;
            }
            return i;
        }

        private static void BuscaSetor(){
            boolean ok=false;
            int q=0;
            System.out.println("Informe o setor para busca: ");
            String setor = tc.next();
            for (int j=0; j<i; j++) {
                if(estoque[j].setor.contentEquals(setor)){
                    ok=true;
                    System.out.println("Nome: "+ estoque[j].nome);
                    q++;
                }
            }
            if(!ok)
                System.out.println("Não foram encontrados produtos!");
            else
                System.out.println("Foi encontrado(s) "+ q +" produto(s) neste setor. ");
        }

        private static void CalculaCapital(){
            float total=0;
            for (int j=0; j<i; j++)
                total+= estoque[j].preco;
            System.out.println("Capital total investido no estoque: "+ total);
        }

        public static void main(String[] args) {
            tc.reset();
            int opt=0;
            while(opt!=4){
                System.out.print("- 1 - Ler estoque\n"+
                        "- 2 - Busca setor\n"+
                        "- 3 - Calcula capital\n"+
                        "- 4 - Sair\n"+
                        "- Sua opção: ");
                opt = tc.nextInt();
                switch (opt){
                    case 1:{
                        if(i<100)
                            i = LeEstoque();
                        else
                            System.out.println("Estoque lotado. ");
                        break;
                    }
                    case 2:{
                        BuscaSetor();
                        break;
                    }
                    case 3:{
                        CalculaCapital();
                        break;
                    }
                    case 4:break;
                }
            }
            System.out.println("Fim...");
        }
    }



