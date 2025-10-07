import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Pessoa pessoa;
    private Material material;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, Pessoa pessoa, Material material) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.pessoa = pessoa;
        this.material = material;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Empréstimo");
        System.out.println("Data de Empréstimo: " + dataEmprestimo);
        System.out.println("Data de Devolução: " + dataDevolucao);
        pessoa.exibirInfo();
        material.descricao();
    }
}
