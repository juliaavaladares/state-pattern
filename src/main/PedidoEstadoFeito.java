package main;

public class PedidoEstadoFeito extends PedidoEstado {

    private PedidoEstadoFeito() {
    };

    private static PedidoEstadoFeito instance = new PedidoEstadoFeito();

    public static PedidoEstadoFeito getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Pedido Feito";
    }

    public boolean fazerPedido(Pedido pedido) {
        System.out.println("Pedido já foi feito!");
        return false;
    }

    public boolean pagarPedido(Pedido pedido) {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        return true;
    }

}
