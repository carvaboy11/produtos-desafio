package com.gabriel.pedidos.service;

import com.gabriel.pedidos.modelo.*;
import com.gabriel.pedidos.pagamento.*;
import com.gabriel.pedidos.util.Logger;
import org.springframework.stereotype.Service;

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