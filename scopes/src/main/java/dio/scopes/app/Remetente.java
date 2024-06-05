package dio.scopes.app;

import java.util.Objects;

public class Remetente {
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Remetente remetente = (Remetente) o;
        return Objects.equals(nome, remetente.nome) && Objects.equals(email, remetente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}

