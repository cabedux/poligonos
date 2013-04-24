
public class Vertice {
	private double x;
	private double y;
	
	public Vertice(double d, double e) {
		this.x=d;
		this.y=e;
	}

	public void posicionarPunto(float x, float y){
		this.x=x;
		this.y=y;
	}
	
	public String devolverPunto(){
		return "x:"+x + "y:" +y;
	}
	
	public double x(){
		return x;
	}
	
	public double y(){
		return x;
	}
}
