import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class JDBCTest {
	// Nome do Driver (classe) e URL do banco
	private static final String JDBC_DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	
	private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1/facebook";

	// Credenciais
	static final String USER = "root";
	static final String PASSWORD = "";

	public static void main(String[] args) {
		selectExample();
		
		deleteExample();
		
		insertExample("Olá da Rosânia", 5);
		
		updateExample("E aí pessoal?", 5);
	}
	
	public static void selectExample(){
		Connection connection = null;
		Statement statement = null;
		
		try {
			// API JDBC < 3 e Java < 5
			Class.forName(JDBC_DRIVER_NAME);
			
			// Cria uma conexão com o Banco de Dados
			connection = DriverManager.getConnection(
					DATABASE_URL, USER, PASSWORD);
			
			// Cria um executador de instruções SQL
			statement = connection.createStatement();
			
			// Declara um instrução SQL
			String sqlQuery = "SELECT u.nome, p.content, "
					        + "p.post_date "
					        + "FROM users u "
					        + "INNER JOIN posts p "
					        + "ON u.id = p.user_id ";
			
			// Executa uma instrução (consulta) SQL
			// Como o resultado pode ter múltiplas linhas,
			// O resultado é um Conjunto (uma espécie de tabela)
			ResultSet rs = statement.executeQuery(sqlQuery);

			// next() vai para o próxima linha da tabela
			// Em cada linha podemos recuperar os valores das 
			// colunas, de acordo com seu nome e tipo
			while (rs.next()) {
				String userName = rs.getString("nome");
				String postContent = rs.getString("content");
				Date postDate = rs.getDate("post_date");

				System.out.printf("'%s' postou '%s' em '%tA, "
						+ "%<te de %<tB de %<tY' %n", 
						userName, postContent, postDate);
			}
			
			// Necessário fechar o ResultSet, o executador de 
			// instruções e a conexão com o Banco de Dados
			rs.close();
			statement.close();
			connection.close();
		} catch (SQLException sqlError) {
			// Erro na execução da SQL
			sqlError.printStackTrace();
		} catch (Exception generalError) {
			// Errors na carga do drive (Class.forName)
			generalError.printStackTrace();
		} finally {
			// Para fechar os recursos em caso de erros
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException sSqlError) {
				sSqlError.printStackTrace();
			}
			
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException cSqlError) {
				cSqlError.printStackTrace();
			} 
		}
	}

	private static void deleteExample() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			// Só é necessário do Java 5 para trás
			// E API JDBC < 3
			Class.forName(JDBC_DRIVER_NAME);

			// Cria uma conexão com o Banco de Dados
			connection = DriverManager.getConnection(
					DATABASE_URL, USER, PASSWORD);
			
			// Declara um instrução SQL com parâmetros
			// No caso, o id do usuário
			String sqlDelete = "DELETE FROM posts WHERE user_id = ?;";
			
			// Cria um executador de SQL parametrizável
			preparedStatement = connection.prepareStatement(sqlDelete);
			
			// Para o primeiro parâmetro (primeira interrogação)
			// da SQL, passa o valor 5
			preparedStatement.setInt(1, 5);
			
			// Executa a instrução SQL
			// executeUpdate deve ser usada quando formos alterar
			// a instância do Banco de Dados
			int rowsAffected =  preparedStatement.executeUpdate();
			
			System.out.printf("%d linha(s) afetada(s)!", rowsAffected);
			
			// Necessário fechar os recursos
			preparedStatement.close();
			connection.close();
		} catch (SQLException sqlError) {
			// Erro na execução da SQL
			sqlError.printStackTrace();
		} catch (Exception generalError) {
			// Errors na carga do drive (Class.forName)
			generalError.printStackTrace();
		} finally {
			// Para fechar os recursos em caso de erros
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException sSqlError) {
				sSqlError.printStackTrace();
			}
			
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException cSqlError) {
				cSqlError.printStackTrace();
			} 
		}		
	}

	private static void insertExample(String content, int userId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			// Só é necessário Java 5 para trás
			// E API JDBC < 3
			Class.forName(JDBC_DRIVER_NAME);

			// Cria uma conexão com o Banco de Dados
			connection = DriverManager.getConnection(
					DATABASE_URL, USER, PASSWORD);
			
			// Declara um instrução SQL com parâmetros
			// No caso, o conteúdo do post e o id do usuário
			String sqlInsert = "INSERT INTO posts VALUES "
					+ " (DEFAULT, ?, CURDATE(), ?);";
			
			// Cria um executador de SQL parametrizável
			preparedStatement = connection.prepareStatement(sqlInsert);
			
			// Para o primeiro parâmetro (primeira interrogação)
			// da SQL, passa o valor valor de content
			preparedStatement.setString(1, content);
			
			// Para o segundo parâmetro (segunda interrogação)
			// da SQL, passa o valor de userId
			preparedStatement.setInt(2, userId);
			
			// Executa a instrução SQL
			// executeUpdate deve ser usada quando formos alterar
			// a instância do Banco de Dados
			int rowsAffected =  preparedStatement.executeUpdate();
			
			System.out.printf("%d linha(s) afetada(s)!", rowsAffected);
			
			// Necessário fechar os recursos
			preparedStatement.close();
			connection.close();
		} catch (SQLException sqlError) {
			// Erro na execução da SQL
			sqlError.printStackTrace();
		} catch (Exception generalError) {
			// Errors na carga do drive (Class.forName)
			generalError.printStackTrace();
		} finally {
			// Para fechar os recursos em caso de erros
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException sSqlError) {
				sSqlError.printStackTrace();
			}
			
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException cSqlError) {
				cSqlError.printStackTrace();
			} 
		}		
	}
	
	private static void updateExample(String content, int userId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			// Só é necessário Java 5 para trás
			// E API JDBC < 3
			Class.forName(JDBC_DRIVER_NAME);

			connection = DriverManager.getConnection(
					DATABASE_URL, USER, PASSWORD);
			
			String sqlUpdate = "UPDATE posts "
					+ " SET content = ? "
					+ " WHERE user_id = ?;";
			
			preparedStatement = connection.prepareStatement(sqlUpdate);
			preparedStatement.setString(1, content);
			preparedStatement.setInt(2, userId);
			
			int rowsAffected =  preparedStatement.executeUpdate();
			
			System.out.printf("%d linha(s) afetada(s)!", rowsAffected);
			
			preparedStatement.close();
			connection.close();
		} catch (SQLException sqlError) {
			// Erro na execução da SQL
			sqlError.printStackTrace();
		} catch (Exception generalError) {
			// Errors na carga do drive (Class.forName)
			generalError.printStackTrace();
		} finally {
			// Para fechar os recursos em caso de erros
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException sSqlError) {
				sSqlError.printStackTrace();
			}
			
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException cSqlError) {
				cSqlError.printStackTrace();
			} 
		}		
	}
}