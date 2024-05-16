package main.set.pesquisa_contact;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private final Set<Contato> contatoSet;

    // Construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    // Método para adicionar um novo contato
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    // Método para exibir todos os contatos
    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    // Método para pesquisar contatos por nome
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    // Método para atualizar o número de um contato
    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);  
                contatoAtualizado = c;
                break; 
            }
        }
        return contatoAtualizado; 
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Souza", 111111);
        agendaContatos.adicionarContato("Camila Dio", 987654);
        agendaContatos.adicionarContato("Ana Silva", 111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Ana Silva", 555555));
    }
}




