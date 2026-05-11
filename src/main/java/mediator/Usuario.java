package mediator;

public abstract class Usuario {

    protected ChatMediator mediator;
    protected  String nome;
    protected String ultimaMensagem;

    public Usuario(ChatMediator mediator, String nome){
        this.mediator = mediator;
        this.nome = nome;
    }

    public abstract  void enviar(String mensagem);

    public abstract  void receberMensagem(String mensagem);

    public String getUltimaMensagem() {
        return  ultimaMensagem;
    }
}
