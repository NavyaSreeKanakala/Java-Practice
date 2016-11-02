package niit;
import java.util.HashSet;
import java.util.*;
public class Sample7 {
	public static void main(String args[]){    
	     
		  HashMap<Integer,String> al=new HashMap<Integer,String>();   
		  al.put(1,"navya");
		  al.put(2,"vamshi");    
		  al.put(3,"kumar");    
		  al.put(4,"bharat");  
		  
		  for(Map.Entry m:al.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
}
}
