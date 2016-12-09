public class Barcode implements Comparable<Barcode>{
	private String zip;
	private int check;
	private String barcode;
public static void main (String[] args){
	Barcode test = new Barcode("12345");
	test.toString();
	
}
public Barcode(String z){
	try{
		int temp = Integer.parseInt(z);
		if(z.length() != 5){
			throw new IllegalArgumentException("Illegal Argument");
		}
	}
	catch(Exception e){
		throw new IllegalArgumentException("Illegal Argument");
	}
	zip = z;
	check = checkSum()%10;
}
public Barcode clone(Barcode a){
	Barcode clone = new Barcode(a.zip);
	return clone;
}
private int checkSum(){
	int sum = 0;
	for(int i = 0; i <zip.length(); i++){
		 sum = sum + Integer.parseInt(zip.charAt(i)+"");
    }
	return sum;
}
public String toString(){
	return(zip + check + " " + "|" + createBarcode() + "|");
}
private String createBarcode(){
	String result = "";
    for( int i = 0; i < zip.length(); i++){
	  switch ( Integer.parseInt(zip.charAt(i)+"") ){
	  case 1: result = result + ":::||";
	      break;
	  case 2: result = result + "::|:|";
	       break;
	  case 3: result = result + "::||:";
	       break;
	  case 4: result = result + ":|::|";
	       break;
	  case 5: result = result + ":|:|:";
	       break;
	  case 6: result = result + ":||::";
	       break;
	  case 7: result = result + "|:::|";
	       break;
	  case 8: result = result + "|::|:";
	       break;
	  case 9: result = result + "|:|::";
	       break;
	  case 0: result = result + "||:::";
	       break;
	  }
    }
    barcode = result;
    return barcode;
}
public int compareTo(){

	
}
}