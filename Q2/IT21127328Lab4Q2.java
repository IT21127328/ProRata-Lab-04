import java.util.Scanner;

public class IT21127328Lab4Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and validate exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            scanner.close();
            return;
        }

        // Input and validate lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            scanner.close();
            return;
        }

        // Input percentages
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercent = scanner.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercent = scanner.nextDouble();

        // Validate percentage total
        if (examPercent + labPercent != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            scanner.close();
            return;
        }

        // Calculate final exam mark
        double finalMark = (examMarks * examPercent / 100.0) + (labMarks * labPercent / 100.0);

        System.out.println("\nFinal Exam Mark is : " + finalMark);

        scanner.close();
    }
}