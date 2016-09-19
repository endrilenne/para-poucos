package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * 
 * @author Lucas Rafael
 * @author Endrilenne Véras
 */

public class Participante {
    private int id;
    private int cpf;
    private int rg;
    private int idade;
    private String nome;
    
    /**
     * @return retorna o id
     */
    public int getId() {
        return id;
    }

    /**
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
     * @return retorna o rg
     */

    public int getRg() {
        return rg;
    }
    /**
     * 
     * @param rg  insere o rg
     */

    public void setRg(int rg) {
        this.rg = rg;
    }
    /**
     * 
     * @return retorna a idade
     */

    public int getIdade() {
        return idade;
    }
    /**
     * 
     * @param idade insere a idade 
     */

    public void setIdade(int idade) {
        this.idade = idade;
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

   
}
