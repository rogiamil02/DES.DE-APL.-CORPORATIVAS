package Chat;

public interface ChatMediator {


    public void enviarMensagem(String mensagem, Usuario user);

    public void addUsuario(Usuario user);
}
