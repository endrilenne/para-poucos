package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * 
 * @author Lucas Rafael
 * @author Endrilenne Véras
 */


public class Contratante {
    private int id;
    private int cpf;
    private String nome;
    private String endereco;
    
    /** 
     * @return cpf da classe contratante
     */

    public int getCpf() {
        return cpf;
    }
    /**
     * @param cpf insere cpf do contratante  
     */

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    /**
     * 
     * @return nome do contratante
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @param nome insere o contratante 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
    * 
    * @return o endereço do contratante
    */
    public String getEndereco() {
        return endereco;
    }
    /**
     * 
     * @param endereco insere o endereço
     */

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /**
     * 
     * @return o id do contratante 
     */
    
    public int getId() {
        return id;
    }
    
    /**
     * 
     * @param id insere id do contratante
     */
    public void setId(int id) {
        this.id = id;
    }
}
