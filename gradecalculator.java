import java.util.Scanner;

public class gradecalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] subjectMarks = new double[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextDouble();
        }

        double totalMarks = calculateTotalMarks(subjectMarks);
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
        String grade = assignGrade(averagePercentage);

        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static double calculateTotalMarks(double[] subjectMarks) {
        double totalMarks = 0;
        for (double marks : subjectMarks) {
            totalMarks += marks;
        }
        return totalMarks;
    }

    public static double calculateAveragePercentage(double totalMarks, int numSubjects) {
        return (totalMarks / (numSubjects * 100)) * 100;
    }

    public static String assignGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else if (averagePercentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}

    
