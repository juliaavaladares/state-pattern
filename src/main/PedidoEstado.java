package main;

public abstract class PedidoEstado {
    public abstract String getEstado();

    public boolean fazerPedido(Pedido produto) {
        return false;
    }

    public boolean pagarPedido(Pedido produto) {
        return false;
    }

    public boolean confirmarPedido(Pedido produto) {
        return false;
    }

    public boolean negarPedido(Pedido produto) {
        return false;
    }

    public boolean enviarPedido(Pedido produto) {
        return false;
    }

    public boolean confirmarEntregaPedido(Pedido produto) {
        return false;
    }
}
