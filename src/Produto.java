import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Produto {
    private String nome;
    private String marca;
    private String descricao;
    static Scanner in = new Scanner(System.in);

    public Produto(String nome, String marca, String descricao) {
        this.nome = nome;
        this.marca = marca;
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescricao() {
        return descricao;
    }

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/INTEL";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void criarTabela() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement()) {

            String createTableSQL = "CREATE TABLE IF NOT EXISTS processadores (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "descricao VARCHAR(100)," +
                    "marca VARCHAR(100)," +
                    "modelo VARCHAR(100)," +
                    "velocidade VARCHAR(100)" +
                    ")";

            stmt.executeUpdate(createTableSQL);
            System.out.println("Tabela 'processadores' criada com sucesso.");

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public static void inserirProcessador(Processador processador) {
        criarTabela();

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO processadores(nome, marca, descricao, modelo, velocidade) VALUES ( ?, ?, ?, ?, ?)")) {

            stmt.setString(1, processador.getNome());
            stmt.setString(2, processador.getMarca());
            stmt.setString(3, processador.getDescricao());
            stmt.setString(4, processador.getModelo());
            stmt.setString(5, processador.getVelocidade());

            stmt.executeUpdate();
            System.out.println("Processador inserido no banco de dados.");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir no banco de dados: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Exemplo de uso
        System.out.println("Digite o nome do processador:");
        String nomeProcessador = in.nextLine();
        System.out.println("Digite a marca do processador:");
        String marcaProcessador = in.nextLine();
        System.out.println("Digite a descricão do processador:");
        String descricaoProcessador = in.nextLine();
        System.out.println("Digite o modelo do processador:");
        String modeloProcessador = in.nextLine();
        System.out.println("Digite a frequência do processador:");
        String velocidadeProcessador = in.nextLine();
        Processador processador = new Processador(nomeProcessador, marcaProcessador, descricaoProcessador,
                modeloProcessador, velocidadeProcessador);
        // Chamar o método cadastrarProcessador da instância criada
        // processador.cadastrarProcessador();
        Processador.inserirProcessador(processador);

        in.close();
    }
}