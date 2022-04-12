/**
 * Classe Instrutor.
 * @author Edssaac.
 */

// Pacote da Classe:
package fatec.poo.model;

// Classe:
public class Instrutor extends Pessoa {
 
    // Identificação do Instrutor.
    private int identificacao;
    
    // Área de Atuação do Instrutor.
    private String areaAtuacao;

        
    /**
    * Instrutor()
    * Método construtor da classe.
    * @param identificacao : int
    * @param nome : String
    * @param telefone : String
    */
    public Instrutor(int identificacao, String nome, String telefone) {
        
        super(nome, telefone);
        this.identificacao = identificacao;
    }
    
    
    /**
    * setAreaAtuacao()
    * Método responsável por definir a área de atuação do Instrutor.
    * @param area : String
    */
    public void setAreaAtuacao(String area) {
        this.areaAtuacao = area;
    }
    
    
    /**
    * getIdentificacao()
    * Método responsável por retornar a indentificação do Instrutor.
    * @return int
    */
    public int getIdentificacao() {
        return this.identificacao;
    } 
    
    /**
    * getAreaAtuacao()
    * Método responsável por retornar a área de atuação do Instrutor.
    * @return String
    */
    public String getAreaAtuacao() {
        return this.areaAtuacao;
    }
    
}
