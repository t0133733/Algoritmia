package TrabalhoAlgoritmia;

import java.util.Scanner;

public class TrabalhoPratico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Credenciais
        int username = 0;
        int password = 0;
        // Identificadores de produto para cada loja
        int id;
        int id2;
        // Quantidades em stock na Loja 1 e Loja2
        int tShirt = 0;
        int tShirt2 = 0;
        int sweat = 0;
        int sweat2 = 0;
        int calcas = 0;
        int calcas2 = 0;
        int casaco = 0;
        int casaco2 = 0;
        // Variáveis auxiliares
        int quantidade = 0;
        // Preço unitário de cada produto (igual nas duas lojas)
        int precoTshirt = 10;
        int precoSweat = 20;
        int precoCalcas = 25;
        int precoCasaco = 30;
        // Variáveis para calcular o valor total de cada loja e das duas juntas
        int precoLoja1 = 0;
        int precoLoja2 = 0;
        int precoTotal = 0;

        // Ciclo de autenticação: permite tentar login na Loja 1 ou Loja 2, ou sair com -1
        while ((username != 12345 && password != 12345) || (username != 54321 && password != 54321)) {
            System.out.print("\n\nUsername (-1 para sair): ");
            username = input.nextInt();
            if (username == -1) {
                System.out.println("\nPrograma terminado");
                return;
            }
            System.out.print("Password: ");
            password = input.nextInt();
            System.out.println();
            // Login Loja 1
            if (username == 12345 && password == 12345) {
                System.out.print("Loja 1: 1.T-shirt 2.Sweat 3.Calças 4.Casaco");
                int opcao;
                // Menu principal da Loja 1
                do {
                    System.out.println("\n\nMENU");
                    System.out.println("1.Consultar informações");
                    System.out.println("2.Adquirir");
                    System.out.println("3.Vender");
                    System.out.println("4.Transferir stock entre lojas");
                    System.out.println("5.Simular venda total - Loja atual");
                    System.out.println("6.Simular venda total - Todas as lojas");
                    System.out.println("7.Loja com maior valor");
                    System.out.println("8.Logout");

                    System.out.print("\n\nOpção: ");
                    opcao = input.nextInt();

                    switch (opcao) {
                        // Consultar informações de um produto da Loja 1
                        case 1:
                            System.out.print("\nID do produto: ");
                            id = input.nextInt();
                            if (id == 1) {
                                System.out.println("\nCódigo - 1");
                                System.out.println("Nome - T-shirt");
                                System.out.println("Preço - 10€");
                                System.out.println("Categoria - Men");
                                System.out.println("Stock: " + tShirt);
                            }
                            if (id == 2) {
                                System.out.println("Código - 2");
                                System.out.println("Nome - Sweat");
                                System.out.println("Preço - 20€");
                                System.out.println("Categoria - Men");
                                System.out.println("Stock: " + sweat);
                            }
                            if (id == 3) {
                                System.out.println("Código - 3");
                                System.out.println("Nome - Calças");
                                System.out.println("Preço - 25€");
                                System.out.println("Categoria - Men");
                                System.out.println("Stock: " + calcas);
                            }
                            if (id == 4) {
                                System.out.println("Código - 4");
                                System.out.println("Nome - Casaco");
                                System.out.println("Preço - 30€");
                                System.out.println("Categoria - Men");
                                System.out.println("Stock: " + casaco);
                            }
                            break;
                        // Adquirir (aumentar stock) na Loja 1
                        case 2:
                            System.out.print("\nID do produto: ");
                            id = input.nextInt();
                            if (id == 1) {
                                System.out.print("Quantas unidades pretende adquirir: ");
                                tShirt = input.nextInt();
                            }
                            if (id == 2) {
                                System.out.print("Quantas unidades pretende adquirir: ");
                                sweat = input.nextInt();
                            }
                            if (id == 3) {
                                System.out.print("Quantas unidades pretende adquirir: ");
                                calcas = input.nextInt();
                            }
                            if (id == 4) {
                                System.out.print("Quantas unidades pretende adquirir: ");
                                casaco = input.nextInt();
                            }
                            break;
                        // Vender (diminuir stock) na Loja 1, validando stock suficiente
                        case 3:
                            System.out.print("\nID do produto: ");
                            id = input.nextInt();
                            if (id == 1) {
                                System.out.print("Quantas unidades pretende vender: ");
                                int tShirtvenda = input.nextInt();
                                if (tShirt >= tShirtvenda && tShirtvenda > 0) {
                                    tShirt = tShirt - tShirtvenda;
                                    System.out.println("\nStock atual - " + tShirt + " unidades");
                                } else {
                                    System.out.println("\nStock insuficiente");
                                }
                            }
                            if (id == 2) {
                                System.out.println("Quantas unidades pretende vender: ");
                                int sweatVenda = input.nextInt();
                                if (sweat >= sweatVenda && sweatVenda > 0) {
                                    sweat = sweat - sweatVenda;
                                    System.out.println("\nStock atual - " + sweat + " unidades");
                                } else {
                                    System.out.println("\nStock insuficiente");
                                }
                            }
                            if (id == 3) {
                                System.out.println("Quantas unidades pretende vender: ");
                                int calcasVenda = input.nextInt();
                                if (calcas >= calcasVenda && calcasVenda > 0) {
                                    calcas = calcas - calcasVenda;
                                    System.out.println("\nStock atual - " + calcas + " unidades");
                                } else {
                                    System.out.println("\nStock insuficiente");
                                }
                            }
                            if (id == 4) {
                                System.out.println("Quantas unidades pretende vender: ");
                                int casacoVenda = input.nextInt();
                                if (casaco >= casacoVenda && casacoVenda > 0) {
                                    casaco = casaco - casacoVenda;
                                    System.out.println("\nStock atual - " + casaco + " unidades");
                                } else {
                                    System.out.println("\nStock insuficiente");
                                }
                            }
                            break;
                        // Transferir stock da Loja 1 para a Loja 2
                        case 4:
                            System.out.println("Nome e Código: T-shirt-1, Sweat-2, Calças-3,Casaco-4");
                            System.out.print("Qual o código do produto que pretende transferir: ");
                            id = input.nextInt();
                            System.out.print("Qual a quantidade a transferir: ");
                            quantidade = input.nextInt();

                            if (id == 1) {
                                tShirt = tShirt - quantidade;
                                tShirt2 = tShirt2 + quantidade;
                                System.out.print("\nOperação efetuada com sucesso");
                                System.out.println("\nStock atual Loja 1 - " + tShirt + " unidades");
                                System.out.println("Stock atual Loja 2 - " + tShirt2 + " unidades");
                            }
                            if (id == 2) {
                                sweat = sweat - quantidade;
                                sweat2 = sweat2 + quantidade;
                                System.out.print("\nOperação efetuada com sucesso");
                                System.out.println("\nStock atual Loja 1 - " + sweat + " unidades");
                                System.out.println("Stock atual Loja 2 - " + sweat2 + " unidades");
                            }
                            if (id == 3) {
                                calcas = calcas - quantidade;
                                calcas2 = calcas2 + quantidade;
                                System.out.print("\nOperação efetuada com sucesso");
                                System.out.println("\nStock atual Loja 1 - " + calcas + " unidades");
                                System.out.println("Stock atual Loja 2 - " + calcas2 + " unidades");
                            }
                            if (id == 4) {
                                casaco = casaco - quantidade;
                                casaco2 = casaco2 + quantidade;
                                System.out.print("\nOperação efetuada com sucesso");
                                System.out.println("\nStock atual Loja 1 - " + casaco + " unidades");
                                System.out.println("Stock atual Loja 2 - " + casaco2 + " unidades");
                            }
                            break;
                        // Calcular valor total do inventário da Loja 1
                        case 5:
                            precoLoja1 = (tShirt * precoTshirt) + (sweat * precoSweat) + (calcas * precoCalcas) + (casaco * precoCasaco);
                            System.out.print("\nValor total da Loja 1 - " + precoLoja1 + "€");
                            break;
                        // Calcular valor total do inventário das duas lojas
                        case 6:
                            precoTotal = (tShirt * precoTshirt) + (sweat * precoSweat) + (calcas * precoCalcas) + (casaco * precoCasaco) + (tShirt2 * precoTshirt) + (sweat2 * precoSweat) + (calcas2 * precoCalcas) + (casaco2 * precoCasaco);
                            System.out.println("\nValor total da Loja 1 + Loja 2 -  " + precoTotal + "€");
                            break;
                        // Determinar qual loja tem maior valor de inventário
                        case 7:
                            precoLoja1 = (tShirt * precoTshirt) + (sweat * precoSweat) + (calcas * precoCalcas) + (casaco * precoCasaco);
                            precoLoja2 = (tShirt2 * precoTshirt) + (sweat2 * precoSweat) + (calcas2 * precoCalcas) + (casaco2 * precoCasaco);
                            if (precoLoja1 > precoLoja2) {
                                System.out.print("\nLoja 1 têm um maior valor de inventário: " + precoLoja1 + "€");
                            }
                            if (precoLoja2 > precoLoja1) {
                                System.out.print("\nLoja 2 têm um maior valor de inventário: " + precoLoja2 + "€");
                            }
                            if (precoLoja1 == precoLoja2) {
                                System.out.print("\nLoja 1 e Loja 2 têm o mesmo valor de inventário");
                            }
                            break;
                        // Logout da Loja 1 (volta ao ciclo de login)
                        case 8:
                            System.out.println(" ");
                            break;

                        default:
                            System.out.println("\nOpção inválida");
                            break;
                    }
                    // 8 = Logout
                } while (opcao != 8);

                // Login Loja 2
            } else if (username == 54321 && password == 54321) {
                System.out.print("Loja 2: 1.T-shirt 2.Sweat 3.Calças 4.Casaco");
                int opcao2;

                // Menu principal da Loja 2
                do {
                    System.out.println("\n\nMENU");
                    System.out.println("1.Consultar informações");
                    System.out.println("2.Adquirir");
                    System.out.println("3.Vender");
                    System.out.println("4.Transferir stock entre lojas");
                    System.out.println("5.Simular venda total - Loja atual");
                    System.out.println("6.Simular venda total - Todas as lojas");
                    System.out.println("7.Loja com maior valor");
                    System.out.println("8.Logout");

                    System.out.print("\n\nOpção: ");
                    opcao2 = input.nextInt();

                    switch (opcao2) {
                        case 1:
                            System.out.print("\nID do produto: ");
                            id2 = input.nextInt();
                            if (id2 == 1) {
                                System.out.println("Código - 1");
                                System.out.println("Nome - T-shirt");
                                System.out.println("Preço - 10€");
                                System.out.println("Categoria - Men");
                                System.out.println("Stock: " + tShirt2);
                            }
                            if (id2 == 2) {
                                System.out.println("Código - 2");
                                System.out.println("Nome - Sweat");
                                System.out.println("Preço - 20€");
                                System.out.println("Categoria - Men");
                                System.out.println("Stock: " + sweat2);
                            }
                            if (id2 == 3) {
                                System.out.println("Código - 3");
                                System.out.println("Nome - Calças");
                                System.out.println("Preço - 25€");
                                System.out.println("Categoria - Men");
                                System.out.println("Stock: " + calcas2);
                            }
                            if (id2 == 4) {
                                System.out.println("Código - 4");
                                System.out.println("Nome - Casaco");
                                System.out.println("Preço - 30€");
                                System.out.println("Categoria - Men");
                                System.out.println("Stock: " + casaco2);
                            }
                            break;

                        case 2:
                            System.out.print("\nID do produto: ");
                            id2 = input.nextInt();
                            if (id2 == 1) {
                                System.out.print("Quantas unidades pretende adquirir: ");
                                tShirt2 = input.nextInt();
                            }
                            if (id2 == 2) {
                                System.out.print("Quantas unidades pretende adquirir: ");
                                sweat2 = input.nextInt();
                            }
                            if (id2 == 3) {
                                System.out.print("Quantas unidades pretende adquirir: ");
                                calcas2 = input.nextInt();
                            }
                            if (id2 == 4) {
                                System.out.print("Quantas unidades pretende adquirir: ");
                                casaco2 = input.nextInt();
                            }
                            break;

                        case 3:
                            System.out.print("\nID do produto: ");
                            id2 = input.nextInt();
                            if (id2 == 1) {
                                System.out.print("Quantas unidades pretende vender: ");
                                int tShirtvenda = input.nextInt();
                                if (tShirt2 >= tShirtvenda && tShirtvenda > 0) {
                                    tShirt2 = tShirt2 - tShirtvenda;
                                    System.out.println("\nStock atual - " + tShirt2 + " unidades");
                                } else {
                                    System.out.println("\nStock insuficiente");
                                }
                            }
                            if (id2 == 2) {
                                System.out.print("Quantas unidades pretende vender: ");
                                int sweatVenda = input.nextInt();
                                if (sweat2 >= sweatVenda && sweatVenda > 0) {
                                    sweat2 = sweat2 - sweatVenda;
                                    System.out.println("\nStock atual - " + sweat2 + " unidades");
                                } else {
                                    System.out.println("\nStock insuficiente");
                                }
                            }
                            if (id2 == 3) {
                                System.out.print("Quantas unidades pretende vender: ");
                                int calcasVenda = input.nextInt();
                                if (calcas2 >= calcasVenda && calcasVenda > 0) {
                                    calcas2 = calcas2 - calcasVenda;
                                    System.out.println("\nStock atual - " + calcas2 + " unidades");
                                } else {
                                    System.out.println("\nStock insuficiente");
                                }
                            }
                            if (id2 == 4) {
                                System.out.print("Quantas unidades pretende vender: ");
                                int casacoVenda = input.nextInt();
                                if (casaco2 >= casacoVenda && casacoVenda > 0) {
                                    casaco2 = casaco2 - casacoVenda;
                                    System.out.println("\nStock atual - " + casaco2 + " unidades");
                                } else {
                                    System.out.println("\nStock insuficiente");
                                }
                            }
                            break;

                        case 4:
                            System.out.println("Nome e Código: T-shirt-1, Sweat-2, Calças-3,Casaco-4");
                            System.out.print("Qual o código do produto que pretende transferir: ");
                            id2 = input.nextInt();
                            System.out.print("Qual a quantidade a transferir: ");
                            quantidade = input.nextInt();

                            if (id2 == 1) {
                                tShirt2 = tShirt2 - quantidade;
                                tShirt = tShirt + quantidade;
                                System.out.print("\nOperação efetuada com sucesso");
                                System.out.println("\nStock atual Loja 1 - " + tShirt);
                                System.out.println("Stock atual Loja 2 - " + tShirt2);
                            }
                            if (id2 == 2) {
                                sweat2 = sweat2 - quantidade;
                                sweat = sweat + quantidade;
                                System.out.print("\nOperação efetuada com sucesso");
                                System.out.println("\nStock atual Loja 1 - " + sweat);
                                System.out.println("Stock atual Loja 2 - " + sweat2);
                            }
                            if (id2 == 3) {
                                calcas2 = calcas2 - quantidade;
                                calcas = calcas + quantidade;
                                System.out.print("\nOperação efetuada com sucesso");
                                System.out.println("\nStock atual Loja 1 - " + calcas);
                                System.out.println("Stock atual Loja 2 - " + calcas2);
                            }
                            if (id2 == 4) {
                                casaco2 = casaco2 - quantidade;
                                casaco = casaco + quantidade;
                                System.out.print("\nOperação efetuada com sucesso");
                                System.out.println("\nStock atual Loja 1 - " + casaco);
                                System.out.println("Stock atual Loja 2 - " + casaco2);
                            }
                            break;
                        case 5:
                            precoLoja2 = (tShirt2 * precoTshirt) + (sweat2 * precoSweat) + (calcas2 * precoCalcas) + (casaco2 * precoCasaco);
                            System.out.print("\nValor total da Loja 2 - " + precoLoja2 + "€");
                            break;
                        case 6:
                            precoTotal = (tShirt * precoTshirt) + (sweat * precoSweat) + (calcas * precoCalcas) + (casaco * precoCasaco) + (tShirt2 * precoTshirt) + (sweat2 * precoSweat) + (calcas2 * precoCalcas) + (casaco2 * precoCasaco);
                            System.out.print("\nValor total da Loja 1 + Loja 2 -  " + precoTotal + "€");
                            break;
                        case 7:
                            precoLoja1 = (tShirt * precoTshirt) + (sweat * precoSweat) + (calcas * precoCalcas) + (casaco * precoCasaco);
                            precoLoja2 = (tShirt2 * precoTshirt) + (sweat2 * precoSweat) + (calcas2 * precoCalcas) + (casaco2 * precoCasaco);
                            if (precoLoja1 > precoLoja2) {
                                System.out.print("\nLoja 1 têm um maior valor de inventário: " + precoLoja1 + "€");
                            }
                            if (precoLoja2 > precoLoja1) {
                                System.out.print("\nLoja 2 têm um maior valor de inventário: " + precoLoja2 + "€");
                            }
                            if (precoLoja1 == precoLoja2) {
                                System.out.print("\nLoja 1 e Loja 2 têm o mesmo valor de inventário");
                            }
                            break;

                        case 8:
                            System.out.println(" ");
                            break;

                        default:
                            System.out.println("\nOpção inválida");
                            break;
                    }
                    // 8 = Logout
                } while (opcao2 != 8);

            }
            // Credenciais erradas para as duas lojas
            else {
                System.out.print("Login errado, por favor, tente novamente");
            }
        }
    }
}


