public class Revista extends Material {
    private int edicao;

    public Revista(String titulo, String publicacao, int edicao) {
        super(titulo, publicacao);
        this.edicao = edicao;
    }

    //@Override
    public void descricao() {
        System.out.println("Revista:");
        System.out.println("Título: " + titulo);
        System.out.println("Publicação: " + publicacao);
        System.out.println("Edição: " + edicao);
    }
}
