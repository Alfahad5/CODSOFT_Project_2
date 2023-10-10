import java.util.Scanner;

public class Student_Grade_Calculator {
    static String calculateGrade(double averagePercentage){
        //Returns a String i.e. Grade of The Student.
        if (averagePercentage >= 90.0) {
            return "S";
        } else if (averagePercentage >= 80.0) {
            return "A";
        } else if (averagePercentage >= 70.0) {
            return "B";
        } else if (averagePercentage >= 60.0) {
            return "C";
        } else if (averagePercentage >= 50.0) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Grade Calculator \n");
        System.out.println("Enter number of Subjects");
        int n=sc.nextInt();

       double total=0.0;
       //Taking marks as input from user.
        for(int i=1;i<=n;i++){
            System.out.println("Enter Marks obtained in Subject "+i+" : ");
            double marks=sc.nextDouble();
            if (marks < 0 || marks >= 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                return;
            }
            total+=marks;
        }
        double max=n*100.0;
        double avg=total/n;

        String grade=calculateGrade(avg);
        //Display the Result
        System.out.println("Results : ");
        System.out.println("Total marks : "+total+" Out of : "+max);
        System.out.println("Average Percentage : "+avg+"%");
        System.out.println("Grade : "+grade);
    }
}