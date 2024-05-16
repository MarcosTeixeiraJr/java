package main.set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // Atributo para armazenar o conjunto de convidados
    private final Set<Convidado> convidadoSet;

    // Construtor para inicializar o conjunto de convidados como um HashSet vazio
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    // Método para adicionar um novo convidado ao conjunto
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    // Método para remover um convidado com base no código de convite
    public void removerCovidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        // Procura pelo convidado com o código de convite especificado
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break; // Uma vez que o convidado é encontrado, não é necessário continuar iterando
            }
        }
        // Remove o convidado do conjunto
        convidadoSet.remove(convidadoParaRemover);
    }

    // Método para contar quantos convidados estão presentes no conjunto
    public int contarConvidados() {
        return convidadoSet.size();
    }

    // Método para exibir os convidados presentes no conjunto
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    // Método main para testar a funcionalidade da classe
    public static void main(String[] args) {
        // Cria uma instância da classe ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        // Exibe quantos convidados estão presentes no conjunto (deve ser 0 inicialmente)
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        // Adiciona alguns convidados ao conjunto
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235); // Esse código de convite já existe
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1237);

        // Exibe quantos convidados estão presentes no conjunto após a adição
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        // Remove um convidado do conjunto com base no código de convite
        conjuntoConvidados.removerCovidadoPorCodigoConvite(1234);
        // Exibe quantos convidados estão presentes no conjunto após a remoção
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        // Exibe os convidados presentes no conjunto
        conjuntoConvidados.exibirConvidados();
    }
}
