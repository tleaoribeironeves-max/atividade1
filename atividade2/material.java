public abstract class Material {
    protected String titulo;
    protected String publicacao;

    public Material(String titulo, String publicacao) {
        this.titulo = titulo;
        this.publicacao = publicacao;
    }

    public abstract void descricao();
}
