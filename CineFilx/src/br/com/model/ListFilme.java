package br.com.model;

import br.com.dao.ExceptionDAO;
import br.com.dao.FilmeDAO;
import java.util.ArrayList;

/**
 * Realiza a conversação com o banco de dados atrvés da classe FilmeDAO
 * @author Henrique
 */

public class ListFilme {

    /*
        Construtor
    */
    public ListFilme() {
    }
    
    /**
     * Inserindo filme
     * @param filme
     * @throws ExceptionDAO 
     */
    public void inserirFilmeModel(Filme filme) throws ExceptionDAO{
        new FilmeDAO().inserirFilmeDAO(filme);
    }
    
    /**
     * Buscando filmes cadastrados por nome
     * @param nome
     * @return FilmeDAO().listarFilmeDAO(nome);
     * @throws ExceptionDAO 
     */
    public ArrayList<Filme> listarFilmeModel(String nome) throws ExceptionDAO {
        return new FilmeDAO().listarFilmeDAO(nome);
    }
    
    /**
     * Buscando filmes cadastrados por categoria
     * @param categoria
     * @return FilmeDAO().listarFilmeCategoriaDAO(categoria);
     * @throws ExceptionDAO 
     */
    public ArrayList<Filme> listarFilmeCategoriaModel(String categoria) throws ExceptionDAO {
        return new FilmeDAO().listarFilmeCategoriaDAO(categoria);
    }
    
    /**
     * Alterando filme
     * @param filme
     * @throws ExceptionDAO 
     */
    public void alterarFilmeModel(Filme filme) throws ExceptionDAO {
        new FilmeDAO().alterarFilmeDAO(filme);
    }
    
    /**
     * Deletando filme
     * @param filme
     * @throws ExceptionDAO 
     */
    public void deletarFilmeModel(Filme filme) throws ExceptionDAO {
        new FilmeDAO().deletarFIlmeDAO(filme);
    }
}
