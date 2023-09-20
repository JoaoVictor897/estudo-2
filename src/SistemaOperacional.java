public class SistemaOperacional extends Produto {
    private String versao;

    public SistemaOperacional(String nome, String Marca, String descricao, String Modelo, String versao) {
        super(nome, Marca, descricao);
        this.versao = versao;
    }

    // Getters e setters
    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}