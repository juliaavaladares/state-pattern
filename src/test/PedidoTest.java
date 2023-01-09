package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.*;

public class PedidoTest {
    Pedido pedido;
    Produto geladeira = new Produto("1", "Geladeira");
    Produto fogao = new Produto("2", "Fogao");

    ArrayList<Produto> produtos = new ArrayList<Produto>();

    @BeforeEach
    public void setUp() {
        produtos.add(geladeira);
        produtos.add(fogao);
        pedido = new Pedido("001", produtos);
    }

    //////////// Pedido feito //////////////////
    @Test
    public void naoDeveFazerPedidoFeito() {
        pedido.setEstado(PedidoEstadoFeito.getInstance());
        assertFalse(pedido.fazerPedido());
    }

    @Test
    public void devePagarPedidoFeito() {
        pedido.setEstado(PedidoEstadoFeito.getInstance());
        assertTrue(pedido.pagarPedido());
    }

    //////////// Pedido pago //////////////////
    @Test
    public void deveNegarPagamentoFeito() {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        assertTrue(pedido.negarPedido());
    }

    @Test
    public void deveConfirmarPagamentoFeito() {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        assertTrue(pedido.confirmarPedido());
    }

    //////////// Pedido negado //////////////////
    @Test
    public void deveConfirmarPagamentoPedidoNegado() {
        pedido.setEstado(PedidoEstadoNegado.getInstance());
        assertTrue(pedido.pagarPedido());
    }

    //////////// Pedido confirmado //////////////////
    @Test
    public void deveEnviarPedidoConfirmado() {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        assertTrue(pedido.enviarPedido());
    }

    //////////// Pedido eviado //////////////////
    @Test
    public void deveConfirmarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertTrue(pedido.confirmarEntregaPedido());
    }

}
