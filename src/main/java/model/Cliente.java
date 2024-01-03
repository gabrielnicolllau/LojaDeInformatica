package model;

import java.util.Date;

/**
 *
 * @author caroline.csaldanha
 */
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
    
/**
 * Construtor Cliente vazio
 */
    public Cliente() {
    
    }
    
/**
 * Construtor Cliente com campos.
 * Cria uma instância inicializando os campos com os valores fornecidos.
 * @param idCliente - numero de identificação do cliente.
 * @param nome - nome do cliente.
 * @param email - email do cliente.
 * @param cpf - cpf do cliente.
 * @param dataNasc - data de nascimento do cliente.
 * @param sexo - gênero do cliente.
 * @param celular - número de celular do cliente.
 * @param telefone - número de telefone do cliente.
 * @param estadoCivil - estado civil do cliente.
 * @param cep - número do CEP do cliente.
 * @param endereço - endereço do cliente.
 * @param numero - numero da residência do cliente.
 * @param bairro - bairro do cliente.
 * @param cidade - cidade do cliente.
 * @param uf - estado do cliente.
 */
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
    
/**
 * Construtor Cliente sem o campo data de nascimento.
 * Cria uma instância inicializando os campos com os valores fornecidos.
 * @param idCliente - numero de identificação do cliente.
 * @param nome - nome do cliente.
 * @param email - email do cliente.
 * @param cpf - cpf do cliente.
 * @param sexo - gênero do cliente.
 * @param celular - número de celular do cliente.
 * @param telefone - número de telefone do cliente.
 * @param estadoCivil - estado civil do cliente.
 * @param cep - número do CEP do cliente.
 * @param endereço - endereço do cliente.
 * @param numero - numero da residência do cliente.
 * @param bairro - bairro do cliente.
 * @param cidade - cidade do cliente.
 * @param uf - estado do cliente.
 */
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
    
/**
 * Construtor Cliente sem o campo ID Cliente.
 * Cria uma instância inicializando os campos com os valores fornecidos.
 * @param nome - nome do cliente.
 * @param email - email do cliente.
 * @param cpf - cpf do cliente.
 * @param dataNasc - data de nascimento do cliente.
 * @param sexo - gênero do cliente.
 * @param celular - número de celular do cliente.
 * @param telefone - número de telefone do cliente.
 * @param estadoCivil - estado civil do cliente.
 * @param cep - número do CEP do cliente.
 * @param endereço - endereço do cliente.
 * @param numero - numero da residência do cliente.
 * @param bairro - bairro do cliente.
 * @param cidade - cidade do cliente.
 * @param uf - estado do cliente.
 */
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

/**
 * Construtor Cliente com os campos ID, nome e cpf do cliente.
 * Cria uma instância inicializando os campos com os valores fornecidos.
 * @param idCliente - ID do cliente.
 * @param nome - nome do cliente.
 * @param cpf - cpf do cliente.
 */    
    public Cliente(int idCliente, String nome, String cpf) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
    }
    
/**
 * Metódos getters e setters
 * Obtém o nome do cliente
 * @return nome - nome do cliente
 */
    public String getNome() {
        return nome;
    }

/**
 * Define o nome do cliente
 * @param nome - nome do cliente
 */
    public void setNome(String nome) {
        this.nome = nome;
    }

/**
 * Obtém o email do cliente
 * @return email - email do cliente
 */
    public String getEmail() {
        return email;
    }

/**
 * Define o email do cliente
 * @param email - email do cliente
 */
    public void setEmail(String email) {
        this.email = email;
    }

/**
 * Obtém o cpf do cliente
 * @return cpf - cpf do cliente
 */
    public String getCpf() {
        return cpf;
    }

/**
 * Define o cpf do cliente
 * @param cpf - cpf do cliente
 */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

/**
 * Obtém a data de nascimento do cliente
 * @return dataNasc - data de nascimento do cliente
 */
    public Date getDataNasc() {
        return dataNasc;
    }

/**
 * Define a data de nascimento do cliente
 * @param dataNasc - data de nascimento do cliente
 */
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

/**
 * Obtém o genêro do cliente
 * @return sexo - genêro do cliente
 */
    public String getSexo() {
        return sexo;
    }

/**
 *  Define o genêro do cliente
 * @param sexo - genêro do cliente
 */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

/**
 *  Obtém o número de celular do cliente
 * @return celular - celular do cliente
 */
    public String getCelular() {
        return celular;
    }

/**
 *  Define o número de celular do cliente
 * @param celular - celular do cliente
 */
    public void setCelular(String celular) {
        this.celular = celular;
    }

/**
 * Obtém o número de telefone do cliente
 * @return telefone - telefone do cliente
 */
    public String getTelefone() {
        return telefone;
    }

/**
 *  Define o número de telefone do cliente
 * @param telefone - telefone do cliente
 */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

/**
 * Obtém o estado civil do cliente
 * @return estadoCivil - estado civil do cliente
 */
    public String getEstadoCivil() {
        return estadoCivil;
    }

/**
 * Define o estado civil do cliente
 * @param estadoCivil - estado civil do cliente
 */    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

/**
 * Obtém o cep do cliente
 * @return cep - cep do cliente
 */    
    public String getCep() {
        return cep;
    }

/**
 * Define o cep do cliente
 * @param cep - cep do cliente
 */    
    public void setCep(String cep) {
        this.cep = cep;
    }

/**
 * Obtém o endereço do cliente
 * @return endereço - endereço do cliente
 */ 
    public String getEndereço() {
        return endereço;
    }

/**
 * Define o endereço do cliente
 * @param endereço - endereço do cliente
 */    
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

/**
 * Obtém o número da residência do cliente
 * @return numero - número da residência do cliente
 */    
    public String getNumero() {
        return numero;
    }

/**
 * Define o número da residência do cliente
 * @param numero - número da residência do cliente
 */
    public void setNumero(String numero) {
        this.numero = numero;
    }

/**
 * Obtém o bairro do cliente
 * @return bairro - bairro do cliente
 */    
    public String getBairro() {
        return bairro;
    }

/**
 * Define o bairro do cliente
 * @param bairro - bairro do cliente
 */    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

/**
 * Obtém a cidade do cliente
 * @return cidade - cidade do cliente
 */ 
    public String getCidade() {
        return cidade;
    }

/**
 * Define a cidade do cliente
 * @param cidade - cidade do cliente
 */     
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

/**
 * Obtém o estado do cliente
 * @return uf - estado do cliente
 */     
    public String getUf() {
        return uf;
    }

/**
 * Define o estado do cliente
 * @param uf - estado do cliente
 */    
    public void setUf(String uf) {
        this.uf = uf;
    }

/**
 * Obtém o ID do cliente
 * @return idCliente - ID do cliente
 */    
    public int getIdCliente() {
        return idCliente;
    }

/**
 * Define o ID do cliente
 * @param idCliente - ID do cliente
 */ 
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }    
    
}
