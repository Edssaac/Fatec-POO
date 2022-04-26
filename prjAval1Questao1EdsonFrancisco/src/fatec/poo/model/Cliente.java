/**
 * Clase Cliente
 * @author Edson Isaac José Francico 0030482021020
 */

// Pacote da classe:
package fatec.poo.model;

// Classe Cliente:
public class Cliente {
    
    // Código do Cliente:
    private String codigo;
    
    // Número de Telefone do Cliente:
    private String numTel;
    
    // Limite de Crédito do Cliente:
    private double limCred;

    
    // Método construtor da classe Cliente:
    public Cliente(String codigo, String numTel) {
        this.codigo = codigo;
        this.numTel = numTel;
    }
    
    
    // Método responsável por retornar o código do cliente:
    public String getCodigo() {
        return this.codigo;
    }
    
    // Método responsável por retornar o número de telefone do cliente:
    public String getNumTel() {
        return this.numTel;
    }
    
    // Método responsável por definir o limite de crédito do cliente:
    public void setLimCred(double limite) {
        this.limCred = limite;
    }
    
    // Método responsável por retornar o limite de crédito do cliente:
    public double getLimCred() {
        return this.limCred;
    }
    
}
