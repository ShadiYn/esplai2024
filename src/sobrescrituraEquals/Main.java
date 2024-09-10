package sobrescrituraEquals;

public class Main {

	public static void main(String[] args) {
		
		Deposito d1 = new Deposito(5,6,7,"Hola");
		Deposito d2 = new Deposito(5,6,7,"ola2");
		
		System.out.println(d1.getAlto()*d1.getAncho()*d1.getLargo());
		System.out.println(d2.getAlto()*d2.getAncho()*d2.getLargo());
		if(d1.equals(d2))
			System.out.println("exito1");
		if(d2.equals(d1)) 
			System.out.println("exito2");
		

	}

}
