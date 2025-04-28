package com.gabriel.pedidos.service;

import org.springframework.stereotype.Service;

import com.gabriel.pedidos.modelo.Pedido;
import com.gabriel.pedidos.modelo.PedidoComDesconto;
import com.gabriel.pedidos.modelo.PedidoComFrete;
import com.gabriel.pedidos.modelo.PedidoSimples;
import com.gabriel.pedidos.pagamento.PagamentoFactory;
import com.gabriel.pedidos.pagamento.PagamentoStrategy;
import com.gabriel.pedidos.util.Logger;

@Service
public class PedidoService {
    public void processarPedido(String descricao, double preco, String tipoPagamento) {
        Pedido pedido = new PedidoSimples(preco, descricao);
        pedido = new PedidoComDesconto(pedido);
        pedido = new PedidoComFrete(pedido);

        Logger.getInstancia().log("Pedido criado: " + pedido.getDescricao() + " | Total: R$" + pedido.getPreco());

        PagamentoStrategy pagamento = PagamentoFactory.getPagamento(tipoPagamento);
        pagamento.pagar(pedido.getPreco());
    }
}