public class Atv1 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 3;
        vetor[3] = 4;
        vetor[4] = 5;

        int soma = 0;
        int maior = 0;
        int i = 0;

        for (i = 0; i < 5; i++) {
            soma += vetor[i];
        }

        for (i = 0; i < 5; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("Soma = " + soma);
        System.out.println("O maior é = " + maior);
    }

}
