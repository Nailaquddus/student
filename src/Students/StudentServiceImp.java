package Students;
import java.sql.SQLOutput;
import java.util.Scanner;
public class StudentServiceImp implements StudentService{
 private static final int MAX_STUDENTS=20;
 public static Student[]studentList=new Student[MAX_STUDENTS];
 public static int numStudent=0;
 @Override
 public void addStudent(Scanner scan) {
  if (numStudent >= MAX_STUDENTS) {
   System.out.println("sorry, the class is full");
  }
  System.out.println("enter student ID");
  int studentId = scan.nextInt();
  scan.nextLine();

  System.out.println("enter Name");
  String studentName = scan.nextLine();

  System.out.println("Enter email");
  String studentEmail = scan.nextLine();

  System.out.println("Enter Students grades");
  double studentGrade = scan.nextDouble();
  Student student = new Student(studentId, studentName, studentEmail, studentGrade);
  studentList[numStudent++] = student;
  System.out.println("student adds successfully");
 }
  @Override
  public void removeStudent(Scanner scan){
   if (numStudent==0){
    System.out.println("no Student to remove");
    return;
   }
   System.out.println("enter the index of student to remove(0 to"+(numStudent-1)+ " )" );
   int index=scan.nextInt();
   if (index>=0 && index<numStudent){
    for(int i=index; i<numStudent-1; i++){
     studentList[i]=studentList[i+1];
    }
    studentList[numStudent-1] = null;
    numStudent--;
    System.out.println("student removed successfully");}
   else
   {
    System.out.println("invalid index, no Student removed");
   }
  }

 @Override
 public void readStudents() {
  if (numStudent == 0) {
   System.out.println("no student found");
   return;

  }
  for (int i = 0; i < numStudent; i++) {
   System.out.println((i + 1) + " . ");
   System.out.println(studentList[i]);
  }
 }

 @Override
   public void updateStudent(Scanner scan){
    if(numStudent==0){
     System.out.println("no student found");
     return;
   }
    System.out.println("enter the index of students to update(0 to "+ (numStudent-1)+"):");
    int index=scan.nextInt();
    if(index>=0 &&  index<numStudent){
     System.out.println("enter student new id");
     int newStudentId=scan.nextInt();
     scan.nextLine();
     System.out.println("Enter the new name for Student ");
     String newStudentName=scan.nextLine();
     System.out.println("enter the email for student");
     String newEmail=scan.nextLine();
     System.out.println("enter new grades");
     double newGrades=scan.nextDouble();
     Student updatedStudent=new Student(newStudentId,newStudentName,newEmail,newGrades);
     studentList[index]=updatedStudent;
     System.out.println("student");

    }
  }
 }

