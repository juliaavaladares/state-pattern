package main;

import java.util.ArrayList;

public class Pedido {
    private String idPedido;
    private PedidoEstado estado;
    private ArrayList<Produto> produtos;

    public Pedido(String idPedido, ArrayList<Produto> produtos) {
        this.idPedido = idPedido;
        this.produtos = produtos;
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public PedidoEstado getEstado() {
        return estado;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public boolean fazerPedido() {
        return estado.fazerPedido(this);
    }

    public boolean pagarPedido() {
        return estado.pagarPedido(this);
    }

    public boolean confirmarPedido() {
        return estado.confirmarPedido(this);
    }

    public boolean negarPedido() {
        return estado.negarPedido(this);
    }

    public boolean enviarPedido() {
        return estado.enviarPedido(this);
    }

    public boolean confirmarEntregaPedido() {
        return estado.confirmarEntregaPedido(this);
    }

}