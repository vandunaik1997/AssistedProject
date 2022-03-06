package project;
import java.io.*;

public class FileHandling {
      public static void main(String[] args) {
		 //Writing in the file
		 
		 try
		 {
		  FileWriter f = new FileWriter("C:\\Users\\Windows\\Desktop\\FileHandling\\file.txt");
		  //file name we have to give here that file will automatically created in that folder path
		 try
		 {
		 f.write("Vandana is Working as software Engineer..!!");
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
		 } 

	}

}
