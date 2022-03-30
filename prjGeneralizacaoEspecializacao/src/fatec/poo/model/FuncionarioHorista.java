/**
 * Classe FuncionarioMensalista.
 * @author Edssaac
 */

package fatec.poo.model;

public class FuncionarioHorista extends Funcionario 
{
    /***
     * Valor da hora trabalhada. 
    */
    private int valHora;
    
    /***
     * Quantidade de horas trabalhadas.
    */
    private double qtdHorasTrabalhadas;
    
    
    
    /***
     * Método construtor da classe principal. 
     * @param registro      : int
     * @param nome          : String    
     * @param dataAdmissao  : String
    */
    public FuncionarioHorista(int registro, String nome, String dataAdmissao) 
    {
        super(registro, nome, dataAdmissao);
    }
    
    
    
    /***
     * Método responsável por definir o valor da hora trabalhada.
     * @param valor
    */
    public void setValHora(int valor) 
    {
        this.valHora = valor;
    }
    
    /***
     * Método responsável por retornar o valor da hora trabalhada.
     * @return int
    */
    public int getValHora() 
    {
        return this.valHora;
    }
    
    /***
     * Método responsável por definir a quatidade de horas trabalhadas.
     * @param valor
    */
    public void setQtdHoraTrabalhada(double valor) 
    {
        this.qtdHorasTrabalhadas = valor;
    }
    
    /***
     * Método responsável por retornar a quatidade de horas trabalhadas.
     * @return double
    */
    public double getQtdHoraTrabalhada() 
    {
        return this.qtdHorasTrabalhadas;
    }
    
    
    
    /***
     * Método responsável por cálcular o salário bruto do funcionário. 
     * @return double
    */
    @Override
    public double calcSalBruto() 
    {
        return (this.valHora * this.qtdHorasTrabalhadas);
    }
    
    /***
     * Método responsável por realizar o 
     * cálculo da gratificação do funcionário. 
     * @return double
    */
    public double calcGratificacao()
    {
        return (0.07 * calcSalBruto());
    }
    
    /***
     * Método responsável por realizar o 
     * cálculo do salário liquído do funcionário. 
     * @return double
    */
    @Override
    public double calcSalLiquido()
    {
        return (calcSalBruto() + calcGratificacao() - calcDesconto());
    }
    
}
