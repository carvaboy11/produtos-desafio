package com.gabriel.pedidos.pagamento;

public class PagamentoCartao implements PagamentoStrategy {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com CARTÃO.");
    }
}