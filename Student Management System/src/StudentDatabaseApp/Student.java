package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String FirstName;
    private String LastName;
    private int GradeYear;
    private String StudentID;
    private String courses="";
    private int TuitionBalance;
    private static int CostOfCourse = 600;
    private static int ID = 1000;
    //Constructor:prompt user to enter name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.FirstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.LastName = in.nextLine();

        System.out.println("1 - for freshmen\n2 - for sophomore\n3 - for juniour\n4 - for  seniour\n4 - for seniour\nEnter student grade: ");
        this.GradeYear = in.nextInt();

        setStudentID();
    
    }
    //Generate an ID
    private void  setStudentID(){
        //grade level +ID
        ID++;
        this.StudentID = GradeYear + "" + ID;
    }
    //Enroll in courses
    public void Enroll(){
        //Get inside a loop, user hits Q to quit
        do {System.out.println("Enter course to enroll (Q to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();

        if(!course.equals("Q")){
            courses = courses + "\n" + course;
            TuitionBalance = TuitionBalance + CostOfCourse;
        }
        else{
            break;}
        }while(1!=0);
        
    }
    //View balance 
    public void ViewBalance(){
        System.out.println("Your balance is : " + TuitionBalance);
    }
    //Pay tuition
    public void PayTuition(){
        ViewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        TuitionBalance = TuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        ViewBalance();
    }
    //Show status
    @Override
    public String toString(){
        return "Name: "+ FirstName + " " + LastName + 
        "\nGrade Level: "+GradeYear+
        "\nStudent ID: "+StudentID+
        "\nCourses Enrolled: "+ courses +
        "\nBalance: "+ TuitionBalance;
    }
}