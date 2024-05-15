package main.set.operacoes_basicas;

public class Convidado {
    //atributo

    private final String nome;

    private final int codigoConvite;

    public Convidado (String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Object.hash(getCodigoConvite());
    }*/

    @Override
    public String toString(){
        return "Convidado{" +
            "nome='" + nome + '\'' +
            ", codigoConvite=" + codigoConvite +
            '}';
    }
}
