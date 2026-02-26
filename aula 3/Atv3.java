public class Atv3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int par = 0;
        int impar = 0;
        int i = 0;

        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;
        vetor[5] = 6;
        vetor[6] = 7;
        vetor[7] = 8;
        vetor[8] = 9;
        vetor[9] = 10;

        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares[par] = vetor[i];
                par++;
            } else {
                impares[impar] = vetor[i];
                impar++;
            }
        }
        System.out.println("Voce possui: " + par + " pares, sendo eles :");
        for (i = 0; i < par; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.println("Também possui: " + impar + " impares, sendo eles :");
        for (i = 0; i < impar; i++) {
            System.out.print(impares[i] + " ");
        }
    }

}
