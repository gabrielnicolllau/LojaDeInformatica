package model;

import java.util.Date;


public class Cliente {
    private int idCliente;
    private String nome;
    private String email;
    private String cpf;
    private Date dataNasc;
    private String sexo;
    private String celular;
    private String telefone;
    private String estadoCivil;
    private String cep;
    private String endereço;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    
    //Contrutor
    
    public Cliente() {
    
}
    public Cliente(int idCliente, String nome, String email, String cpf, Date dataNasc, String sexo, String celular, String telefone, 
        String estadoCivil, String cep, String endereço, String numero, String bairro, String cidade, String uf){
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.celular = celular;
        this.telefone = telefone;
        this.estadoCivil = estadoCivil;
        this.cep = cep;
        this.endereço = endereço;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    public Cliente(int idCliente, String nome, String email, String cpf, String sexo, String celular, String telefone, 
        String estadoCivil, String cep, String endereço, String numero, String bairro, String cidade, String uf){
        this.idCliente = idCliente;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;        
        this.sexo = sexo;
        this.celular = celular;
        this.telefone = telefone;
        this.estadoCivil = estadoCivil;
        this.cep = cep;
        this.endereço = endereço;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    public Cliente(String nome, String email, String cpf, Date dataNasc, String sexo, String celular, String telefone, 
        String estadoCivil, String cep, String endereço, String numero, String bairro, String cidade, String uf){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.celular = celular;
        this.telefone = telefone;
        this.estadoCivil = estadoCivil;
        this.cep = cep;
        this.endereço = endereço;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
    
    
}
