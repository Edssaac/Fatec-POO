/**
* Classe Garcom
* @author Edson Isaac José Francisco 0030482021020
*/

package fatec.poo.model;

// Classe Garcom:
public class Garcom extends Pessoa{
    
    // Salário Base do Garcom:
    private double salBase;
    
    // Taxa de Serviço do Garcom:
    private double taxaServico;
    
    // Total de Gorjeta do Garcom:
    private double totalGorjeta;

    
    // Método construtor da classe Garcom:
    public Garcom(int codigo, String nome, double taxaServico) {
        super(codigo, nome);
        this.taxaServico = taxaServico;
        this.totalGorjeta = 0;
    }

    
    // Método responsável por setar o salário base do garcom:
    public void setSalBase(double salario) {
        this.salBase = salario;
    }
    
    // Método responsável por retornar o salário base do garcom:
    public double getSalBase() {
        return this.salBase;
    }
    
    // Método responsável por retornar a taxa de serviço do garcom:
    public double getTaxaServico() {
        return this.taxaServico;
    }
       
    // Método responsável por retornar o total de gorjeta do garcom:
    public double getTotalGorjeta() {
        return this.totalGorjeta;
    }
    
    
    // Método responsável por adicionar gorjeta para o garcom:
    public void addGorjeta(double valorConta) {
        this.totalGorjeta += ( (this.getTaxaServico() / 100) * valorConta );
    }
    
    // Método responsável por retornar o salário final do garcom:
    public double calcSalarioFinal() {
        return (this.getSalBase() + this.getTotalGorjeta());
    }
    
}
