
public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Cleiton";
        pessoa1.idade = 75;
        pessoa1.altura = 1.70;
        pessoa1.cpf = "11015516904";

        pessoa1.caminhar();
        System.out.println("nome: " + pessoa1.nome);
        System.out.println("idade: " + pessoa1.idade);
        System.out.println("altura: " + pessoa1.altura);
        System.out.println("cpf: " + pessoa1.cpf);
    }
}
