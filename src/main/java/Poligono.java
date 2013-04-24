
public  class Poligono {
	ListaLados listalados;
	
	public Poligono(ListaLados lados){
		listalados=lados;
	}
	
	public int numLados(){
		return listalados.size();
	}
	
	public boolean esPoligono(){
		return listalados.size()<3;
	}
	
}
