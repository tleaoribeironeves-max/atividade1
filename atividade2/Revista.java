public class Revista extends Material{
    private Integer edicao;


    public Revista(String titulo, Integer anoPublicacao, int edicao2) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }


    public Integer getEdicao() {
        return this.edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    @Override
    public void descricao(){
        System.out.println("TituloR: " + this.getTitulo());
        System.out.println("Ano de publicacaoR: " + this.getAnoPublicacao());
        System.out.println("edicao: " + this.getEdicao());
    }


    
    
}
