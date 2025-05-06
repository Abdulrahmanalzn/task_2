import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the name:");
        String name = scan.next();
        System.out.println("please enter the score:");
        int score = scan.nextInt();

        System.out.println("student name: %s \nstudent grade: %s".formatted(name,grade(score)));

    }

    public static String grade(int score) {
        if (score >= 90 && score <= 100) {
            return "A+";
        } else if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else if (score >= 0) {
            return "F";
        } else {
            return "Invalid score";
        }
    }

}