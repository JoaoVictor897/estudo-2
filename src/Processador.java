import java.io.PrintStream;
import java.util.Scanner;

public class Processador extends Produto {
    
    protected String nome;
    protected String Marca;
    protected String Descriçao;
    protected String Modelo;
    protected String Velocidade;

    public Processador(String nome, String marca, String descricao, String modeloProcessador,
            String velocidadeProcessador) {
                super(nome, marca, descricao);
                this.nome = nome;
                this.Marca = marca;
                this.Descriçao = descricao;
                this.Modelo = modeloProcessador;
                this.Velocidade = velocidadeProcessador;
    }

    Scanner in = new Scanner(System.in);
    PrintStream out = System.out;

    public void DadosProcessadores(Scanner in, PrintStream out) {
        System.out.println("Digite o nome do processador: ");
        nome = in.nextLine();
        System.out.println("Digite a marca do processador: ");
        Marca = in.nextLine();
        System.out.println("Digite a descrição do processador: ");
        Descriçao = in.nextLine();
        System.out.println("Digite o modelo do Processador: ");
        Modelo = in.nextLine();
        System.out.println("Digite a Velocidade do processador: ");
        Velocidade = in.nextLine();
    }

    public void cadastrarProcessador() {
        DadosProcessadores(in, out);
        // Cadastrar processador
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return Marca;
    }

    public String getDescricao() {
        return Descriçao;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getVelocidade() {
        return Velocidade;
    }

}
