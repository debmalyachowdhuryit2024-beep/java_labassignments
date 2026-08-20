import java.util.Scanner;
public class TestMain{

	public static void main(String[] args)
	{
		int c1,c2,c3,c4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of c1,c2,c3 and c4 : ");
		c1 = sc.nextInt();
		c2 = sc.nextInt();
		c3 = sc.nextInt();
		c4 = sc.nextInt();
		Calculator cal = new Calculator();
	        cal.add(c1,c2);
		cal.add(c1,c2,c3);
		cal.add(c1,c2,c3,c4);


		System.out.println("The result of the addition "+cal.add(c1,c2));
 		System.out.println("The result of the addition "+cal.add(c1,c2,c3));
		System.out.println("The result of the addition "+cal.add(c1,c2,c3,c4));
		System.out.println("The result of multiplication:");
		System.out.println(cal.mul(c1,c2));
		System.out.println(cal.mul(c1,c2,c3));
		System.out.println(cal.mul(c1,c2,c3,c4));		
				
		
	}
}
