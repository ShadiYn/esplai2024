package fundamentals_java;

public class arrays_ejercicio8 {

	public static void main(String[] args) {
		ejercicio_10();
		
	}
	
	void ejrcicio_8() {
		int[][] arr = { { 1, 2, 3 },//col 0
						{ 4, 5, 6 }, // col 1
						{ 7, 8, 9 } };// col2

			int myData = arr[2][1]; // Modificar únicamente esta línea para acceder al 8 del array bidimensional
			System.out.println(myData);

	}
	
	static void ejercicio_9() {
		int i=5;
		
		while(i>=0) {
			System.out.println(i);
			i--;
			
		}
		
		
		
	}
	
	static void ejercicio_10() {
		for(int i=5; i>=0;i--) {
			System.out.println(i);
		}
	}

}
