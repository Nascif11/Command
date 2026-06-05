package Padrao.Command;

public class Pedido {

    private int numero;
    private String situacao;

    public Pedido(int numero) {
        this.numero = numero;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirPedido() {
        this.situacao = "Pedido aberto";
    }

    public void cancelarPedido() {
        this.situacao = "Pedido cancelado";
    }
}

