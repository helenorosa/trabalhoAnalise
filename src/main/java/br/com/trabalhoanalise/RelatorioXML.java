package br.com.trabalhoanalise;

/**
 *
 * @author Jeferson
 */
public class RelatorioXML implements Relatorio{

    public String gerarRelatorio(String dados) {
        return "gerando relatorio em xml com os dados : " + dados;
    }
    
}
