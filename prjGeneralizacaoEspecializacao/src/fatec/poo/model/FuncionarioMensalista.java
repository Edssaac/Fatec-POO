/**
 * Classe FuncionarioMensalista.
 * @author Edssaac
 */

package fatec.poo.model;

public class FuncionarioMensalista extends Funcionario 
{
    /***
     * Valor do salário minímo. 
    */
    private double valorSalarioMinimo;
    
    /***
     * número de salários minímos. 
    */
    private double numeroSalarioMinimo;
    
    
    
    /***
     * Método construtor da classe principal. 
     * @param registro      : int
     * @param nome          : String    
     * @param dataAdmissao  : String
    */
    public FuncionarioMensalista(int registro, String nome, String dataAdmissao) 
    {
        super(registro, nome, dataAdmissao);
    }
   

    
    /***
     * Método responsável por definir o valor do salário minímo.
     * @param valor
    */
    public void setValorSalarioMinimo(double valor) 
    {
        this.valorSalarioMinimo = valor;
    }
    
    /***
     * Método responsável por retornar o valor do salário minímo.
     * @return int
    */
    public double getValorSalarioMinimo() 
    {
        return this.valorSalarioMinimo;
    }
    
    /***
     * Método responsável por definir o número de salários minímos.
     * @param valor
    */
    public void setNumeroSalarioMinimo(double valor) 
    {
        this.numeroSalarioMinimo = valor;
    }
    
    /***
     * Método responsável por retornar o número de salários minímos.
     * @return double
    */
    public double getNumeroSalarioMinimo() 
    {
        return this.numeroSalarioMinimo;
    }    

    
    
    /***
     * Método responsável por cálcular o salário bruto do funcionário. 
     * @return double
    */
    @Override
    public double calcSalBruto() 
    {
        return 0;
    }
    
}
