public class Livro extends Material {
    private String autor;

    public Livro(String titulo, String publicacao, String autor) {
        super(titulo, publicacao);
        this.autor = autor;
    }

    //@Override
    public void descricao() {
        System.out.println("Livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Publicação: " + publicacao);
        System.out.println("Autor: " + autor);
    }
}
