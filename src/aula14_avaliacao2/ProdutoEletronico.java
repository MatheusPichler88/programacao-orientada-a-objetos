package aula14_avaliacao2;

public class ProdutoEletronico extends Produto {
    public boolean gExtendida;

    public ProdutoEletronico(String nome, double precoBase, double precoDesconto, boolean gExtendida) {
        super(nome, precoBase, precoDesconto);
        this.gExtendida = gExtendida;
    }

    @Override
    public void aplicarDesconto(boolean valorFixo) {
        if (valorFixo) {
            //percentual
            valorDesconto = precoBase - 15;

        }
        else {
            //valor fixo
            valorDesconto = precoBase * 0.14;
        }
    }

    @Override
    public void calcularPrecoFinal() {
        if(gExtendida){
            //calcular com preco de garantia extendida
            precoFinal = (precoBase - valorDesconto) * 0.2;

        }
    }
    else{
        //sem garantia extendida
    }
}
