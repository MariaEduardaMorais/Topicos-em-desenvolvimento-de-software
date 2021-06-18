package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FabricaDeConexoes {

    private static final String STR_CONEXAO = "jdbc:postgresql://200.18.128.54/aula";
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String USUARIO = "aula";
    private static final String SENHA = "aula";
    private static final String SCHEMA = "maria_rodrigues";

    private static Connection connection;

    public static Connection getConnection() throws Exception {
        if (connection == null || connection.isClosed()) {
            FabricaDeConexoes connect = new FabricaDeConexoes();
        }
        return connection;
    }

    public static void closeConnection(Connection con, PreparedStatement stat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private FabricaDeConexoes() {
        try {
            FabricaDeConexoes.connection = DriverManager.getConnection(STR_CONEXAO, USUARIO, SENHA);
            FabricaDeConexoes.connection.setSchema(SCHEMA);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Conexão não estabelecida\n" + ex.getMessage(),
                    "Erro na conexão com o SGBD", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void closeConnection() throws Exception {
        connection.close();
    }

}