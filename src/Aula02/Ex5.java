package Aula02;


        import java.util.Scanner;


public class Ex5 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[] vetor = new int[4];
        int[] vetor2 = new int[4];
        int somaLinha = 0, somaMatriz = 0, somaColuna = 0;

        Scanner tc = new Scanner(System.in);

        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.println("Digite um valor positivo para matriz:");
                System.out.print("[" + l + "]" + "[" + c + "]:");
                matriz[l][c] = tc.nextInt();
                while (matriz[l][c] < 0) {
                    System.out.println("Digite um numero POSITIVO:");
                    matriz[l][c] = tc.nextInt();
                }
            }
        }
        System.out.println();
        System.out.println("Soma das colunas: ");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                somaColuna += matriz[l][c];
            }
            vetor[l] = somaColuna;
            System.out.print("|" +somaColuna);
            somaColuna = 0;
        }
        System.out.println();
        System.out.println("Soma das linhas: ");
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                somaLinha += matriz[c][l];
            }
            vetor2[l] = somaLinha;
            System.out.print("|" +somaLinha);
            somaLinha = 0;
        }

        System.out.println();
        System.out.println("Soma Total: ");
        for (int l = 0; l < 4; l++)
            for (int c = 0; c < 4; c++)
                somaMatriz += matriz[l][c];
        System.out.println("Valor Total da Matriz:" +somaMatriz);

    }
}
