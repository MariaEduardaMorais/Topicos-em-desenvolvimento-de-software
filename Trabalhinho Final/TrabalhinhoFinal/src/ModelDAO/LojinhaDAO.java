/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import ConexaoBD.FabricaDeConexoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import View.TelaLojinha;
import View.TelaLojinha2;

public class LojinhaDAO {

    public void create(Dados d) throws Exception {
        Connection con = FabricaDeConexoes.getConnection();
        PreparedStatement stat = null;

        
         try {
            stat = con.prepareStatement("INSERT INTO cliente (codigo_de_cadastro, nome, telefone, endereço) VALUES (?,?,?,?)");
            stat.setInt(1, d.getcodigo_de_cadastro());
            stat.setString(2, d.getnome());
            stat.setInt(3, d.gettelefone());
            stat.setString(4, d.getendereço());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
           FabricaDeConexoes.closeConnection(con, stat);
        }
    }

          
    public void create(LojinhaDAO a) {
         //To change body of generated methods, choose Tools | Templates.
    }

    public void create(TelaLojinha d) {
         //To change body of generated methods, choose Tools | Templates.
    }

    public void create(TelaLojinha2 d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}