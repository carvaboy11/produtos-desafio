package com.gabriel.pedidos.pagamento;

public class PagamentoFactory {
    public static PagamentoStrategy getPagamento(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "cartao" -> new PagamentoCartao();
            case "boleto" -> new PagamentoBoleto();
            default -> throw new IllegalArgumentException("Tipo de pagamento inválido");
        };
    }
}