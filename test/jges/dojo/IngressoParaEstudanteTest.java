package jges.dojo;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class IngressoParaEstudanteTest {
    
    private Estudante estudante;
    
    public IngressoParaEstudanteTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        estudante = new Estudante();
    }
    
    @After
    public void tearDown() {
        estudante = null;
    }
   
    
    
    //Dado que é segunda-feira
    //Quando um estudante compra um ingresso
    //Então ele tem direito a 10% de desconto
    @Test
    public void deveDarDescontoDe10PorcentoNaSegundaFeira()
    {
        Teatro teatro = new Teatro();
        
        assertEquals(7.2,
                     teatro.ingressoPara(estudante).na(Calendar.MONDAY),   
                     0.001);
    }
    

    //Dado que é terça-feira
    //Quando um estudante compra um ingresso
    //Então ele tem direito a 5% de desconto
    @Test
    public void deveDarDescontoDe5PorcentoNaTercaFeira()
    {
        Teatro teatro = new Teatro();
        
        assertEquals(7.6,
                     teatro.ingressoPara(estudante).na(Calendar.TUESDAY),   
                     0.001);
    }
    
    
    //Dado que é quarta-feira
    //Quando um estudante compra um ingresso
    //Então ele tem direito a 50% de desconto
    @Test
    public void deveDarDescontoDe50PorcentoNaQuartaFeira()
    {
        Teatro teatro = new Teatro();
        
        assertEquals(4,
                     teatro.ingressoPara(estudante).na(Calendar.WEDNESDAY),   
                     0.001);
    }

    
    //Dado que é quinta-feira
    //Quando um estudante compra um ingresso
    //Então ele tem direito a 30% de desconto
    @Test
    public void deveDarDescontoDe30PorcentoNaQuintaFeira()
    {
        Teatro teatro = new Teatro();
        
        assertEquals(5.6,
                     teatro.ingressoPara(estudante).na(Calendar.THURSDAY),   
                     0.001);
    }

    
    //Dado que é sexta-feira, sábado ou domingo
    //Quando um estudante compra um ingresso
    //Então ele não tem direito desconto
    @Test
    public void devePagarValorCheioNaSextaSabadoEDomingo()
    {
        Teatro teatro = new Teatro();
        
        assertEquals(8,
                     teatro.ingressoPara(estudante).na(Calendar.FRIDAY),   
                     0.001);
        assertEquals(8,
                     teatro.ingressoPara(estudante).no(Calendar.SATURDAY),   
                     0.001);
        assertEquals(8,
                     teatro.ingressoPara(estudante).no(Calendar.SUNDAY),   
                     0.001);
    }

}
