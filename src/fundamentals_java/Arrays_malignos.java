package fundamentals_java;

public class Arrays_malignos {

	public static void main(String[] args) {
		
		imprimirDobleNumero();
	}
	
	void imprimirNombres() {
		//EJERCICIOS ARRAYS
		String [] nombres = {"Juan", "Almudena","MariaJose","Eduardo","JoseJavier"};

		for(int i =0; i<nombres.length;i++) {
			System.out.println("conozco a alguien llamado: "+nombres[i]);
		}
	}
	
	public static void imprimirDobleNumero() {
		int[] myList = {1,9,3,8,5,7};
		
		for(int i =0; i<myList.length;i++) {
			System.out.println(myList[i]*myList[i]);
		}
	}
	
	public static void recibirValores() {
		//ejercicio 3
		int[] numeros = new int[2];
		
		int n1,n2;
		
	}

}
