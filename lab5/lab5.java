import java.util.Arrays;
import java.util.Scanner;
public class lab5{
    
    int reg_no;
    String name;
    String email;
    int phone;
    int studentClass;
    String dept;
    static Scanner sc=new Scanner(System.in);
    
    
    public lab5(int reg_no,String name,String email,int phone,int studentClass,String dept){
        this.reg_no=reg_no;
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.studentClass=studentClass;
        this.dept=dept;
    }
    static lab5 addstudent(){
        System.out.println("Enter Student Registration number:");
            int reg_no=sc.nextInt();
            System.out.println("Enter Student name:");
            String name=sc.nextLine();
            sc.next();
            System.out.println("Enter Student email:");
            String email=sc.nextLine();
            sc.next();
            System.out.println("Enter Student phone:");
            int phone=sc.nextInt();
            System.out.println("Enter Student class:");
            int studentClass=sc.nextInt();
            System.out.println("Enter Student department:");
            String dept=sc.nextLine();
            sc.next();
            lab5 student1=new lab5(reg_no, name, email, phone, studentClass, dept);
            return student1;
    }
    static String searchstudent(){
        System.out.println("Enter 1 for name or 2 for registration number to search:");
            int searchChoice=sc.nextInt();
            switch(searchChoice){
                case 1:
                System.out.println("Enter name to search");
                String namesearch=sc.nextLine();
                for(int j=0;j<studentArray.length;j++){
                    if(studentArray[j].name==namesearch){
                    return studentArray[j].details();
                }
                else 
                return "Name not found";
            }
                case 2:
                System.out.println("Enter registration number to search");
                int regnoSearch=sc.nextInt();
                for(int j=0;j<studentArray.length;j++){
                    if(studentArray[j].reg_no==regnoSearch){
                    return studentArray[j].details();
                }
                else 
                return "Student not found";
                break;
                }
            } 
    }

    void details(){
        System.out.println("Registration no="+reg_no);
        System.out.println("Name="+name);
        System.out.println("Email="+email);
        System.out.println("Phone="+phone);
        System.out.println("Class="+studentClass);
        System.out.println("Department="+dept);
    }
    public static void main(String[] args) {
    lab5 studentArray[]=new lab5[100];
    
    System.out.println("1 to Add a student");
    System.out.println("2 to Search for a student");
    System.out.println("3 to Display all students");
    
    int choice=sc.nextInt();
    sc.nextLine();
    switch(choice){
        case 1:
            lab5 newStudent=addstudent();
            studentArray[0]=newStudent;
        case 2:
            searchstudent();
        case 3:
            for (int i = 0; i < studentArray.length; i++) {
                studentArray[i].details();
            }
            break;
    }
    sc.close();
}
}