/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Representa uma compra com um nome e CPF (Cadastro de Pessoas Físicas).
 * @author Gabriel
 */
public class Compra {

/**
    private String nome; O nome associado à compra
    private String cpf; O CPF  associado à compra.
     */
    
    private String nome;
    private String cpf;

   
    /**
     * Construtor padrão para uma compra vazia.
     */
    public Compra() {
        // Vazio
    }

    /**
     * Construtor para uma compra com nome e CPF especificados.
     *
     * @param nome O nome a ser associado à compra.
     * @param cpf  O CPF a ser associado à compra.
     */
    public Compra(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Obtém o nome associado à compra.
     *
     * @return O nome associado à compra.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome associado à compra.
     *
     * @param nome O nome a ser associado à compra.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF associado à compra.
     *
     * @return O CPF associado à compra.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF associado à compra.
     *
     * @param cpf O CPF a ser associado à compra.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
