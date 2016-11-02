package niit;
import java.util.*;
public class Sample6 {
	 public static void main(String args[]){    
	     
		  HashSet<String> al=new HashSet<String>();   
		  al.add("navya");
		  al.add("vamshi");    
		  al.add("navya");    
		  al.add("bharat");    
		  
		  
		  for(String obj:al)
				 System.out.println(obj);
		  
		  LinkedHashSet<String> al1=new LinkedHashSet<String>();   
		  al1.add("kumar");    
		  al1.add("navya");    
		  al1.add("ajay");    
		  al1.add("dfh");
		  
		  Iterator<String> itr=al1.iterator();
		  while(itr.hasNext())
		  {  
			   System.out.println(itr.next());
		  }
}
}
