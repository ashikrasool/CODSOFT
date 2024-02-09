import java.util.*;

public class Student_Grade
{
    public static void main (String[] args)
    {
        int total=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of subjects : ");
        int totalsub=sc.nextInt();
        for(int i=1;i<=totalsub;i++)
        {
            System.out.println("Enter the mark of subject "+i);
            int mark=sc.nextInt();
            while(mark<=0 || mark>100)
            {
                System.out.println("Invalid marks. Please Re-enter your marks");
                mark=sc.nextInt();
            }
            total+=mark;
        }
        
        double avg=(double)total/totalsub;
        System.out.print("\nGrade : ");
        if(avg>=90)
        {
            System.out.println("O grade");
        }
        else if(avg>=80)
        {
            System.out.println("A grade");
        }
        else if(avg>=70)
        {
            System.out.println("B grade");
        }
        else if(avg>=60)
        {
            System.out.println("C grade");
        }
        else{
            System.out.println("D grade");
        }
        System.out.println("Total marks : "+total);
        System.out.println("Your Average : "+avg);
    }

}