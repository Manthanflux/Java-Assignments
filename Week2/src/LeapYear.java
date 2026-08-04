import java.util.Scanner;
public class LeapYear {
    
    public void IsLeapYear()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        if (year%400==0 || year%4==0 && year%100 != 0){
            System.out.println(year + " " + "This is leap year");
        } else
        System.out.println(year + "  " +  "Entered year is not leap year");
        sc.close();

    }
    
}
