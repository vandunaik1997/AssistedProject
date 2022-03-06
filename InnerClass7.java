package innerClass;
//anonymous inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}

public class InnerClass7 {
	private String msg="Welcome to Java"; 
	private String msg1="Inner Classes";
	 
	class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}
	  
	  void display(){  
			 class Inner2{  
				 void msg1(){
					 System.out.println(msg1);
				 }  
		  }  
		  
		  Inner2 l=new Inner2();  
		  l.msg1();  
		 } 
	}

public static void main(String[] args) {
		InnerClass7 obj=new InnerClass7();
 		InnerClass7.Inner in=obj.new Inner();  
 		in.hello();  
 		InnerClass7  ob=new InnerClass7 (); 
 		InnerClass7.Inner in1=obj.new Inner();
 		in1.display();
 		AnonymousInnerClass i = new AnonymousInnerClass() {
  
 			public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();

}

}
