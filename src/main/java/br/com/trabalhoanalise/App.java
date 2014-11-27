package br.com.trabalhoanalise;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cache cache = Cache.getInstance();
        cache.setDados("dados recuperados");
        
        GerarRelatorio getRelatorio = GerarRelatorio.criaRelatorioDefault();
        System.out.println(getRelatorio.gerarRelatorio(cache.getDados()));
        
        getRelatorio.noFormato(new RelatorioXML());
        Cache outraTela = Cache.getInstance();
        outraTela.setDados("mais dados");
        System.out.println(getRelatorio.gerarRelatorio(outraTela.getDados()));
        
    }
}
