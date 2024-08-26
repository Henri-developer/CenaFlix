package br.com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 * Conexão com o banco de dados
 * @author Henrique
 */

public class Conexao {
    
    private Connection connection;
    
    private String url = "jdbc:mysql://localhost:3306/cenaflix";
    private String user = "root";
    private String password = "rick33411548";
    
    /**
     * Conectando com o banco de dados através do caminho passado 
     * @return connection
     */
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } 
        catch(ClassNotFoundException | SQLException e) {
            // Pode-ser deixar sem o JOptionPane por conta do JLabel na view que já faz o serviço de enviar uma mensagem ao usuário
        }
        return connection;
    }
}
