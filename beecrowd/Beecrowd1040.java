import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1040 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();

        float average = ((n1*2 + n2*3 + n3*4 + n4*1) / 10);

        System.out.println("Average: " + String.format("%.1f", average));

        if (average >= 7.0) {
            System.out.println("Student passed.");
        }
        else if (average < 5.0) {
            System.out.println("Student failed.");
        }
        else {
            System.out.println("Student in exam.");
            float examGrade = sc.nextFloat();
            System.out.println("Exam grade: " + String.format("%.1f", examGrade));
            float finalAverage = (average + examGrade) / 2;
            if (finalAverage >= 5.0){
                System.out.println("Student passed.");
            }
            else{
                System.out.println("Student failed.");
            }
            System.out.println("Final average: " + String.format("%.1f", finalAverage));
        }

        sc.close();
    }

}
