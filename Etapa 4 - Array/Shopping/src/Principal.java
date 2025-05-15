import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        int opcaoDesejada = 0;
        Loja loja = null;
        Produto produto = null;

        while (opcaoDesejada != 3) {

            System.out.println("Digite o número desejado: ");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");

            opcaoDesejada = sc1.nextInt();
            sc1.nextLine();

            switch (opcaoDesejada) {
                case 1:
                    System.out.println("Digite o nome da loja: ");
                    String nomeLoja = sc1.nextLine();
                    System.out.println("Digite a quantidade de funcionários: ");
                    int quantidadeFuncionarios = sc1.nextInt();
                    sc1.nextLine(); // finalizar linha de int
                    System.out.println("Digite o salário base dos funcionários: ");
                    double salarioBaseFuncionario = sc1.nextDouble();
                    sc1.nextLine(); // finalizar linha de double
                    System.out.println("Digite o endereço da loja: ");
                    String endereco = sc1.nextLine();
                    System.out.println("Digite a data de fundação da loja (dd/mm/aaaa): ");
                    String dataFundacao = sc1.nextLine();
                    System.out.println("Loja criada!");
                    break;

                case 2:
                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = sc1.next();
                    System.out.println("Digite o preço do produto: ");
                    double preco = sc1.nextDouble();
                    sc1.nextLine(); // finalizar linha de double
                    System.out.println("Digite a data de validade do produto: ");
                    String dataValidade = sc1.nextLine();
                    System.out.println("Produto criado!");
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Comando inválido, tente novamente.");

                    break;
            }
        }
        sc1.close();
    }
}
