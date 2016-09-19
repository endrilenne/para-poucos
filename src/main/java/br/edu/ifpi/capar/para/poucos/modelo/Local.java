package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * 
 * @author Lucas Rafael
 * @author Endrilenne Véras
 */

public class Local {
    private int id;
    private String nome;
    private int capacidade;
    private String cidade;
    private String estado;
    private String rua;
    private int numero;
    /**
     * 
     * @return retorna o id do local 
     */
    public int getId() {
        return id;
    }
    /** 
     * 
     * @param id insere id do local 
     */

    public void setId(int id) {
        this.id = id;
    }
    /**
     * 
     * @return retorna o nome do local
     */
    public String getNome() {
        return nome;
    }
    /**
     * 
     * @param nome insere nome do local
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * 
     * @return retorna a capacidade do local
     */

    public int getCapacidade() {
        return capacidade;
    }
    /**
     * 
     * @param capacidade insere a capacidade do local
     */

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    /**
     * 
     * @return retorna a cidade que vai ser o evento
     */

    public String getCidade() {
        return cidade;
    }
    /**
     * 
     * @param cidade insere a cidade
     */

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    /**
     * 
     * @return retorna o estado 
     */

    public String getEstado() {
        return estado;
    }
    /**
     * 
     * @param estado insere o estado
     */

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * 
     * @return retorna a rua
     */

    public String getRua() {
        return rua;
    }
    /**
     * 
     * @param rua insere a rua
     */
    public void setRua(String rua) {
        this.rua = rua;
    }
    /**
     * 
     * @return retorna o número
     */
    public int getNumero() {
        return numero;
    }
    /**
     * 
     * @param numero insere o número 
     */

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
