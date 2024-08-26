package br.com.dao;

import br.com.model.Filme;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * Realiza todas as manipulações de dados com uma conexão com o banco de dados 
 * @author Henrique
 */

public class FilmeDAO {
    
    PreparedStatement pStatement = null;
    Connection connection = null;
    ResultSet rs = null;
    
    /**
     * Inserindo filmes
     * @param filme 
     */
    public void inserirFilmeDAO(Filme filme) {
        String sql = "insert into filmes (nome, datalancamento, categoria) values (?, ?, ?)";
        
        try {
            connection = new Conexao().getConnection();
            pStatement = connection.prepareStatement(sql);
            
            pStatement.setString(1, filme.getNome());
            pStatement.setDate(2, new Date(filme.getDataLancamento().getTime()));
            pStatement.setString(3, filme.getCategoria());
            
            pStatement.executeUpdate();
        } 
        catch(SQLException e) {
            // Pode-ser deixar sem o JOptionPane por conta do JLabel na view que já faz o serviço de enviar uma mensagem ao usuário
        } finally {
            
            // Fechamento de conexão
            try {
                if(pStatement != null) {pStatement.close();}
                else if(connection != null) {connection.close();}
            } 
            catch(SQLException e) {
                // Pode-ser deixar sem o JOptionPane por conta do JLabel na view que já faz o serviço de enviar uma mensagem ao usuário
            }
        }
    }
    
    /**
     * Buscando filmes cadastrados por nome
     * @param nome
     * @return filmes
     */
    public ArrayList<Filme> listarFilmeDAO(String nome) {
        String sql = "select * from filmes where nome like '%" + nome + "%'"; 
        ArrayList<Filme> filmes = null;
        
        try {
            connection = new Conexao().getConnection();
            pStatement = connection.prepareStatement(sql);
            
            // Pega todos os dados do BD
            rs = pStatement.executeQuery(sql);
            
            if(rs != null) {
                filmes = new ArrayList<Filme>(); 
                
                // Enquanto houver um outro registro dentro do ResulSet, executa e quarda dentro de um ArrayList  
                while(rs.next()) {
                    Filme filme = new Filme();

                    filme.setId(rs.getInt("id"));
                    filme.setNome(rs.getString("nome"));
                    filme.setDataLancamento(rs.getDate("datalancamento"));
                    filme.setCategoria(rs.getString("categoria"));

                    filmes.add(filme);
                }
            }
        } 
        catch(SQLException e) {
            // Pode-ser deixar sem o JOptionPane por conta do JLabel na view que já faz o serviço de enviar uma mensagem ao usuário
        } finally {
            
            // Fechamento de conexão
            try {
                if(pStatement != null) {pStatement.close();}
                else if(connection != null) {connection.close();}
            } 
            catch(SQLException e) {
                // Pode-ser deixar sem o JOptionPane por conta do JLabel na view que já faz o serviço de enviar uma mensagem ao usuário
            }
        }
        return filmes;
    }
    
    /**
     * Buscando filmes cadastrados por categoria
     * @param categoria
     * @return filmes
     */
    public ArrayList<Filme> listarFilmeCategoriaDAO(String categoria) {
        String sql = "select * from filmes where categoria like '%" + categoria + "%'";
        
        ArrayList<Filme> filmes = null;
        
        try {
            connection = new Conexao().getConnection();
            pStatement = connection.prepareStatement(sql);
            
            // Pega todos os dados do BD
            rs = pStatement.executeQuery(sql);
            
            if(rs != null) {
                filmes = new ArrayList<Filme>();
                
                // Enquanto houver um outro registro dentro do ResulSet, executa e quarda dentro de um ArrayList
                while(rs.next()) {
                    Filme filme = new Filme();
                    
                    filme.setId(rs.getInt("id"));
                    filme.setNome(rs.getString("nome"));
                    filme.setDataLancamento(rs.getDate("datalancamento"));
                    filme.setCategoria(rs.getString("categoria"));
                    
                    filmes.add(filme);
                }
            }
        } 
        catch(SQLException e) {
            // Pode-ser deixar sem o JOptionPane por conta do JLabel na view que já faz o serviço de enviar uma mensagem ao usuário
        } finally {
            
            // Fechamento de conexão
            try {
                if(pStatement != null) {pStatement.close();}
                else if(connection != null) {connection.close();}
            } 
            catch(SQLException e) {
                // Pode-ser deixar sem o JOptionPane por conta do JLabel na view que já faz o serviço de enviar uma mensagem ao usuário
            }
        }
        return filmes;
    }
    
    /**
     * Alterando filme 
     * @param filme 
     */
    public void alterarFilmeDAO(Filme filme) {
        String sql = "update filmes set nome = ?, datalancamento = ?, categoria = ? where id = ?";
        
        try {
            connection = new Conexao().getConnection();
            pStatement = connection.prepareStatement(sql);
            
            pStatement.setString(1, filme.getNome());
            pStatement.setDate(2, new Date(filme.getDataLancamento().getTime()));
            pStatement.setString(3, filme.getCategoria());
            pStatement.setInt(4, filme.getId());
            pStatement.execute();
        } 
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } finally {
            
            // Fechamento de conexão
            try {
                if(pStatement != null) {pStatement.close();}
                else if(connection != null) {connection.close();}
            } 
            catch(SQLException e) {
                // Pode-ser deixar sem o JOptionPane por conta do JLabel na view que já faz o serviço de enviar uma mensagem ao usuário
            }
        }
    }
    
    /**
     * Deletando filme 
     * @param filme 
     */
    public void deletarFIlmeDAO(Filme filme) {
        String slq = "delete from filmes where id = ?";
        
        try {
            connection = new Conexao().getConnection();
            pStatement = connection.prepareStatement(slq);
            
            pStatement.setInt(1, filme.getId());
            pStatement.execute();
        } 
        catch(SQLException e) {
            // Pode-ser deixar sem o JOptionPane por conta do JLabel na view que já faz o serviço de enviar uma mensagem ao usuário
        } finally {
            
            // Fechamento de conexão
            try {
                if(pStatement != null) {pStatement.close();}
                else if(connection != null) {connection.close();}
            } 
            catch(SQLException e) {
                // Pode-ser deixar sem o JOptionPane por conta do JLabel na view que já faz o serviço de enviar uma mensagem ao usuário
            }
        }
    }
}
