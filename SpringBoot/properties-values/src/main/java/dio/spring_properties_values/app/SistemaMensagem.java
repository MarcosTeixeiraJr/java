package dio.spring_properties_values.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {

    private final Remetente remetente;

    @Autowired
    public SistemaMensagem(Remetente remetente) {
        this.remetente = remetente;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + remetente.getNome() + "\nE-mail:" + remetente.getEmail() + "\nCom telefone para contato: "
                + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado");
    }
}


