import java.sql.SQLOutput;
import java.util.Scanner;
public class LessonPointCalculator {
    public static void main(String[] args) {
        /* bu program ile
        + bir dönem boyunca 3 sınavdan oluşan 5 adet dersin ayrı ayrı kendi ortalamalarını
        + 5 dersin genel ortalamasını
        + genel ortalama neticesinde hakedilen belgeyi (takdir teşekkür) görebileceğiz
         */

        Scanner input = new Scanner(System.in);

        String commentMessage1 = "Successfull";
        String commentMessage2 = "Need to hard";

        float lesson1Exam1,lesson1Exam2,lesson1Exam3;
        System.out.println("Please enter the results of the first 3 exams of the physics course in order");
        System.out.print("Physics exam 1 : ");
        lesson1Exam1 = input.nextFloat();
        System.out.print("Physics exam 2 : ");
        lesson1Exam2 = input.nextFloat();
        System.out.print("Physics exam 3 : ");
        lesson1Exam3 = input.nextFloat();

        float physicsTotal = (lesson1Exam1+lesson1Exam2+lesson1Exam3);
        float physicsGpa = physicsTotal/3;
        String commentGpaPhysics = (physicsGpa>=75) ? commentMessage1:commentMessage2;
        System.out.println();
        System.out.println("Physics course gpa : " + physicsGpa + " (" + commentGpaPhysics + ") ");

        System.out.println(" ");

        float lesson2Exam1,lesson2Exam2,lesson2Exam3;
        System.out.println("Please enter the results of the first 3 exams of the math course in order");
        System.out.print("Math exam 1 : ");
        lesson2Exam1 = input.nextFloat();
        System.out.print("Math exam 2 : ");
        lesson2Exam2 = input.nextFloat();
        System.out.print("Math exam 3 : ");
        lesson2Exam3 = input.nextFloat();

        float mathTotal = (lesson2Exam1+lesson2Exam2+lesson2Exam3);
        float mathGpa = mathTotal/3;
        String commentGpaMath = (mathGpa>=75) ? commentMessage1:commentMessage2;
        System.out.println();
        System.out.println("Math course gpa : " + mathGpa + " (" + commentGpaMath + ") ");

        System.out.println(" ");

        float lesson3Exam1,lesson3Exam2,lesson3Exam3;
        System.out.println("Please enter the results of the first 3 exams of the chemistry course in order");
        System.out.print("Chemistry exam 1 : ");
        lesson3Exam1 = input.nextFloat();
        System.out.print("Chemistry exam 2 : ");
        lesson3Exam2 = input.nextFloat();
        System.out.print("Chemistry exam 3 : ");
        lesson3Exam3 = input.nextFloat();

        float chemistryTotal = (lesson3Exam1+lesson3Exam2+lesson3Exam3);
        float chemistryGpa = chemistryTotal/3;
        String commentGpaChemistry = (chemistryGpa>=75) ? commentMessage1:commentMessage2;
        System.out.println();
        System.out.println("Chemistry course gpa : " + chemistryGpa + " (" + commentGpaChemistry + ") ");

        System.out.println(" ");

        float lesson4Exam1,lesson4Exam2,lesson4Exam3;
        System.out.println("Please enter the results of the first 3 exams of the biology course in order");
        System.out.print("Biology exam 1 : ");
        lesson4Exam1 = input.nextFloat();
        System.out.print("Biology exam 2 : ");
        lesson4Exam2 = input.nextFloat();
        System.out.print("Biology exam 3 : ");
        lesson4Exam3 = input.nextFloat();

        float biologyTotal = (lesson4Exam1+lesson4Exam2+lesson4Exam3);
        float biologyGpa = biologyTotal/3;
        String commentGpaBiology = (biologyGpa>=75) ? commentMessage1:commentMessage2;
        System.out.println();
        System.out.println("Biology course gpa : " + biologyGpa + " (" + commentGpaBiology + ") ");

        System.out.println(" ");

        float lesson5Exam1,lesson5Exam2,lesson5Exam3;
        System.out.println("Please enter the results of the first 3 exams of the geometry course in order");
        System.out.print("Geometry exam 1 : ");
        lesson5Exam1 = input.nextFloat();
        System.out.print("Geometry exam 2 : ");
        lesson5Exam2 = input.nextFloat();
        System.out.print("Geometry exam 3 : ");
        lesson5Exam3 = input.nextFloat();

        float geometryTotal = (lesson5Exam1+lesson5Exam2+lesson5Exam3);
        float geometryGpa = geometryTotal/3;
        String commentGpaGeometry = (geometryGpa>=75) ? commentMessage1:commentMessage2;
        System.out.println();
        System.out.println("Geometry course gpa : " + geometryGpa + " (" + commentGpaGeometry + ") ");

        System.out.println(" ");

        String overalMessage1 = "You deserve the golden certificate of achievement, congratulations";
        String overalMessage2 = "You deserve the silver certificate of achievement, you should work harder";
        float overalTotal = geometryGpa + biologyGpa + chemistryGpa + mathGpa + physicsGpa;
        float overalAverage = overalTotal/5;
        String overalAverageComment = (overalTotal>=75) ? overalMessage1:overalMessage2;

        System.out.println("General report card grade point average : " + overalAverage + "\n" +overalAverageComment );



    }
}
