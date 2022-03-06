package project;
import java.util.regex.Pattern;

public class EmailValidation {
	public static boolean isValid(String email)
	 {
	 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
	 "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	 Pattern pat = Pattern.compile(emailRegex);
	 if (email == null)
	 return false;
	 return pat.matcher(email).matches();
	 }
     public static void main(String[] args) {
		String email1 = "vandanavnaik1920@gmail.com";
		String email2 = "@vanduvnaik.com";
		String email3 = "kavyanaik@gmail.com";
		 String[] emails= {email1,email2,email3};
		 for (int i = 0; i < emails.length; i++) {
		 String email=emails[i];
		if (isValid(email))
		 System.out.print(email+" is valid email");
		 else
		 System.out.print(email+" is invalid email");
		 System.out.println();
		 }
	}

}
