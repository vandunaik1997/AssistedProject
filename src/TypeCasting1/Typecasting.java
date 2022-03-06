package TypeCasting1;

import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("please enter your String");
		String input = src.next();
		int x = Integer.valueOf(input);
		double y = Double.valueOf(input);
		float z = Float.valueOf(input);
		long a = Long.valueOf(input);
		System.out.println("Integer value=" + x);
		System.out.println("Double value=" + y);
		System.out.println("Float value=" + z);
		System.out.println("Long value=" + a);


	}

}
