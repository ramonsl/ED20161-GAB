package Aula11;
public class Sequeciamento {
    public static void main(String[] args) {
        char dna[]= {'r','a','m','o','n'};
        for(int i=0; i<dna.length;i++){
            System.out.print(dna[i]);
        }
        System.out.println("");
      /*  ordem(dna);
        System.out.println();
        for(int i=0; i<dna.length;i++){
            System.out.print(dna[i]);
        }*/

        inverter(dna);
    }
    public static void ordem(char vet[]){
        for (int i=0;i<vet.length;i++){
            if(vet[i]=='a'){
                vet[i]=compa(vet[i+2],vet[i+3]);
        }
    }
    }
    public static char compa(char gen, char gen2){
        if((gen=='g')&&(gen2=='c')){
            return 't';
        }
        if((gen=='t')||(gen2=='c')){
            return 'a';
        }
        return gen;
    }
    public static void inverter(char vet[]){
        int aux =vet.length-1;
        for (int i=0;i<=vet.length-1;i++){
            vet[i]=vet[aux-i];
        }

        for (int i=0;i<=vet.length-1;i++){
            System.out.println(vet[i]);
        }
    }

}
