package sobrescrituraEquals;

public class Deposito {
	
	String Nombre;
	int  alto;
	int  ancho;
	int largo;
	
	public Deposito(int alto, int ancho, int largo, String Nombre) {
		this.alto=alto;
		this.ancho=ancho;
		this.largo = largo;
		this.Nombre = Nombre;
	}
	
	
	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getLargo() {
		return largo;
	}


	public void setLargo(int largo) {
		this.largo = largo;
	}


	@Override public boolean equals(Object o){
		if(!(o instanceof Deposito)) return false;
		Deposito other = (Deposito) o;
		
		if(Double.doubleToLongBits(alto*ancho*largo) != Double.doubleToLongBits(other.alto*other.ancho*other.largo))
				return false;
		
		return true;
		
	}

}
