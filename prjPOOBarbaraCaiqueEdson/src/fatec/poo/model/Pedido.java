package fatec.poo.model;

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
    private String formaPagto;

    // Situação do Pedido:
    private String situacao;

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
    public String getFormaPagto() {
        return formaPagto;
    }

    /**
     * Método responsável por definir a FORMA DE PAGAMENTO do Pedido.
     *
     * @param formaPagto
     */
    public void setFormaPagto(String formaPagto) {
        this.formaPagto = formaPagto;
    }

    /**
     * Método responsável por retornar a SITUAÇÃO do Pedido.
     *
     * @return situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * Método responsável por definir a SITUAÇÃO do Pedido.
     *
     * @param situacao
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
