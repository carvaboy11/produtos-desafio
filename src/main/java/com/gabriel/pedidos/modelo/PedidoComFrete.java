package com.gabriel.pedidos.modelo;

public class PedidoComFrete extends PedidoDecorator {
    public PedidoComFrete(Pedido pedido) {
        super(pedido);
    }

    public double getPreco() {
        return pedido.getPreco() + 15.0;
    }

    public String getDescricao() {
        return pedido.getDescricao() + " + Frete";
    }
}