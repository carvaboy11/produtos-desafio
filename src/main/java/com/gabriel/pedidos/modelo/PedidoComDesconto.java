package com.gabriel.pedidos.modelo;

public class PedidoComDesconto extends PedidoDecorator {
    public PedidoComDesconto(Pedido pedido) {
        super(pedido);
    }

    public double getPreco() {
        return pedido.getPreco() * 0.9;
    }

    public String getDescricao() {
        return pedido.getDescricao() + " + Desconto";
    }
}