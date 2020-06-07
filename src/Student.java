import java.util.Scanner;

public class Student {
    
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int coustOfCourse = 600;
    private static int id = 1000;

    // constructor: prompt student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter your last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter your Student Class Level: ");
        this.gradeYear = in.nextInt();

        //call method to set studentID
        setStudentID();

        System.out.println("ID: "+ this.studentID + " " + this.firstName + " " + this.lastName + ": " + this.gradeYear);


    }

    // set Student ID
    private void setStudentID(){
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // set Enroll courses method
    public void enroll(){
        // break loop when user heats Q
        do{
            System.out.print("Choose a course to enroll: ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")){
            courses = courses + "\n" + course;
            tuitionBalance = tuitionBalance + coustOfCourse;
            } else { break; };
        } while(1 != 0);

        System.out.println("ENROLLED IN: "+ courses);
        //System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    // view Balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("thank you for you payment of: $" + payment);
        viewBalance();
    }


}