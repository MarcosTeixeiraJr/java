public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("123", "MARCOS");

        //defenemos o endereço
        marcos.setEndereco("RUA RECIFE");

        //e como definir o nome e o cpf

        //imprimindo o marcos sem o nome e o cpf
        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
