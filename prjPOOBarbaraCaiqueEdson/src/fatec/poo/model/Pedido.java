package fatec.poo.model;

import java.util.ArrayList;

/**
 * Classe responsável por representar um Pedido.
 *
 * @author Barbára Aparecida
 * @author Caique Oliveira
 * @author Edson Isaac
 */
public class Pedido {

    // Número do Pedido:
    private String numero;

    // Data de Emissão do Pedido:
    private String dataEmissao;

    // Data de Pagamento do Pedido:
    private String dataPagto;

    // Forma de Pagamento do Pedido:
    private boolean formaPagto;

    // Situação do Pedido:
    private boolean situacao;

    // Cliente do Pedido:
    private Cliente cliente;

    // Vendedor do Pedido:
    private Vendedor vendedor;

    // Lista de Itens Pedidos:
    private ArrayList<ItemPedido> ItensPedidos = new ArrayList<>();

    /**
     * Método construtor da classe Pedido.
     *
     * @param numero
     * @param dataEmissao
     */
    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
    }

    /**
     * Método responsável por retornar o NUMERO do Pedido.
     *
     * @return numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Método responsável por definir o NUMERO do Pedido.
     *
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Método responsável por retornar a DATA DE EMISSÃO do Pedido.
     *
     * @return dataEmissao
     */
    public String getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Método responsável por definir a DATA DE EMISSÃO do Pedido.
     *
     * @param dataEmissao
     */
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * Método responsável por retornar a DATA DE PAGAMENTO do Pedido.
     *
     * @return dataPagto
     */
    public String getDataPagto() {
        return dataPagto;
    }

    /**
     * Método responsável por definir o DATA DE PAGAMENTO do Pedido.
     *
     * @param dataPagto
     */
    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    /**
     * Método responsável por retornar a FORMA DE PAGAMENTO do Pedido.
     *
     * @return formaPagto
     */
    public boolean getFormaPagto() {
        return formaPagto;
    }

    /**
     * Método responsável por definir a FORMA DE PAGAMENTO do Pedido.
     *
     * @param formaPagto
     */
    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    /**
     * Método responsável por retornar a SITUAÇÃO do Pedido.
     *
     * @return situacao
     */
    public boolean getSituacao() {
        return situacao;
    }

    /**
     * Método responsável por definir a SITUAÇÃO do Pedido.
     *
     * @param situacao
     */
    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    /**
     * Método responsável por retornar o CLIENTE do Pedido.
     *
     * @return cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Método responsável por definir o CLIENTE do Pedido.
     *
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Método responsável por retornar o VENDEDOR do Pedido.
     *
     * @return vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * Método responsável por definir o VENDEDOR do Pedido.
     *
     * @param vendedor
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * Método responsável por retornar a lista de itens do Pedido.
     *
     * @return situacao
     */
    public ArrayList<ItemPedido> getItensPedidos() {
        return ItensPedidos;
    }

    /**
     * Método responsável por adicionar um item na lista de Pedido.
     *
     * @param IP
     */
    public void addItemPedido(ItemPedido IP) {
        double limite;

        ItensPedidos.add(IP);
        limite = cliente.getLimiteDisp() - (IP.getProduto().getPreco() * IP.getQtdeVendida());
        cliente.setLimiteDisp(limite);
    }

}
