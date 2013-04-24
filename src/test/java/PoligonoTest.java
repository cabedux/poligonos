import static org.junit.Assert.*;

import org.junit.Test;


public class PoligonoTest {

	@Test
	public void test() {
		ListaLados l = new ListaLados(5);
		Poligono p = new Poligono(l);
		
		assertEquals(5, p.numLados());
	}

}
