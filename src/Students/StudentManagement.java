package Students;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StudentServiceImp svc=new StudentServiceImp();
        int choice;
        do {
            System.out.println("---------welcome to student management-------" + "");
            System.out.println("1--Add student");
            System.out.println("2---remove");
            System.out.println("3-- update Student");
            System.out.println("4-- display student");
            System.out.println("5--Exit");
            System.out.println("enter you choice");

            choice=scanner.nextInt();
            switch (choice){
                   case 1:svc.addStudent(scanner);
                    break;
                    case 2:svc.removeStudent(scanner);
                        break;
                        case 3:svc.updateStudent(scanner);
                            break;
                case 4: svc.readStudents();
                break;
                case 5:
                System.out.println("exiting the program, Good bye!");
                break;
                default:
                    System.out.println("invalid choice try again");
            }
        } while(choice!=5);
        scanner.close();
    }
}
