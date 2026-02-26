import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        int contador = 0;

        while (contador < 5) {
            System.out.println("Contador" + contador);
            contador++;
        }
        do {
            System.out.println("1.jogar");
            System.out.println("2.sair");
            opcao = sc.nextInt();

        } while (opcao != 2);

        for (int a = 0; a < 5; a++) {
            System.out.println("valor de i:" + a);
        }

        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 25;

        String[] frutas = { "maça", "banana" };
        System.out.println(frutas[1]);

        int[][] matriz = new int[3][3];
        matriz[0][0] = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz[3][3] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
