/**
 * Classe responsável por representar o funcionário comissionado.
 * @author aluno
 */

package fatec.poo.model;

public class FuncionarioComissionado extends Funcionario
{
    /**
    * Salário base do funcionário. 
    */
    private double salBase;
    
    /**
    * Taxa de comissão. 
    */
    private double taxaComissao;
    
    /**
    * Total de vendas do funcionário. 
    */
    private double totalVendas;
    
    /**
    * Método construtor da classe FuncionarioComissionado. 
    * @param registro       : int
    * @param nome           : String
    * @param dataAdmissao   : String
    * @param taxaComissao   : double
    */
    public FuncionarioComissionado(int registro, String nome, String dataAdmissao, double taxaComissao) 
    {
        super(registro, nome, dataAdmissao);
        this.taxaComissao = taxaComissao;
        this.totalVendas = 0;
    }
    
    /**
    * Método responsável por setar o salário base do funcionário. 
     * @param valor : double
    */
    public void setSalBase(double valor) 
    {
        this.salBase = valor;
    }
    
    /**
    * Método responsável por retornar o salário base do funcionário. 
     * @return valor : double
    */
    public double getSalBase() 
    {
        return this.salBase;
    }  
    
    /**
    * Método responsável por retornar o total de vendas do funcionário. 
     * @return valor : double
    */
    public double getTotalVendas() 
    {
        return this.totalVendas;
    } 
    
    /**
    * Método responsável por retornar a taxa de comissão do funcionário. 
     * @return valor : double
    */
    public double getTaxaComissao() 
    {
        return this.taxaComissao;
    } 
    
    /**
    * Método responsável por retornar o total de vendas do funcionário. 
     * @param valor : double
    */
    public void addVendas(double valor) 
    {
        this.totalVendas += valor;
    }
    

    @Override
    public double calcSalBruto() 
    {
        return (this.salBase + (this.taxaComissao/100) * this.totalVendas);
    }
    
    @Override
    public double calcSalLiquido() 
    {
        return (this.calcSalBruto() - this.calcDesconto() + this.calcGratificacao());
    }
    
    public double calcGratificacao() 
    {
        if ( this.totalVendas <= 5.000 )
            return ( 0 );
        
        if ( this.totalVendas <= 10.000 )
            return ( this.calcSalBruto() * 0.03 );
        
        return ( this.calcSalBruto() * 0.05 );
    }    
}
