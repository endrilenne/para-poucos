package br.edu.ifpi.capar.para.poucos.modelo;

/**
 * 
 * @author Lucas Rafael
 * @author Endrilenne Véras
 */

public class Inscricao {
    private int numero;
    private int codParticipante;

    /**
     * 
     * @return retorna o número da inscrição
     */
    public int getNumero() {
        return numero;
    }
    /**
     * 
     * @param numero insere o número da inscrição 
     */

    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * 
     * @return retorna o código do participante
     */
    public int getCodParticipante() {
        return codParticipante;
    }
    /**
     * 
     * @param codParticipante insere o código do participante
     */
    public void setCodParticipante(int codParticipante) {
        this.codParticipante = codParticipante;
    }
}
