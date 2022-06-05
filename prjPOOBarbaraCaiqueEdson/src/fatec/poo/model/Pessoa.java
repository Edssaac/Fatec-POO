package fatec.poo.model;

/**
 * Classe responsável por representar uma Pessoa.
 *
 * @author Barbára Aparecida
 * @author Caique Oliveira
 * @author Edson Isaac
 */
public class Pessoa {

    // CPF da Pessoa:
    private String cpf;

    // Nome da Pessoa:
    private String nome;

    // Endereco da Pessoa:
    private String endereco;

    // Cidade da Pessoa:
    private String cidade;

    // UF da Pessoa:
    private String uf;

    // CEP da Pessoa:
    private String cep;

    // DDD da Pessoa:
    private String ddd;

    // Telefone da Pessoa:
    private String telefone;

    /**
     * Método construtor da classe Pessoa.
     *
     * @param cpf
     * @param nome
     */
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    /**
     * Método responsável por retornar o CPF da Pessoa.
     *
     * @return cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Método responsável por definir o CPF da Pessoa.
     *
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Método responsável por retornar o NOME da Pessoa.
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método responsável por definir o NOME da Pessoa.
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método responsável por retornar o ENDERECO da Pessoa.
     *
     * @return endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Método responsável por definir o ENDERECO da Pessoa.
     *
     * @param endereco
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Método responsável por retornar a CIDADE da Pessoa.
     *
     * @return cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Método responsável por definir a CIDADE da Pessoa.
     *
     * @param cidade
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Método responsável por retornar o UF da Pessoa.
     *
     * @return uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * Método responsável por definir o UF da Pessoa.
     *
     * @param uf
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * Método responsável por retornar o CEP da Pessoa.
     *
     * @return cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * Método responsável por definir o CEP da Pessoa.
     *
     * @param cep
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Método responsável por retornar o DDD da Pessoa.
     *
     * @return ddd
     */
    public String getDdd() {
        return ddd;
    }

    /**
     * Método responsável por definir o DDD da Pessoa.
     *
     * @param ddd
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * Método responsável por retornar o TELEFONE da Pessoa.
     *
     * @return telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Método responsável por definir o TELEFONE da Pessoa.
     *
     * @param telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
