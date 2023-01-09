package main;

public class PedidoEstadoPago extends PedidoEstado {
    private PedidoEstadoPago() {
    };

    private static PedidoEstadoPago instance = new PedidoEstadoPago();

    public static PedidoEstadoPago getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido Feito";
    }

    public boolean confirmarPedido(Pedido pedido) {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        return true;
    }

    public boolean negarPedido(Pedido pedido) {
        pedido.setEstado(PedidoEstadoConfirmado.getInstance());
        return true;
    }

}
