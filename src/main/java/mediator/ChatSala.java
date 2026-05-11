package mediator;

import java.util.ArrayList;
import java.util.List;
public class ChatSala implements ChatMediator{

    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    @Override
    public void enviarMensagem(String mensagem, Usuario usuario) {

        for (Usuario u : usuarios) {
            if( u != usuario) {
                u.receberMensagem(mensagem);
            }
        }
    }
}
