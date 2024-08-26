package br.com.model;

import java.util.Date;

/**
 * Objeto de filme
 * @author Henrique
 */

public class Filme {
    
    private int id;
    private String nome, categoria;
    private Date dataLancamento;

    /*
        Construtores
    */
    public Filme() {
    }

    public Filme(int id) {
        this.id = id;
    }
    
    public Filme(int id, String nome, Date dataLancamento, String categoria) {
        this.id = id;
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.categoria = categoria;
    }
    
    public Filme(String nome, Date dataLancamento, String categoria) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.categoria = categoria;
    }

    /*
        Gets e Sets
    */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
