package fatec.poo.model;

/**
 * @author Edssaac
 */
public class FuncionarioHorista extends Funcionario {

    private double valHorTrab;
    private int qtdeHorTrab;

    public FuncionarioHorista(int registro,
            String nome,
            String dtAdmissao,
            double valHorTrab) {
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }

    @Override
    public double calcSalBruto() {
        return (valHorTrab * qtdeHorTrab);
    }

    public double calcGratificacao() {
        return (0.075 * calcSalBruto());
    }

    //Aplicação do polimorfismo
    @Override
    public double calcSalLiquido() {
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
