public class Usuario extends Pessoa {
    private String matricula;

    public Usuario(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    //@Override
    public void exibirInfo() {
        System.out.println("Usuário:");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Matrícula: " + matricula);
    }
}
