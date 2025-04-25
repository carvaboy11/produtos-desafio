package com.gabriel.pedidos.modelo;

public class PedidoSimples implements Pedido {
    private double preco;
    private String descricao;

    public PedidoSimples(double preco, String descricao) {
        this.preco = preco;
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}