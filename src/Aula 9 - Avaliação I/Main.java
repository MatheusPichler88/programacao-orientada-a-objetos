package Prova;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 1;
        while (op != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("------------Menu-----------");
            System.out.println("1-Criar produto informando nome");
            System.out.println("2-Criar produto informando nome e preço");
            System.out.println("3-Exibir informações do produto");
            System.out.println("4-Atribuir nome do produto");
            System.out.println("5-Obter nome do produto");
            System.out.println("6-Atribuir preço do produto");
            System.out.println("7-Obter preço do produto");
            System.out.println("8-Atribuir quantidade em estoque");
            System.out.println("9-Obter quantidade em estoque");
            System.out.println("0-Sair");

            System.out.println("Digite a opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    Produto p = new Produto(sc.next());
                    break;
                    case 2:
                        System.out.println("Digite o nome do produto: ");
                        String nome = sc.next();
                        System.out.println("Digite o preço do produto: ");
                        double preco = sc.nextDouble();
                        p = new Produto(nome, preco);
                        break;
                        case 3:
                            System.out.println("Exibindo informaçes do produto: ");
                            //p.exibirInformacoes();
                            break;
                            case 4:
                                System.out.println("Atribuir o nome do produto: ");
                                p = new Produto(sc.nextLine());
                                System.out.println("Digite o nome do produto:");
                                p.setNome(sc.nextLine());
                                break;
                                case 5:
                                    System.out.println("Obtendo nome do produto: ");
                                     p = new Produto(sc.nextLine());
                                    System.out.println("Nome:"+p.getNome());

                                    break;
                                    case 6:
                                        System.out.println("Atribuindo o  preço do produto: ");
                                         p = new Produto(sc.nextLine());
                                        System.out.println("Digite o preço do produto:");
                                        p.setPreco(sc.nextDouble());
                                        break;
                                        case 7:
                                            System.out.println("Obtendo preço do produto: ");
                                            p = new Produto(sc.nextLine());
                                            p.getPreco();
                                            break;
                                            case 8:
                                                System.out.println("Atribuindo quantidade em estoque: ");
                                                 p = new Produto(sc.nextLine());
                                                System.out.println("Digite o quantidade em estoque:");
                                                p.setQuantidadeEstoque(sc.nextInt());
                                                break;
                                                case 9:
                                                    System.out.println("Obtendo quantidade em estoque: ");
                                                    p = new Produto(sc.nextLine());
                                                    p.getQuantidadeEstoque();
                                                    break;

                                                    case 0:
                                                        System.out.println("Saindo...");
                                                        break;

            }
        }

        }
    }
