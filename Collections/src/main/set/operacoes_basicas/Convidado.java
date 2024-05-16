package main.set.operacoes_basicas;

public class Convidado {
    // Atributos
    private final String nome;
    private final int codigoConvite;

    // Construtor
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    // Método para obter o nome do convidado
    public String getNome() {
        return nome;
    }

    // Método para obter o código de convite do convidado
    public int getCodigoConvite() {
        return codigoConvite;
    }

    // Sobrescrevendo o método equals para comparar convidados com base no código de convite
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    // Sobrescrevendo o método hashCode para calcular o hash com base no código de convite
    @Override
    public int hashCode() {
        return codigoConvite; // Retorna o código de convite como hash
    }

    // Sobrescrevendo o método toString para obter uma representação de string do objeto Convidado
    @Override
    public String toString() {
        return "Convidado{" +
            "nome='" + nome + '\'' +
            ", codigoConvite=" + codigoConvite +
            '}';
    }
}
