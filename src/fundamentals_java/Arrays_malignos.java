package fundamentals_java;

public class Arrays_malignos {

	public static void main(String[] args) {
		
		//imprimirDobleNumero();
		
		int [] iarray = toArray(10,20);
		System.out.println("Array : "+iarray[0]+" "+iarray[1]);
		System.out.println(getFirstElement(iarray));
		int[] array = {10,20,30};
		setFirstElement(array,5);
        System.out.println("Array modificado: " + java.util.Arrays.toString(array));
		System.out.println("ultimo elemento del array es: "+getLastElement(array));
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
	
	public static  int[] toArray(int n1, int n2) {
		// Escribe una función toArray que reciba dos valores y devuelva un array con estos dos valores
	
		int [] array = new int[2];
		array[0]=n1;
		array[1]=n2;
		
		return array;
		
		
	}
	
	public static int getFirstElement(int[] array) {
		if(array ==null || array.length==0) {
			
			System.out.println("El array esta vacio no se devovlerá nada");
		}
		return array[0];
		
	}
	
	public static int[] setFirstElement(int [] array, int numero) {
		
		array[0]=numero;
		
		return array;
	}
	
	public static int getLastElement(int [] array) {
		
		if(array == null || array.length ==0) {
			System.out.println("el array esta vacio");
		}
		
		return array[array.length-1];
		
	}

}
