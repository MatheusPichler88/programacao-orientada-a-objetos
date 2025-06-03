package aula14_avaliacao2;

public class ProdutoAlimenticio extends Produto{
    public boolean proximoVencimento;

    public ProdutoAlimenticio(String nome, double precoBase, double precoDesconto, boolean proximoVencimento) {
        super(nome, precoBase, precoDesconto);
        this.proximoVencimento = proximoVencimento;
    }

    @Override
    public void calcularPrecoFinal() {
        if(proximoVencimento){
            //preço com desconto referente ao vencimento
        }
        else{
            //preço sem desconto
        }
    }
}
