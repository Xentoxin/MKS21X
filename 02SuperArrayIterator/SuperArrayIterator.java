import java.util.Iterator ;
public class SuperArrayIterator implements Iterator<String>	{
	SuperArray data;
	int i;
	public SuperArrayIterator(SuperArray d){
		data = d;
		i =0;
	}
	public boolean hasNext(){
		return (i < data.size());
	}
	public String next(){
	String element = "";
	element = data.get(i);
	i++;
	return element;
	}
	public void remove(){
		try {
			throw new UnsupportedOperationException("This operationis unsuported");
		}
		catch(UnsupportedOperationException e){
			System.out.println("This operationis unsuported");
		}
	}


}
