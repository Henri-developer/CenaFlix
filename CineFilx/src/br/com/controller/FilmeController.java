package br.com.controller;

import br.com.dao.ExceptionDAO;
import br.com.model.Filme;
import br.com.model.ListFilme;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Controladora das telas 
 * @author Henrique
 */

public class FilmeController {
    
    /** 
     * validando a inserção de filme
     * @param nome
     * @param dataLancamento
     * @param categoria
     * @return boolean
     * @throws ParseException
     * @throws ExceptionDAO 
     */
    public boolean validarDados(String nome, String dataLancamento, String categoria) throws ParseException, ExceptionDAO {
       
        if(!nome.isEmpty() && !dataLancamento.isEmpty() && !categoria.isEmpty()) {
            
            // Validando data de lançamento
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(dataLancamento);
            
            ListFilme listFilme = new ListFilme();
            listFilme.inserirFilmeModel(new Filme(nome, data, categoria));
            return true;
        }
        return false;
    }
    
    /**
     * Buscando filmes cadastrados por nome
     * @param nome
     * @return ListFilme().listarFilmeModel(nome);
     * @throws ExceptionDAO 
     */
    public ArrayList<Filme> listarFilmeController(String nome) throws ExceptionDAO {
        return new ListFilme().listarFilmeModel(nome);
    } 
    
    /**
     * Buscando filmes cadastrados por categoria 
     * @param categoria
     * @return ListFilme().listarFilmeCategoriaModel(categoria);
     * @throws ExceptionDAO 
     */
    public ArrayList<Filme> listarFilmeCategoriaController(String categoria) throws ExceptionDAO {
        return new ListFilme().listarFilmeCategoriaModel(categoria);
    }
    
    /**
     * Alterando filme 
     * @param id
     * @param nome
     * @param dataLancamento
     * @param categoria
     * @return boolean
     * @throws ExceptionDAO
     * @throws ParseException 
     */
    public boolean alterarFilmeController(int id, String nome, String dataLancamento, String categoria) throws ExceptionDAO, ParseException {
        if(!nome.isEmpty() && !dataLancamento.isEmpty() && !categoria.isEmpty()) {
            
            // Validando data de lançamento
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data = formato.parse(dataLancamento);
            
            ListFilme listFilme = new ListFilme();
            listFilme.alterarFilmeModel(new Filme(id, nome, data ,categoria));
            return true;
        }
        return false;
    }
    
    /**
     * Deletando filme 
     * @param id
     * @return boolean
     * @throws ExceptionDAO 
     */
    public boolean deletarFilmeController(int id) throws ExceptionDAO {
        if(id == 0) {
            return false;
        } 
        
        Filme filme = new Filme(id);
        
        ListFilme listFilme = new ListFilme();
        listFilme.deletarFilmeModel(filme);
        
        return true;
    }
}
