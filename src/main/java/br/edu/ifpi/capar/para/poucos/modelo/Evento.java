package br.edu.ifpi.capar.para.poucos.modelo;

import br.edu.ifpi.capar.para.poucos.generico.EntidadeGenerica;

/**Classe que faz especificação de evento
 * 
 * @author Denylson Melo
 * @author Lucas Fontenele
 * @author Lucas Rafael
 * @author Endrilenne Véras
 */
public class Evento extends EntidadeGenerica{

    private String nome;
    private String data;
    private int horario;
    private int idadeMinima;
    private int tipo;

    /**
     * @return retorna o nome  do evento
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome insere o nome do evento
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return a data do vento 
     */
    public String getData() {
        return data;
    }
    /**
     * @param data insere a data do evento 
     */

    public void setData(String data) {
        this.data = data;
    }
    /**
     * @return retorna o horário do evento 
     */
    
    public int getHorario() {
        return horario;
    }
    /**
     * @param horario insere o horário do evento
     */

    public void setHorario(int horario) {
        this.horario = horario;
    }
    /*
     * @return retorna a idade mínima para participar do evento
     */

    public int getIdadeMinima() {
        return idadeMinima;
    }
    /**
     * @param idadeMinima insere a idade mínima 
     */
    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }
    /*
     * @return retorna o tipo do evento
     */

    public int getTipo() {
        return tipo;
    }
    /** 
     * @param tipo insere o tipo do evento 
     */

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
