/**
 * Classe Pessoa.
 * @author Edssaac.
 */

// Pacote da Classe:
package fatec.poo.model;

// Classe:
public class Pessoa {
    
    // Nome da Pessoa.
    private String nome;
    
    // Telefone da Pessoa.
    private String telefone;

    
    /**
    * Pessoa()
    * Método construtor da classe.
    * @param nome : String
    * @param telefone : String
    */
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    
    /**
    * getNome()
    * Método responsável por retornar o nome da Pessoa.
    * @return String
    */
    public String getNome() {
        return this.nome;
    }
    
    /**
    * getTelefone()
    * Método responsável por retornar o telefone da Pessoa.
    * @return String
    */
    public String getTelefone() {
        return this.telefone;
    }
   
}
