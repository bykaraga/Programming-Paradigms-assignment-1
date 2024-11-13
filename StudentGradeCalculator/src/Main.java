import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter first score: ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter second score: ");
        double score2 = scanner.nextDouble();

        double average = calculateAverage(score1, score2);
        char grade = assignGrade(average);

        displayResults(name, average, grade);
        scanner.close();
    }

    public static double calculateAverage(double score1, double score2) {
        return (score1 + score2) / 2;
    }

    public static char assignGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }

    public static void displayResults(String name, double average, char grade) {
        System.out.println("Student: " + name);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}