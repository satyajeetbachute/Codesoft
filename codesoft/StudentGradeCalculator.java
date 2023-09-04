import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args)
      {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++)
	 {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
         }

        double averagePercentage = (double) totalMarks / numSubjects;
        String grade = calculateGrade(averagePercentage);
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }

    public static String calculateGrade(double averagePercentage)
	 {
          if (averagePercentage >= 90)
	   {
              return "A";
           }
         else if (averagePercentage >= 80)
	   {
              return "B";
           } 
         else if (averagePercentage >= 70) 
	   {
              return "C";
           } 
	else if (averagePercentage >= 60)
	   {
              return "D";
           } 
	else 
           {
             return "F";
           }
    }
}
