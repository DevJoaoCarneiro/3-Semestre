package org.example;

public class Produto extends ProdutoBase{
    private double precoDoProduto;

    public Produto(String nomeProduto, Integer qtdeEstoque, double precoDoProduto) {
        super(nomeProduto, qtdeEstoque);
        this.precoDoProduto = precoDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    @Override
    public String toString() {
        return "\nProduto..:" +getNome()+
                "\nPreco do produto..:" + precoDoProduto +
                "\nQuantidade em estoque..:"+getQtdeEstoque()+
                "\n";
    }
}
