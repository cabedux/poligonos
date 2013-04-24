import static org.junit.Assert.*;

import org.junit.Test;


public class EquilateroTest {
	ListaLados ll;
	@Test
	public void es_Un_Triangulo() {
		ll =new ListaLados(3);
		Lado a= new Lado(4.0);
		Lado b= new Lado(5.0);
		Lado c= new Lado(3.0);
		
		Lado[] lados ={a,b,c};
		
		ll.setTamanoLados(lados);
		Equilatero e = new Equilatero(ll);
		
		assertTrue(e.esTriangulo());
	}
	
	@Test
	public void es_Un_Equilatero() {
		ll =new ListaLados(3);
		Lado a= new Lado(4.0);
		Lado b= new Lado(4.0);
		Lado c= new Lado(4.0);
		
		Lado[] lados ={a,b,c};
		
		ll.setTamanoLados(lados);
		Equilatero e = new Equilatero(ll);
		
		assertTrue(e.esEquilatero());
	}


}
