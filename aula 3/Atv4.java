import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5 };
        int num = 0;
        int i = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele está contido no vetor");
        num = sc.nextInt();

        for( i = 0; i < vetor.length; i++){
            if(vetor[i] == num){
                System.out.println(num + " foi encontrado no vetor");
                sc.close();
                return;
            }
        }

        System.out.println("Seu número nao foi achado no vetor");
        sc.close();
    }

}
