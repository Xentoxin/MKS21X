
public class Tester {
public static void main(String[] args){
	City A = new City("New York", 0.0 ,0.0);
	City B = new City("Boston" , 3.0 , 4.0);
	City C = new City("Chicago" , 5.0 ,12.0);
	System.out.println(A.distance(B));
	System.out.println(A.distance(C));
}
}
