package aula14_avaliacao2;

import java.util.ArrayList;
import java.util.List;

public class PrincipalProva {
    List<Produto> produtos = new ArrayList() {
        ProdutoEletronico pe1 = new ProdutoEletronico("PC", 1000, 10, true);
    produtos.add(pe1);
        ProdutoEletronico pe2 = new ProdutoEletronico("JBL", 700, 12, false);
    produtos.add(pe2);
        ProdutoEletronico pe3 = new ProdutoEletronico("Projetor", 2000, 18, true);
    produtos.add(pe3);

        ProdutoAlimenticio pa1 = new ProdutoAlimenticio("Banana", 10, 10, true);
    produtos.add(pa1);
        ProdutoAlimenticio pa2 = new ProdutoAlimenticio("Leite", 8, 3, false);
    produtos.add(pa2);
        ProdutoAlimenticio pa3 = new ProdutoAlimenticio("Carne", 40, 18, true);
    produtos.add(pa3);

    for(
        Produto p :produto)

        {
            p.aplicarDesconto();
            p.calcularPrecoFinal();

            System.out.println("Produto: " + p.nome);
            System.out.println("Preço: " + p.precoBase);
            System.out.println("Desconto: " + p.percDesconto);
            System.out.println("Valor desconto: " + p.valorDesconto);
            System.out.println("Preco Final: " + p.precoFinal);
            System.out.printf("-----------------------------");
        }

    }
}

