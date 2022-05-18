package fatec.poo.model;

/**
 * Classe responsável por representar um Item Pedido.
 *
 * @author Barbára Aparecida
 * @author Caique Oliveira
 * @author Edson Isaac
 */
public class ItemPedido {

    // Sequência do Item Pedido:
    public int sequencia;

    // Quantidade Vendida do Item Pedido:
    public double qtdeVendida;

    /**
     * Método construtor da classe ItemPedido.
     *
     * @param sequencia
     * @param qtdeVendida
     * @param produto
     */
    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
    }

    /**
     * Método responsável por retornar a SEQUENCIA do ItemPedido.
     *
     * @return sequencia
     */
    public int getSequencia() {
        return sequencia;
    }

    /**
     * Método responsável por definir a SEQUENCIA do ItemPedido.
     *
     * @param sequencia
     */
    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    /**
     * Método responsável por retornar a QUANTIADE VENDIDA do ItemPedido.
     *
     * @return qtdeVendida
     */
    public double getQtdeVendida() {
        return qtdeVendida;
    }

    /**
     * Método responsável por definir a QUANTIADE VENDIDA do ItemPedido.
     *
     * @param qtdeVendida
     */
    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

}
