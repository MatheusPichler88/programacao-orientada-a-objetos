package aula14_avaliacao2;

public class Produto {
    protected String nome;
    protected double precoBase;
    protected double precoDesconto;
    protected double valorDesconto;
    public double precoFinal;

    public Produto(String nome, double precoBase, double precoDesconto) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.precoDesconto = precoDesconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto(double precoDesconto) {
        this.precoDesconto = precoDesconto;
    }


    public void calcularPrecoFinal(){
    precoFinal = precoBase - valorDesconto;
    }
    public void aplicarDesconto(){
    valorDesconto = precoBase * (precoDesconto / 100);
    }
}
