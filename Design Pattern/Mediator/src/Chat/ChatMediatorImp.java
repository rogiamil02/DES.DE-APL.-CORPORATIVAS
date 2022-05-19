package Chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImp implements ChatMediator {

    private final List<Usuario> usuarios;

    public ChatMediatorImp(){
        this.usuarios = new ArrayList<Usuario>();
    }


    @Override
    public void enviarMensagem(String mensagem, Usuario user){
        for (Usuario u : this.usuarios){
            if (u != user)
            u.receberMensagem(mensagem);
        }
    }
    @Override
    public void addUsuario(Usuario user){
        usuarios.add(user);
    }

}
