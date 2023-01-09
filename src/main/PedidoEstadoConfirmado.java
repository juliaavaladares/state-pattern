package main;

public class PedidoEstadoConfirmado extends PedidoEstado {

    private PedidoEstadoConfirmado() {
    };

    private static PedidoEstadoConfirmado instance = new PedidoEstadoConfirmado();

    public static PedidoEstadoConfirmado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido Confirmado";
    }

    public boolean enviarPedido(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        return true;
    }

}
