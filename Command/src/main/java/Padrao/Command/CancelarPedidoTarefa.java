package Padrao.Command;

public class CancelarPedidoTarefa implements Tarefa {

    private Pedido pedido;

    public CancelarPedidoTarefa(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executar() {
        this.pedido.cancelarPedido();
    }

    @Override
    public void cancelar() {
        this.pedido.abrirPedido();
    }
}
