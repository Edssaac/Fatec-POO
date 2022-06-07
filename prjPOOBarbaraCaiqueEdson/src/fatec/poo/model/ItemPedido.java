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

    // Pedido do Item Pedido:
    private Pedido pedido;

    // Produto do Pedido:
    private Produto produto;

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
        this.produto = produto;
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

    /**
     * Método responsável por retornar o PEDIDO do ItemPedido.
     *
     * @return pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * Método responsável por definir o PEDIDO do ItemPedido.
     *
     * @param pedido
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * Método responsável por retornar o PRODUTO do ItemPedido.
     *
     * @return produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Método responsável por atualizar a quantidade em Estoque.
     */
    public void atualizaEstoque() {
        double quantidade;

        quantidade = this.produto.getQtdeEstoque() - this.qtdeVendida;
        this.setQtdeVendida(quantidade);
    }

}
