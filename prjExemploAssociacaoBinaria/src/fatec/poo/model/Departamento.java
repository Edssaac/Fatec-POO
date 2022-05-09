package fatec.poo.model;

/**
 * @author Edssaac
 */
public class Departamento {

    private String sigla;
    private String nome;
    private Funcionario[] funcionarios;
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        this.numFunc = 0;
        this.funcionarios = new Funcionario[10];
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios[this.numFunc++] = funcionario;
    }

    public void listarFuncionarios() {

        System.out.println("\n----------------------------------------");
        System.out.println("Sigla: " + this.sigla);
        System.out.println("Nome: " + this.nome);
        System.out.println("----------------------------------------");
        System.out.println("Registro    -   Nome    -   Cargo");
        System.out.println("----------------------------------------");
        for (int i = 0; i < this.numFunc; i++) {
            System.out.println(this.funcionarios[i].getRegistro() + "\t" + this.funcionarios[i].getNome() + "\t" + this.funcionarios[i].getCargo());
        }
        System.out.println("----------------------------------------");
    }
}
