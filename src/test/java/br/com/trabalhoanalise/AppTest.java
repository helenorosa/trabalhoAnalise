package br.com.trabalhoanalise;

import junit.framework.TestCase;


public class AppTest extends TestCase {
    
    public AppTest( String testName )
    {
        super( testName );
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testDataCriacaoDeveSerIgualParaTodaChamadaDaInstancia(){
        
        Cache cache = Cache.getInstance();
        long dataCriacaoInicial = cache.getDataCriacao();
        
        cache = Cache.getInstance();
        long dataCriacaoAposCriacaoInicial = cache.getDataCriacao();
        
        assertEquals(dataCriacaoAposCriacaoInicial, dataCriacaoInicial);
    }
    
    public void testCriacaoGerarRelatorioDefaultDeveriaRetornarGerarRelatorioEmPDF(){
        
        GerarRelatorio getRelatorio = GerarRelatorio.criaRelatorioDefault();
        
        assertTrue( getRelatorio.formato() instanceof RelatorioPDF );
    }
    
    public void testGerarRelatorioNoFormatoXMLDeveriaRetornarGerarRelatorioFormatoXML(){
        
        GerarRelatorio getRelatorio = GerarRelatorio
                .criaRelatorioDefault()
                .noFormato(new RelatorioXML());
        
        assertTrue( getRelatorio.formato() instanceof RelatorioXML );
    }
    
}
