/**
* Classe Cliente
* @author Edson Isaac José Francisco 0030482021020
*/

package fatec.poo.model;

// Classe Cliente:
public class Cliente extends Pessoa {
    
    // Numéro da Mesa do Cliente:
    private int numMesa;
    
    // Total da Conta do Cliente:
    private double totalConta;

    
    // Método construtor da classe Cliente:
    public Cliente(int codigo, String nome, int numMesa) {
        super(codigo, nome);
        this.numMesa = numMesa;
        this.totalConta = 0;
    }
    
    
    // Método responsável por adicionar valor na comanda do cliente:
    public void addValorComanda(double valorComanda) {
        this.totalConta += valorComanda;
    }
    
    
    // Método responsável por retornar o número da mesa do cliente:
    public int getNumMesa() {
        return this.numMesa;
    }
    
    // Método responsável por retornar o total da conta do cliente:
    public double getTotalConta() {
        return this.totalConta;
    }
    
}
