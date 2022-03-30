/**
 * Classe Funcionario.
 * @author Edssaac
 */

package fatec.poo.model;

public abstract class Funcionario 
{
    /***
     * Registro do funcionário. 
    */
    private int registro;
    
    /***
     * Nome do funcionário. 
    */
    private String nome;
    
    /***
     * Data de admissão do funcionário. 
    */
    private String dataAdmissao;

    /***
     * Cargo do funcionário. 
    */
    private String cargo;
    
    
    
    /**
     * Método construtor da classe.
     * @param registro      : int
     * @param nome          : String    
     * @param dataAdmissao  : String
    */
    public Funcionario(int registro, String nome, String dataAdmissao) 
    {
        this.registro = registro;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
    }
    
    
    
    public void setRegistro(int valor) 
    {
        this.registro = valor;
    }
    public int getRegistro() 
    {
        return this.registro;
    }
    
    public void setNome(String valor) 
    {
        this.nome = valor;
    }
    public String getNome() 
    {
        return this.nome;
    }
    
    public void setDataAdimissao(String valor) 
    {
        this.dataAdmissao = valor;
    }
    public String getDataAdimissao() 
    {
        return this.dataAdmissao;
    }
    
    public void setCargo(String valor) 
    {
        this.cargo = valor;
    }
    public String getCargo() 
    {
        return this.cargo;
    }
        
    
    
    /***
     * Método responsável por realizar o 
     * cálculo do desconto do funcionário. 
     * @return double
    */
    public double calcDesconto()
    {
        return (0.10 * calcSalBruto());
    }
    
    /***
     * Método abstrato responsável por realizar o 
     * cálculo do salário bruto do funcionário. 
     * @return double
    */
    public abstract double calcSalBruto();
       
    /***
     * Método responsável por realizar o 
     * cálculo do salário liquído do funcionário. 
     * @return double
    */
    public double calcSalLiquido()
    {
        return (calcSalBruto() - calcDesconto());
    }
    
}
