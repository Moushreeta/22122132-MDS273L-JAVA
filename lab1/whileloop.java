import java.util.Scanner;

public class whileloop {
    public static void main(String[] args){
       // int a=0;
        //while(a<5){
      //      System.out.println(a);
        //    a+=1;
        //}
        Scanner sc=new Scanner(System.in);
        char ch;
        do{
            System.out.println("executing..");
            System.out.println("to continue..");
            ch=sc.nextLine().charAt(0);

        }while(ch=='y' || ch=='Y');
        System.out.println("program end");
    }
    
}
