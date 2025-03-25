import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt(); 
        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();
        double percentage = (physics + chemistry + maths) / 3.0;
        String grade = "";
        if (percentage >= 80) { grade = "A";}
	    else if (percentage >= 70) { grade = "B"; }
        else if (percentage >= 60) { grade = "C"; }
        else if (percentage >= 50) { grade = "D"; }
        else if (percentage >= 40) { grade = "E"; }
        else  { grade = "R"; }
        System.out.println("\nPercentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        input.close();
    }
}
