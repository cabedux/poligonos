import static org.junit.Assert.*;

import org.junit.Test;


public class trianguloTest {
	ListaLados ll;
	Triangulo p;
	
	@Test
	public void si_tiene_3_lados_es_un_triangulo() {
		ll =new ListaLados(3);
		p = new Triangulo(ll);
		assertTrue(p.tieneTresLados());
	}
	
	@Test
	public void si_no_tiene_3_lados_no_es_un_triangulo() {
		ll =new ListaLados(999);
		p = new Triangulo(ll);
		
		assertFalse(p.tieneTresLados());
	}
	
	@Test
	public void tamanoLadosCorrecto() {
		ll =new ListaLados(3);
		Lado a= new Lado(4.0);
		Lado b= new Lado(5.0);
		Lado c= new Lado(3.0);
		
		Lado[] lados ={a,b,c};
		
		ll.setTamanoLados(lados);
		p= new Triangulo(ll);
		
		assertTrue(p.tamanoLadosCorrecto());
	}
}
