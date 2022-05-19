package Chat;

public class Main {
    public static void main(String[] args){
        ChatMediator chat = new ChatMediatorImp();
        Usuario u1 = new UsuarioImp("Igor", chat);
        Usuario u2 = new UsuarioImp("Lima", chat);
        Usuario u3 = new UsuarioImp("Santana", chat);
        chat.addUsuario(u1);
        chat.addUsuario(u2);
        chat.addUsuario(u3);
        //-----//-----//
        u1.enviarMensagem("Bom dia!!!");
    }
}
