package Padrao.Command;

public class AbrirPedidoTarefa implements Tarefa {

    private Pedido pedido;

    public AbrirPedidoTarefa(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        this.pedido.abrirPedido();
    }

    @Override
    public void cancelar() {
        this.pedido.cancelarPedido();
    }
}