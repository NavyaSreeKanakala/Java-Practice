package niit;
import java.io.*;
public class Sample {

	public static void main(String args[])throws Exception{  
	FileOutputStream gout=new FileOutputStream("C.java");
	 String s="Sachin Tendulkar is my favourite player";  
     byte b[]=s.getBytes(); 
     gout.write(b);  
     gout.close(); 
	FileInputStream fin=new FileInputStream("C.java");  
	FileOutputStream fout=new FileOutputStream("M.java");  
	int i=0;  
	while((i=fin.read())!=-1){  
	fout.write((byte)i);  
	}  
	fin.close();  
	}  
}
