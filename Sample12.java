package niit;
import java.io.*;
public class Sample12 {
public static void main(String args[])throws Exception{  
		
		String names[] = new String[]{"a.txt", "b.txt", "c.txt"};
		  StringBuffer strContent = new StringBuffer(" ");

		  for (String file1 : names) {
		      File file = new File(file1); 
		      int ch;
		      FileInputStream stream = null;  
		          stream = new FileInputStream(file);   
		FileOutputStream out = new FileOutputStream("output1.txt",true);
		          while( (ch = stream.read()) != -1) {
		              strContent.append((char) ch); 
				out.write((char)ch);
		          } 

		}
		
 
		  }  
}
