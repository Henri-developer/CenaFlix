package br.com.dao;

/**
 * Gera exceções
 * @author Henrique
 */

public class ExceptionDAO extends Exception{
    
    /**
     * Gera uma menssgem de erro
     * @param mensagem 
     */
    public ExceptionDAO(String mensagem) {
        super(mensagem);
    }
}
