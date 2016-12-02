
public class ReferenceBook extends LibraryBook{
	private String collection;
public ReferenceBook(String a, String t, String ISBN, String call, String coll){
	super(a,t,ISBN,call);
	collection = coll;
}
public void checkout(String patron, String due){
	System.out.println("cannot check out a reference book");
}
public void returned(){
	System.out.println("reference book could not have been checked out -- return impossible");
}
public String circulationStatus(){
	String str =  "non-circulating reference book";
	return str;
	
}
public String toString(){
	String str = "";
	str += super.toString() + ", " + this.collection;
	return str;
}
public static void main(String[] args){
	ReferenceBook test= new ReferenceBook("a", "b", "c" , "d", "e");
	System.out.println(test.circulationStatus());
}
}
