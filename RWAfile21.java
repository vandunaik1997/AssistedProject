package ReadWriteAppendFile;
import java.io.*;
public class RWAfile21 {

	public static void main(String[] args) {
		 try
		 {
		 FileReader r = new FileReader("C:\\Users\\Windows\\Desktop\\FileHandling\\file.txt");
		 try
		 {
		 int i;
		while((i=r.read())!=-1)
		 {
		 System.out.print((char)i);
		 }
		 }
		 finally
		 {
		 r.close();
		 System.out.print("\n");
		 System.out.print("File Closed successfully.");
		 }
		 }
		 catch(IOException e)
		 {
		 System.out.println("Exception handled..");
		 }
		// TODO Auto-generated method stub
		 
		 try
		 {
		FileWriter f = new FileWriter("C:\\Users\\Windows\\Desktop\\FileHandling\\file1.txt");
		 try
		 {
		 f.write("Sumit is the employee office details..!!");
		 }
		 finally
		 {
		 f.close();
		 }
		 System.out.println("Successfully Written..!! ");
		 }
		 catch(IOException i)
		 {
		 System.out.println(i);
		 
		 //Appand
		 
		 String path = "C:\\Users\\Windows\\Desktop\\FileHandling\\file.txt";
		 String text = " Currently doing training at Simplilearn";
		 try
		 {
		 FileWriter f = new FileWriter(path,true);
		 f.write(text);
		 f.close();
		 System.out.println("Append done Successfully..");
		 }
		 catch(IOException e){
		 System.out.println(e);
		 }

		 }
	}

}
