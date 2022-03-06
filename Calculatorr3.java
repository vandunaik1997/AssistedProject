import java.util.Scanner;

public class Calculatorr3 {

	public static void main(String[] args) {
		char op;
		double number1, number2, result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose an operator:+,-,*,/ ");
		op =sc.next().charAt(0);
		System.out.println("Enter the first number");
		number1=sc.nextDouble();
		System.out.println("Enter the second number");
		number2=sc.nextDouble();
		switch(op){
			case '+':
				result=number1+number2;
				System.out.println("Result="+result);
				break;
			case '-':
				result=number1-number2;
				System.out.println("Result="+result);
				break;
			case '*':
				result=number1*number2;
				System.out.println("Result="+result);
				break;
			case '/':
				result=number1/number2;
				System.out.println("Result="+result);
				break;
				}
	}

}
