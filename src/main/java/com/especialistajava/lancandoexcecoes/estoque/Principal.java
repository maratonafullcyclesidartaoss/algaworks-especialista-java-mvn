package com.especialistajava.lancandoexcecoes.estoque;

import com.especialistajava.lancandoexcecoes.estoque.model.Produto;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.ativar();
        produto.adicionarEstoque(20);

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        Scanner scanner = new Scanner(System.in);
        do {
            try {

                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.println("Compra realizada");
                break;
            } catch (BaixaEstoqueException bee) {
                System.out.println("Erro na compra: " + bee.getCause().getMessage());
//                bee.printStackTrace();
            }
//            catch (IllegalArgumentException iae) {
//                iae.printStackTrace(System.out);
//                System.out.println("Erro na compra: " + iae.getMessage());
//            } catch (ProdutoSemEstoqueException pse) {
//                System.out.printf("Erro na compra: %s Estoque disponível: %d. Estoque necessário: %d.%n",
//                        pse.getMessage(), pse.getEstoqueDisponivel(), pse.getEstoqueNecessario());
//            } catch (ProdutoInativoException pie) {
//                System.out.println("Erro na compra: " + pie.getMessage());
//                System.out.print("Deseja ativar o produto? ");
//                boolean ativarProduto = scanner.nextBoolean();
//                if (ativarProduto) {
//                    produto.ativar();
//                    System.out.println("Ok. Produto já foi ativado.");
//                } else {
//                    System.out.println("Ok. Compra não pode ser realizada.");
//                    break;
//                }
//            } catch (ProdutoException pe) {
//                System.out.println(pe.getClass().getName());
//                System.out.println("Erro na compra: " + pe.getMessage());
//            }
        } while (true);
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade)
            throws BaixaEstoqueException {
        try {
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                quantidade, produto.getQuantidadeEstoque());
        } catch (IllegalArgumentException | ProdutoException e) {
            throw new BaixaEstoqueException("Erro ao realizar baixa no estoque.", e);
        }
    }
}
