import static org.junit.Assert.*;

import org.junit.Test;



public class VerticeTest {
	
	@Test
	public void return_point_of_space() {
		Vertice vert = new Vertice(3.0,4.0);
		
		assertEquals(3.0, vert.x(),1);	
		
	}
}
