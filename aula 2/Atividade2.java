public class Atividade2 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 6;
        int selec = 4;
        int resultado = 0;

        System.out.println("Para alterar a operação, altere 'selec'");

        switch (selec) {
            case 1:
                resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.err.println(resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println(resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
