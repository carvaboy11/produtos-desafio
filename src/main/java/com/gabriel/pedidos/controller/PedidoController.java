package com.gabriel.pedidos.controller;

import com.gabriel.pedidos.service.PedidoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public String fazerPedido(@RequestParam String descricao,
                              @RequestParam double preco,
                              @RequestParam String tipoPagamento) {
        pedidoService.processarPedido(descricao, preco, tipoPagamento);
        return "Pedido processado com sucesso!";
    }
}