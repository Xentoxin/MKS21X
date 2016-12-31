///https://www.youtube.com/watch?v=rZeBBXbBSMY&index=4&list=PLSM8fkP9ppPockBq1_GEG5umsz6qZb7-o
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
	final static boolean printOrnot= false;
private static ArrayList<City> Initial = new ArrayList<City>(Arrays.asList(
new City("A" , 0, 0),
new City("B" , 1, 1),
new City("C" , -1 ,1),
new City("D" , 5, 12)
));
public static void main(String[] args){
Driver driver = new Driver();
Instant start = Instant.now();
BruteForce t = new BruteForce();
Route current = new Route(Initial);

driver.Duration(start);
}
public  void Duration(Instant start){
	
}
}