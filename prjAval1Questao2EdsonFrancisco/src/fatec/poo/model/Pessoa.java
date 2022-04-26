/**
* Classe Pessoa
* @author Edson Isaac José Francisco 0030482021020
*/

// Pacote da classe:
package fatec.poo.model;

// Classe Pessoa:
public class Pessoa {
    
    // Código da Pessoa:
    private int codigo;
    
    // Nome da Pessoa:
    private String nome;

    // Método construtor da classe Pessoa:
    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    // Método responsável por retornar o código da pessoa:
    public int getCodigo() {
        return this.codigo;
    }
    
    // Método responsável por retornar o código da pessoa:
    public String getNome() {
        return this.nome;
    }
    
}
