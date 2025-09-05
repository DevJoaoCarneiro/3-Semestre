package org.example;

public abstract class ProdutoBase implements Entidade {
    private String nomeProduto;
    private Integer qtdeEstoque;

    public ProdutoBase(String nomeProduto, Integer qtdeEstoque) {
        this.nomeProduto = nomeProduto;
        this.qtdeEstoque = qtdeEstoque;
    }

    @Override
    public String getNome() {
        return nomeProduto;
    }
    public Integer getQtdeEstoque() {
        return qtdeEstoque;
    }

    @Override
    public String toString() {
        return "ProdutoBase{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", qtdeEstoque=" + qtdeEstoque +
                '}';
    }
}
