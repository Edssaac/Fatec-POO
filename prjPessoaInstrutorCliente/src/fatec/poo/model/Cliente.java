/**
 * Classe Cliente.
 * @author Edssaac.
 */

// Pacote da Classe:
package fatec.poo.model;

// Classe:
public class Cliente extends Pessoa {
    
    // CPF do Cliente.
    private String cpf;
    
    // Peso do Cliente.
    private double peso;
    
    // Altura do Cliente.
    private double altura;

    
    /**
    * Cliente()
    * Método construtor da classe.
    * @param cpf : String
    * @param nome : String
    * @param telefone : String
    */
    public Cliente(String cpf, String nome, String telefone) {
        
        super(nome, telefone);
        this.cpf = cpf;
    }
    
    
    /**
    * setPeso()
    * Método responsável definir o peso do Cliente.
    * @param peso : double
    */
    public void setPeso(double peso) {
       this.peso = peso; 
    }
    
    /**
    * setAltura()
    * Método responsável definir a altura do Cliente.
    * @param altura : double
    */
    public void setAltura(double altura) {
       this.altura = altura; 
    }
    
    /**
    * getCpf()
    * Método responsável por retornar o cpf do Cliente.
    * @return double
    */
    public String getCpf() {
       return this.cpf;
    } 
    
    /**
    * getPeso()
    * Método responsável por retornar o peso do Cliente.
    * @return double
    */
    public double getPeso() {
       return this.peso;
    }
    
    /**
    * getAltura()
    * Método responsável por retornar a altura do Cliente.
    * @return double
    */
    public double getAltura() {
       return this.altura;
    }
        
}
