import java.util.Scanner;
public class Calculator {
   public static void main(String[] args)
   {
    int x,y,choice;
    Scanner so = new Scanner(System.in);
    System.out.println("enter the value of x and y: ");
    x = so.nextInt();
    y = so.nextInt();

    System.out.println("enter your choice: ");
    choice = so.nextInt();
    while(true)
    {
        switch(choice)
        {
            case 1: int sum = x+y;
                    System.out.println("the sum is"+sum);
            case 2:  int sub = x-y;
                    System.out.println("the difference is"+sub);
            case 3: int mul = x*y;
                    System.out.println("the result of the multiplication is "+mul);
        }
    }
   }
    
}
