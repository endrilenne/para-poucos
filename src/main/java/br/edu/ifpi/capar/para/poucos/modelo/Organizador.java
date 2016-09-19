package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * 
 * @author Lucas Rafael
 * @author Endrilenne Véras
 */

public class Organizador {
    private int id;
    private int cpf;
    private int contato;
    private String nome;
    private String agencia;
    private String email;
    
    
    /**
     * 
     * @return retorna o id
     */
    public int getId() {
        return id;
    }
    /**
     * 
     * @param id insere o id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return retorna o cpf  
     */
    public int getCpf() {
        return cpf;
    }
    /**
     * 
     * @param cpf insere o cpf
     */

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    /**
     * 
     * @return retorna o contato
     */
    public int getContato() {
        return contato;
    }
    /**
     * 
     * @param contato insere o contato
     */
    public void setContato(int contato) {
        this.contato = contato;
    }
    /**
     * 
     * @return o nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @param nome insere o nome 
     */

    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * 
     * @return retorna a agência
     */
    public String getAgencia() {
        return agencia;
    }
    /**
     * 
     * @param agencia insere a agência
     */

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    /**
     * 
     * @return retorna o email
     */

    public String getEmail() {
        return email;
    }
    /**
     * 
     * @param email insere o email
     */

    public void setEmail(String email) {
        this.email = email;
    }
    
}

