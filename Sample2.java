package niit;
import java.util.StringTokenizer;
public class Sample2 {
	public static void main(String args[]){  
		   StringTokenizer st = new StringTokenizer("this is niit"," ");  
		     while (st.hasMoreTokens()) {  
		         System.out.println(st.nextToken());  
		     }  
		     StringTokenizer st1 = new StringTokenizer("this is, big data, course by niit");
		     System.out.println("the token is: " +st1.nextToken(","));
		   }  
}
