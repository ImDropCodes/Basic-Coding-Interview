import java.util.*;
public class SwapTwoNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =a;
		int d =b;
		
		
		//Using + and - 
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);
		
		//Using Ex-OR operator
		
		c = c ^ d;
		d = c ^ d;
		c = c ^ d;
		System.out.println(c);
		System.out.println(d);
	}

}