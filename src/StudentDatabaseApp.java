import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) throws Exception {
        // Ask how many students we want add
        System.out.print("\nEnter the number of students we want enroll: ");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        Student students[] = new Student[numStudents];

        // Create n number of new students

        for(int n =0; n < numStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for(int n =0; n < numStudents; n++){
            System.out.println(students[n].toString());
        }
    }
}





