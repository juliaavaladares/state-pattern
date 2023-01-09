package main;

public class PedidoEstadoNegado extends PedidoEstado {
    private PedidoEstadoNegado() {
    };

    private static PedidoEstadoNegado instance = new PedidoEstadoNegado();

    public static PedidoEstadoNegado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pagamento do pedido negado";
    }

    public boolean pagarPedido(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        return true;
    }

}
