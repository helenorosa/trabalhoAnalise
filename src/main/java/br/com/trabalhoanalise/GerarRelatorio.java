package br.com.trabalhoanalise;

/**
 *
 * @author Jeferson
 */
public class GerarRelatorio {
    
    private Relatorio relatorio;
    
    public static GerarRelatorio criaRelatorioDefault(){
        return new GerarRelatorio().noFormato(new RelatorioPDF());
    }
    
    private GerarRelatorio(){}
    
    public String gerarRelatorio(String dados){
        
        return relatorio.gerarRelatorio(dados);
    }

    public GerarRelatorio noFormato(Relatorio relatorio) {
        this.relatorio = relatorio;
        return this;
    }

    public Relatorio formato() {
        return relatorio;
    }
}
