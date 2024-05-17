package main.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributo: Mapa para armazenar os contatos, onde a chave é o nome e o valor é o telefone
    private final Map<String, Integer> agendaContatoMap;

    // Construtor: Inicializa o mapa de contatos
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    // Método para adicionar um contato ao mapa
    public void adicionarContato(String nome, Integer telefone) {
        // Adiciona ou atualiza o contato no mapa
        agendaContatoMap.put(nome, telefone);
    }

    // Método para remover um contato do mapa
    public void removerContato(String nome) {
        // Verifica se o contato existe no mapa antes de remover
        if (agendaContatoMap.containsKey(nome)) {
            agendaContatoMap.remove(nome);
        }
    }

    // Método para exibir todos os contatos
    public void exibirContatos() {
            System.out.println(agendaContatoMap);
        }
    

    // Método para pesquisar um contato pelo nome
    public Integer pesquisarPorNome(String nome) {
        // Retorna o telefone associado ao nome fornecido
        return agendaContatoMap.get(nome);
    }

    // Método principal para testar a classe AgendaContatos
    public static void main(String[] args) {
        // Cria uma instância de AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adiciona contatos ao mapa
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);  // Sobrescreve o número anterior de "Camila"
        agendaContatos.adicionarContato("Camila Souza", 1111111);
        agendaContatos.adicionarContato("Camila Dio", 987654);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Camila", 444444);  // Sobrescreve novamente o número de "Camila"

        // Exibe todos os contatos após as adições
       
        agendaContatos.exibirContatos();

        // Remove o contato "Maria Silva" do mapa
        agendaContatos.removerContato("Maria Silva");
        // Exibe todos os contatos após a remoção
       
        agendaContatos.exibirContatos();

        // Pesquisa e imprime o número de telefone associado ao nome "Camila Dio"
        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila Dio"));
    }
}

