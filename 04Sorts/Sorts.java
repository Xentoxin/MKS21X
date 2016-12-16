
public class Sorts {
	public static String name() {
		return "09.Chen.HaoYu";
	}

	//SelectionSort Greatest to least
	public static void SelectionSort1(int[] array) {
		int i, j, first, temp;
		for (i = array.length - 1; i > 0; i--) {
			first = 0;
			for (j = 1; j <= i; j++) {
				if (array[j] < array[first]) {
					first = j;
				}
			}
			temp = array[first];
			array[first] = array[i];
			array[i] = temp;
		}
	}
	
	//SelectionSort Least to greatest
	public static void SelectionSort2(int[] array){
		int i,j,k,temp;
		for(i = 0 ; i<array.length -1 ; i++){
			k = i;
			for(j = i +1; j < array.length ; j++){
				if(array[j] < array[k]){
					k = j;
				}
			}
			temp = array[k];
			array[k] = array[i];
			array[i] = temp;
		}
	}

	//InsertionSort Least to greatest
	public static void InsertionSort(int[] array) {
		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

	
	public static void BubbleSort(int[] array){
		int j, temp;
		boolean thing = true;
		while(thing){
			thing = false;
			for (j =0; j <array.length- 1; j++){
				if( array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					thing = true;
				}
			}
		}
	}
	public static String toString(int[] array) {
		String str = "[";
		for (int i = 0; i < array.length - 1; i++) {
			str += array[i] + ", ";
		}
		str += "]";
		return str;
	}

	public static void main(String[] args) {
		int[] sadbois = { 25, 32, 4, 62, 6, 5, 8, 3, 9, 10 };
		System.out.println(toString(sadbois));
		final long start = System.nanoTime();
		BubbleSort(sadbois);
		final float runtime = System.nanoTime() - start;
		System.out.println(toString(sadbois));
		System.out.println("Runtime : " + runtime/1000000 + " Milliseconds");
		
	}
}
