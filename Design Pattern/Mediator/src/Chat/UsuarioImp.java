package Chat;

public class UsuarioImp extends Usuario{

    public UsuarioImp(String nome, ChatMediator mediator){
        super(nome, mediator);
    }
    @Override
    public void enviarMensagem(String mensagem){
        System.out.println(super.nome + "-Enviando mensagem:" + mensagem);
            super.mediator.enviarMensagem(mensagem, this);

    }

    @Override
    public void receberMensagem(String mensagem){
        System.out.println(super.nome +"-Recebendo mensagem: " + mensagem);
    }
}
