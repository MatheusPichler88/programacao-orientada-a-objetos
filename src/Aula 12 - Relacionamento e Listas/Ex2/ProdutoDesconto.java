package Aula_12.Ex2;

public class ProdutoDesconto {

    public Produto criarProdutoDesconto(String nome, double preco){
        double produtoDesconto = preco-(preco*0.1);
        return new Produto(nome, produtoDesconto);
    }

}
