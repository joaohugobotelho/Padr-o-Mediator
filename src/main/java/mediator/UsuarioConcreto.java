package mediator;

public class UsuarioConcreto  extends Usuario{
    public UsuarioConcreto(ChatMediator mediator, String nome) {
        super(mediator, nome);
    }
    @Override
    public void enviar(String mensagem){
        mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        this.ultimaMensagem = mensagem;
    }
}
