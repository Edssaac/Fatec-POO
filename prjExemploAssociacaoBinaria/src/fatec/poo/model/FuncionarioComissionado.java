package fatec.poo.model;

/**
 * @author Edssaac
 */
public class FuncionarioComissionado extends Funcionario {

    private double salBase;
    private double taxaComissao;//em porcentagem Exemplo: 5%
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, double taxaComissao) {
        super(registro, nome, dtAdmissao);//chamada do método construtor da superclasse
        this.taxaComissao = taxaComissao;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void addVendas(double vendas) {
        totalVendas += vendas;
    }

    //Aplicando polomorfismo
    public double calcSalBruto() {
        return salBase + (taxaComissao / 100 * totalVendas);
    }

    public double calcGratificacao() {
        if (totalVendas <= 5000) {
            return 0;
        } else if (totalVendas > 5000 && totalVendas <= 10000) {
            return calcSalBruto() * 0.03;
        } else {
            return calcSalBruto() * 0.05;
        }
    }

    //Aplicando polomorfismo
    public double calcSalLiquido() {
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
