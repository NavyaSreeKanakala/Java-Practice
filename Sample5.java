package niit;
import java.util.*;
public class Sample5 {
	public static void main(String args[]){    
	     
		  List<String> al=new ArrayList<String>();   
		  al.add("sdf");    
		  al.add("xcvdf");    
		  al.add("ghn");    
		  al.add("dfh");    
		    
		  List<String> al2=new LinkedList<String>();   
		  al2.add("fhfghj");    
		  al2.add("bvdf");    
		  al2.add("zsbc");    
		  al2.add("nij");    
		    
		  System.out.println("arraylist: "+al);
		  
		  
		  for(String obj:al)
		 System.out.println(obj);
		  
		  Iterator<String> itr=al2.iterator();
		  while(itr.hasNext()){
			    
				 System.out.println(itr.next());  
				  }  
		 }    
}
