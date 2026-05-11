package test;

import mediator.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    public void deveEnviarMensagemParaOutrosUsuarios() {

        ChatMediator chat = new ChatSala();

        Usuario joao = new UsuarioConcreto(chat, "Joao");
        Usuario maria = new UsuarioConcreto(chat, "Maria");
        Usuario pedro = new UsuarioConcreto(chat, "Pedro");

        chat.adicionarUsuario(joao);
        chat.adicionarUsuario(maria);
        chat.adicionarUsuario(pedro);

        joao.enviar("Olá pessoal!");

        assertEquals("Olá pessoal!", maria.getUltimaMensagem());
        assertEquals("Olá pessoal!", pedro.getUltimaMensagem());
    }

    @Test
    public void remetenteNaoRecebePropriaMensagem() {

        ChatMediator chat = new ChatSala();

        Usuario joao = new UsuarioConcreto(chat, "Joao");
        Usuario maria = new UsuarioConcreto(chat, "Maria");

        chat.adicionarUsuario(joao);
        chat.adicionarUsuario(maria);

        joao.enviar("Teste");

        assertNull(joao.getUltimaMensagem());
    }
}