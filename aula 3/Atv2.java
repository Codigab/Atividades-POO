public class Atv2 {
    public static void main(String[] args) {
        int[] notas = new int[3];
        notas[0] = 76;
        notas[1] = 50;
        notas[2] = 90;

        int soma = 0;
        for (int i = 0; i < 3; i++){
            soma += notas[i];
        }

        int media = 0;
        media = soma/3;
        System.out.println("A média é = " + media);
    }
    
}
