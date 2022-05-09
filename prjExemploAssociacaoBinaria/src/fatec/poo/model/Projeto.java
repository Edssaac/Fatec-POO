package fatec.poo.model;

/**
 * @author Edssaac
 */
public class Projeto {

    private int codigo;

    private String descricao;

    private String dtInicio;

    private String dtTermino;

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public void setDtInicio(String data) {
        this.dtInicio = data;
    }

    public void setDtTermino(String data) {
        this.dtTermino = data;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getDtInicio() {
        return this.dtInicio;
    }

    public String getDtTermino() {
        return this.dtTermino;
    }

    public void listarFuncionarios() {
        System.out.println("\n----------------------------------------");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Data Inicio: " + this.getDtInicio());
        System.out.println("Data Término: " + this.getDtTermino());
        System.out.println("Quantiade de Funcionários: " + this.getDtTermino());
        System.out.println("----------------------------------------");
        System.out.println("Registro    -   Nome    -   Cargo   -   Departamento");
        System.out.println("----------------------------------------");
        /*for (int i = 0; i < this.numFunc; i++) {;;
            System.out.println(this.funcionarios[i].getRegistro() + "\t" + this.funcionarios[i].getNome() + "\t" + this.funcionarios[i].getCargo());
        }*/
        System.out.println("----------------------------------------");
    }

}
