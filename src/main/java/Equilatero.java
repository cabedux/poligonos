
public class Equilatero extends Triangulo {

	public Equilatero(ListaLados nlados) {
		super(nlados);
	}

	public boolean esEquilatero() {
		Double a = listalados.dameLado(0);
		Double b = listalados.dameLado(1);
		Double c = listalados.dameLado(2);
		return a.equals(b) && b.equals(c);
	}

}
