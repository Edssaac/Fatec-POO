package fatec.poo.model;

import java.util.ArrayList;

/**
 * Classe responsável por representar um Cliente.
 *
 * @author Barbára Aparecida
 * @author Caique Oliveira
 * @author Edson Isaac
 */
public class Cliente extends Pessoa {

    // Limite do Crédito do Cliente:
    private double limiteCred;

    // Limite Disponível do Cliente:
    private double limiteDisp;

    // Pedidos do Cliente:
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    /**
     * Método construtor da classe Cliente.
     *
     * @param cpf
     * @param nome
     * @param limiteCred
     */
    Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
    }

    /**
     * Método responsável por retornar o LIMITE DE CRÉDITO do Cliente.
     *
     * @return limiteCred
     */
    public double getLimiteCred() {
        return limiteCred;
    }

    /**
     * Método responsável por definir o LIMITE DE CRÉDITO do Cliente.
     *
     * @param limiteCred
     */
    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    /**
     * Método responsável por retornar o LIMITE DISPONÍVEL do Cliente.
     *
     * @return limiteDisp
     */
    public double getLimiteDisp() {
        return limiteDisp;
    }

    /**
     * Método responsável por definir o LIMITE DISPONÍVEL do Cliente.
     *
     * @param limiteDisp
     */
    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }

    /**
     * Método responsável por adicionar um pedido na lista de pedidos do
     * Cliente.
     *
     * @param pedido
     */
    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedido.setCliente(this);
    }
    
}
