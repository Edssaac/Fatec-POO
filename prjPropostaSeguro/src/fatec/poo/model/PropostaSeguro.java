package fatec.poo.model;

/**
 * @author Edssaac
 */
public class PropostaSeguro {

    private String nome;
    private double valorCarro;
    private double valorBase;
    private boolean sexo;   //F-false  M-true
    private int faixaIdade; //0-25 a 35, 1-acima de 35 anos
    private boolean perfilMotorista;
    private boolean perfilCidade;

    public PropostaSeguro(String nome, double valorCarro) {
        this.nome = nome;
        this.valorCarro = valorCarro;
        valorBase = 0.10 * this.valorCarro;
    }

    public PropostaSeguro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setFaixaIdade(int faixaIdade) {
        this.faixaIdade = faixaIdade;
    }

    public void setPerfilMotorista(boolean perfilMotorista) {
        this.perfilMotorista = perfilMotorista;
    }

    public void setPerfilCidade(boolean perfilCidade) {
        this.perfilCidade = perfilCidade;
    }

    public String getNome() {
        return nome;
    }

    public double calcDescSexo() {
        if (sexo == false) {    //feminino
            return (valorBase * 0.075);
        } else {    //masculino
            return (0);
        }
    }

    public double getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double calcDescIdade() {
        double desc = 0;

        if (faixaIdade == 0) {
            desc = 0.025 * valorBase;
        } else if (faixaIdade == 1) {
            desc = 0.037 * valorBase;
        }

        return (desc);
    }

    public double calcDescPerfilMotorista() {
        if (perfilMotorista) {
            return (0.015 * valorBase);
        } else {
            return (0);
        }
    }

    public double calcDescPerfilCidade() {
        if (perfilCidade) {
            return (0.018 * valorBase);
        } else {
            return (0);
        }
    }

    public double calcSeguro() {
        return (valorBase
                - calcDescSexo()
                - calcDescIdade()
                - calcDescPerfilMotorista()
                - calcDescPerfilCidade());
    }
}
