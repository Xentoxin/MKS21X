public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
private String callNumber;
public LibraryBook(){
	
}
public LibraryBook(String a, String t, String ISBN, String c){
	super(a,t,ISBN);
	setCallNumber(c);
}
public String getCallNumber(){
	return callNumber;
}
public void setCallNumber(String c){
	callNumber = c;
}
abstract void checkout(String patron, String due);
abstract void returned();
abstract String circulationStatus();
public int compareTo(LibraryBook O){
	if(getCallNumber().equals(O.getCallNumber())){
		return 0;
	}
	if(getCallNumber().compareTo(O.getCallNumber()) < 0) {
		return -1;
	}
	else{
		return 1;
	}
}
public String toString(){
	String str = "";
	str += super.toString() + ", " + this.getCallNumber() + ", " + this.circulationStatus() ;
	return str;
}
}
