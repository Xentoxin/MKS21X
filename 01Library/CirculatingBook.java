
public class CirculatingBook extends LibraryBook{
private String currentHolder, dueDate;
public CirculatingBook(String a, String t , String I, String callN){
	super(a,t,I, callN);
	currentHolder = "";
	dueDate = "";
}
public String getCH(){
	return currentHolder;
}
public String getDD(){
	return dueDate;
}
public void setCH(String x){
	currentHolder = x;
}
public void setDD(String x){
	dueDate = x;
}
void checkout(String patron, String due){
	this.setCH(patron);
	this.setDD(due);
}
void returned(){
	currentHolder = "";
	dueDate = "";
}
public String circulationStatus(){
	String str = "";
	if(dueDate == "" || currentHolder == ""){
		str = "Book is available on shelves";
	}
	if(dueDate != "" || currentHolder != ""){
		str = "This book is currently borrowed by: " + currentHolder +" " + "Due Date: " + dueDate;
	}
	return str;
}
public String toString(){
	String str = "";
	str += super.toString() + ", " + this.getCH() + ", " + this.getDD();
	return str;
}
}
