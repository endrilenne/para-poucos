package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * 
 * @author Lucas Rafael
 * @author Endrilenne Véras
 */

public class Tema {
    private int id;
    private String nome;
    private String descricao;
    
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
     * @return retorna o nome
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
     * @return retorna a descrição
     */

    public String getDescricao() {
        return descricao;
    }
    /**
     * 
     * @param descricao insere a descrição
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
