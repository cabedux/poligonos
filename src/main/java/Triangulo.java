

public class Triangulo extends Poligono {

	public Triangulo(ListaLados nlados) {
		super(nlados);
	}
	
	public boolean esTriangulo(){
		return tieneTresLados() && tamanoLadosCorrecto();
	}

	public boolean tieneTresLados() {
		return listalados.size()==3;
	}

	public boolean tamanoLadosCorrecto() {
		Double a = listalados.dameLado(0);
		Double b = listalados.dameLado(1);
		Double c = listalados.dameLado(2);
		
		if((a<b+c) && (a>Math.abs(b-c)))
			return true;
		
		return false;
	}
	
	
}
