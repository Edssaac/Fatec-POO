/**
* Classe responsável por representar a conta corrente de um usuário.
* @author Edssaac
*/

package fatec.poo.model;

public class ContaCorrente 
{
    /**
    * Número da conta do usuário.
    */
    private int numero;
    
    /**
    * Saldo da conta do usuário.
    */
    private double saldo;
    
    
    /**
    * Método construtor da classe.
    * @param numero : int
    * @param saldo  : double
    */
    public ContaCorrente( int numero, double saldo )
    {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    
    /**
    * Método responsável por retornar o número da conta do usuário.
    * @return int
    */
    public int getNumero()
    {
        return this.numero;
    }
    
    /**
    * Método responsável por retornar o saldo da conta do usuário.
    * @return double
    */
    public double getSaldo()
    {
        return this.saldo;
    }
    
    
    /**
    * Método responsável por realizar a operação de saque.
    * @param valor : double
    */
    public void sacar( double valor )
    {
        this.saldo -= valor;
    }
    
    /**
    * Método responsável por realizar a operação de saque.
    * @param valor : double
    */
    public void depositar( double valor )
    {
        this.saldo += valor;
    }
    
}