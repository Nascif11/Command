package Padrao.Command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AtendenteTest {

    @Test
    void deveAbrirPedido() {

        Pedido pedido = new Pedido(1);

        Atendente atendente = new Atendente();

        atendente.executarTarefa(
                new AbrirPedidoTarefa(pedido)
        );

        assertEquals(
                "Pedido aberto",
                pedido.getSituacao()
        );
    }

    @Test
    void deveCancelarPedido() {

        Pedido pedido = new Pedido(1);

        Atendente atendente = new Atendente();

        atendente.executarTarefa(
                new CancelarPedidoTarefa(pedido)
        );

        assertEquals(
                "Pedido cancelado",
                pedido.getSituacao()
        );
    }

    @Test
    void deveDesfazerCancelamentoPedido() {

        Pedido pedido = new Pedido(1);

        Atendente atendente = new Atendente();

        atendente.executarTarefa(
                new CancelarPedidoTarefa(pedido)
        );

        atendente.cancelarUltimaTarefa();

        assertEquals(
                "Pedido aberto",
                pedido.getSituacao()
        );
    }
}
