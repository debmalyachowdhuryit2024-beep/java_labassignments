import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        year = sc.nextInt();

        if(year % 4 == 0 && year % 100 !200= 0)
        {
            if (year % 400 == 0)
            {
                System.out.println(year+"The year is leapyear");
            }
        }
        else
            System.out.println(year+ "is not a leap year");

    }
    
}
