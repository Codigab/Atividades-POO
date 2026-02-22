import java.util.Scanner;
public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int qnt = 0;
        int ast = 0;
        System.out.println("Digite a quantidade de linhas da escada");
        qnt = sc.nextInt();

        for (i = 0; i < qnt; i++){
            ast++;
                for (j = 0; j < ast; j++){
                System.out.print("*");
                }
            System.out.println();
        }
        
    }
    
    
}
