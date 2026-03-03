import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {
    
    public static void main(String[] args) {
        // Cria um objeto da sua classe de conexão
        Conexao fabricaDeConexao = new Conexao();
        
        System.out.println("Tentando conectar ao banco de dados...");
        
        try {
            // Tenta obter a conexão
            Connection conexaoAberta = fabricaDeConexao.obterConexao();
            
            System.out.println("🎉 DEU CERTO! Conexão com o MySQL estabelecida com sucesso!");
            
            // Como é só um teste, vamos fechar a conexão logo em seguida
            conexaoAberta.close();
            
        } catch (SQLException e) {
            System.out.println("❌ Ops! Algo deu errado na conexão.");
            e.printStackTrace(); // Isso imprime o erro exato no terminal
        }
    }
}
