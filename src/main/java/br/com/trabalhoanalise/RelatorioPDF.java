package br.com.trabalhoanalise;

/**
 *
 * @author Jeferson
 */
public class RelatorioPDF implements Relatorio{

    @Override
    public String gerarRelatorio(String dados) {
        return "gerando relatorio em pdf com os dados : " + dados;
    }

    
    
}
