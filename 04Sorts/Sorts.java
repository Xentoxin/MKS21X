

public class Sorts {
	public static String name(){
	    return "09.Chen.HaoYu"; 
	  }

public static void SelectionSort(int[] array){
	int i,j,first,temp;
	for( i = array.length - 1; i >0 ; i--){
		first = 0;
		for(j = 1 ; j <=i ; j++){
			if(array[j] < array[first]){
				first = j;
			}
		}
		temp = array[first];
		array[first] = array[i];
		array[i] = temp;
	}
}

public static String toString(int[] array){
	String str = "[";
	for(int i = array.length-1 ; i > 0 ; i--){
		str += array[i] + ", ";
	}
	str += "]";
	return str;
}
public static void main(String[] args){
	int[] sadbois = {25,32,4,62,6,5,8,3,9,10};
	System.out.println(toString(sadbois));
	SelectionSort(sadbois);
	System.out.println(toString(sadbois));
	
}
}
