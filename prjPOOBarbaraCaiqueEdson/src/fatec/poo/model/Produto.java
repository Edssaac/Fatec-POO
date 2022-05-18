package fatec.poo.model;

/**
 * Classe responsável por representar um Pedido.
 *
 * @author Barbára Aparecida
 * @author Caique Oliveira
 * @author Edson Isaac
 */
public class Produto {

    // Código do Produto:
    private String codigo;

    // Descrição do Produto:
    private String descricao;

    // Quantidade em Estoque do Produto:
    private double qtdeEstoque;

    // Unidade Medidade do Produto:
    private String unidadeMedida;

    // Código do Produto:
    private double preco;

    // Código do Produto:
    private double estoqueMinimo;

    /**
     * Método construtor da classe Produto.
     *
     * @param codigo
     * @param descricao
     */
    public Produto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    /**
     * Método responsável por retornar o CÓDIGO do Produto.
     *
     * @return codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Método responsável por definir o CÓDIGO do Produto.
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Método responsável por retornar a DESCRIÇÃO do Produto.
     *
     * @return descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Método responsável por retornar a DESCRIÇÃO do Produto.
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Método responsável por retornar a QUANTIDADE EM ESTOQUE do Produto.
     *
     * @return qtdeEstoque
     */
    public double getQtdeEstoque() {
        return qtdeEstoque;
    }

    /**
     * Método responsável por definir a QUANTIDADE EM ESTOQUE do Produto.
     *
     * @param qtdeEstoque
     */
    public void setQtdeEstoque(double qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    /**
     * Método responsável por retornar a UNIDADE DE MEDIDA do Produto.
     *
     * @return unidadeMedida
     */
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * Método responsável por definir a UNIDADE DE MEDIDA do Produto.
     *
     * @param unidadeMedida
     */
    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    /**
     * Método responsável por retornar o PREÇO do Produto.
     *
     * @return preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Método responsável por definir o PREÇO do Produto.
     *
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Método responsável por retornar o ESTOQUE MINÍMO do Produto.
     *
     * @return estoqueMinimo
     */
    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }

    /**
     * Método responsável por definir o ESTOQUE MINÍMO do Produto.
     *
     * @param estoqueMinimo
     */
    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

}
