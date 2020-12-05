package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    ArvoreAvl arvore = new ArvoreAvl();
    int elemento;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main teste = new Main();
        teste.opcoes();
    }
    
    public void opcoes() {
        System.out.println("Escolha a ação desejada:");
        System.out.println("1 - Incluir elemento");
        System.out.println("--");
        System.out.println("2 - Excluir elemento");
        System.out.println("--");
        System.out.println("3 - Verificar se a árvore está balanceada");
        System.out.println("--");
        System.out.println("4 - Imprimir árvore In Order");
        System.out.println("--");
        System.out.println("5 - Imprimir árvore Pos Order");
        System.out.println("--");
        System.out.println("6 - Imprimir árvore Pre Order");
        System.out.println("--");
        System.out.println("7 - Sair");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        acao(opcao);
    }
    
    public void acao(int opcaoEscolhida) {
        Scanner sc = new Scanner(System.in);
        switch (opcaoEscolhida) {
            case 1: System.out.println("\nDigite o elemento que será adicionado:");
                    elemento = sc.nextInt();
                    arvore.inserir(elemento);
                    opcoes();
                    break;
            case 2: System.out.println("\nDigite o elemento que será removido:");
                    elemento = sc.nextInt();
                    arvore.remover(elemento);
                    opcoes();
                    break;
            case 3: 
                if (arvore.getBalanceamento() < 3) {
                    if (arvore.getBalanceamento() == 0) {
                        System.out.println("\nA árvore está perfeitamente balanceada, com indice " + arvore.getBalanceamento());
                        opcoes();
                    } else {
                        System.out.println("\nA árvore está balanceada, com indice " + arvore.getBalanceamento());
                        System.out.println("");
                        System.out.println("");
                        opcoes();
                    }
                }
                    break;
            case 4:
                arvore.mostraArvore("in");
                opcoes();
                    break;
            case 5:
                arvore.mostraArvore("pos");
                opcoes();
                    break;
            case 6:
                arvore.mostraArvore("pre");
                opcoes();
                    break;
            case 7:
                break;

            default: opcoes();
        }
    }
}