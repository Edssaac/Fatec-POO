package fatec.poo.model;

/**
 * Classe responsável por representar um Vendedor.
 *
 * @author Barbára Aparecida
 * @author Caique Oliveira
 * @author Edson Isaac
 */
public class Vendedor extends Pessoa {

    // Salário Base do Vendedor:
    private double salarioBase;

    // Taxa de Comissão (%) do Vendedor:
    private double taxaComissao;

    /**
     * Método construtor da classe Vendedor.
     *
     * @param cpf
     * @param nome
     * @param salarioBase
     */
    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
    }

    /**
     * Método responsável por retornar o SALÁRIO BASE do Vendedor.
     *
     * @return salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Método responsável por definir o SALÁRIO BASE do Vendedor.
     *
     * @param salarioBase
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Método responsável por retornar a TAXA DE COMISSÃO do Vendedor.
     *
     * @return taxaComissao
     */
    public double getTaxaComissao() {
        return taxaComissao;
    }

    /**
     * Método responsável por definir a TAXA DE COMISSÃO (em %) do Vendedor.
     *
     * @param taxaComissao
     */
    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

}
