public class Computador extends Produto {
  private String tipo;

    public Computador(String nome, String descricao, String tipo) {
        super(nome, tipo, descricao);
        this.tipo = tipo;
    }

    // Getters e setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
