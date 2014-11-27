package br.com.trabalhoanalise;

/**
 *
 * @author Jeferson
 */
public class Cache {

    private String dados;
    private Long dataCriacao;
    private static Cache instance;

    public static Cache getInstance() {

        if (instance == null) {
            instance = new Cache();
        }
        return instance;
    }

    private Cache() {
        this.dataCriacao = System.currentTimeMillis();
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados + ", data de criacao =" + this.dataCriacao;
    }

    public Long getDataCriacao() {
        return dataCriacao;
    }
}
