
public class Book {
private static String author, title , ISBN;
public Book(){
}
public Book(String a, String t, String I){
	author = a;
	title = t;
	ISBN = I;
}
public String getAuthor(){
	return Book.author;
}
public String getTitle(){
	return Book.title;
}
public String getISBN(){
	return Book.ISBN;
}
public void setAuthor(String a){
	author = a;
}
public void setTitle(String t){
	title = t;
}
public void setISBN(String I){
	ISBN = I;
}
public String toString(){
	String str = "";
	str += this.getAuthor() + ", "+ this.getTitle() + ", " + this.getISBN() ;
	return str;
}
public static void main(String[] args){
	Book test = new Book("W. Bruce Cameron" , "A Dog's Purpose", "1234567890");
	System.out.println(test.toString());
}
}
