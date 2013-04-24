public class ListaLados {
	private Lado[] lados;

	public ListaLados(int i) {
		lados= new Lado[i];
	}

	public int size() {
		return lados.length;
	}

	public void setTamanoLados(Lado[] lados) {
		this.lados=lados;
	}

	public Double dameLado(int i) {
		if(lados[i]==null)
			return 0.0;
		return lados[i].size();
	}
}
