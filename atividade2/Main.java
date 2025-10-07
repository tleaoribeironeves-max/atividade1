import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Ana Silva", "ana@email.com", "2023123");
        Funcionario f1 = new Funcionario("Carlos Souza", "carlos@email.com", "Bibliotecário");

        Livro l1 = new Livro("POO em Java", "2022", "João Pereira");
        Revista r1 = new Revista("Ciência Hoje", "2023", 58);

        Emprestimo e1 = new Emprestimo(LocalDate.now(), LocalDate.now().plusDays(7), u1, l1);
        Emprestimo e2 = new Emprestimo(LocalDate.now(), LocalDate.now().plusDays(15), f1, r1);

        e1.exibirDetalhes();
        e2.exibirDetalhes();
    }
}
