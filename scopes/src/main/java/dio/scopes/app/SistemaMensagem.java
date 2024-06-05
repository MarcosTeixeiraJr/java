package dio.scopes.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro() {
        System.out.println("Nome do remetente: " + noreply.getNome());
        System.out.println("Email do remetente: " + noreply.getEmail());
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas() {
        techTeam.setEmail("tech@dio.com.br");
        System.out.println("Nome do remetente: " + techTeam.getNome());
        System.out.println("Email do remetente: " + techTeam.getEmail());
        System.out.println("Bem-vindo à Tech Elite");
    }

}

