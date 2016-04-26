package Aula11;

/**
 * Created by ramon on 26/04/16.
 */
public class Ordenacao {

    public static void main(String[] args) {
        int vetorA[]={10,9,8,7,6};
        int vetorB[]={10,9,8,7,6};
        metodo1(vetorA,5);
        metodo2(vetorB,5);
    }

    public static void metodo1 (int vetor[], int tamanho){
        {
         int trocas=0;int comp=0;
            int aux;
            for(int i=tamanho-1; i >= 1; i--)
            {
                for( int j=0; j < i ; j++)
                {
                    comp++;
                    if(vetor[j]>vetor[j+1])
                    {
                        trocas++;
                        aux = vetor[j];
                        vetor[j] = vetor[j+1];
                        vetor[j+1] = aux;
                    }
                }
            }

            for( int r = 0; r < tamanho; ++r)
            {
                System.out.printf(String.valueOf(vetor[r])+" -" );
            }
            System.out.println(trocas);
            System.out.println(comp);
        }
    }


    public static void metodo2(int[] vetor, int tamanho) {
        int menor;
        int indiceMenor;
        int trocas=0;
        int comp=0;
        for (int i = 0; i < tamanho - 1; i++) {
            // antes de comparar, considera-se menor o valor atual do loop
            menor = vetor[i];
            indiceMenor = i;

            // compara com os outros valores do vetor

            for (int j = i + 1; j < tamanho; j++){
                comp++;
                if (vetor[j] < menor){
                    menor = vetor[j];
                    indiceMenor = j;

                }
            }


            vetor[indiceMenor] = vetor[i];
            vetor[i] = menor;
            trocas++;

        }

        for( int r = 0; r < tamanho; ++r)
        {
            System.out.print(String.valueOf(vetor[r])+" -");
        }
        System.out.println(trocas);
        System.out.println(comp);
    }

}
