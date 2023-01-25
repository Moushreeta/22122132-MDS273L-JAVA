import java.util.Scanner;
import java.util.*;
public class  lab1{
    public static void main(String[] args){
        String Name;
        int age;
        long ph_no;
        float marks;
        char gender;
        boolean rainyday;
        double pincode;
        String state;




        Scanner sc=new Scanner(System.in);  
        System.out.println("enter your age");
        age=sc.nextInt();
        System.out.print("enter your name");
        Name=sc.nextLine();
        System.out.println("enter your phone number");
        ph_no=sc.nextLong();
        System.out.println("enter your marks");
        marks=sc.nextFloat();
        System.out.println("enter your gender");
        gender=sc.next().charAt(0);
        System.out.println("say wheather it was  rainyday or not?");
        rainyday=sc.nextBoolean();
        System.out.println("enter your pincode");
        pincode=sc.nextDouble();
        if(gender=='f'){
            System.out.println("FEMALE");
        }else if(gender=='m'){
            System.out.println("MALE");
        }else{
            System.out.println("NOTA");
        }
        System.out.println("enter your state name");
        state=sc.nextLine();
        switch(state){
            case "Chandigarh" :{
                System.out.println("Region : North");
                break;
            }

            case "Delhi":{
                System.out.println("Region : North");
                break;
            }

            case "Haryana":{
                System.out.println("Region : North");
                break;
            }
            case "Jammu kashmir":{
                System.out.println("Region : North");
                break;
            }
            case "Karnataka":{
                System.out.println("Region : South");
                break;
            }
            case "Kerala":{
                System.out.println("Region : South");
                break;
            }
            case "Andhra Pradesh":{
                System.out.println("Region : South");
                break;
            }
            case "Telangana":{
                System.out.println("Region : South");
                break;
            }
            case "Arunachal Pradesh":{
                System.out.println("Region : East");
                break;
            }
            case "Mizoram":{
                System.out.println("Region : East");
                break;
            }
            case "Odisha":{
                System.out.println("Region : East");
                break;
            }
            case "Jharkhand":{
                System.out.println("Region : East ");
                break;
            }
            case "AndhraPradesh":{
                System.out.println("Region : East ");
                break;
            }
            case "Bihar" :{
                System.out.println("Region : East ");
                break;

            }
            case "Nagaland" :{
                System.out.println("Region : East ");
                break;

            }
            case "Assam" :{
                System.out.println("Region : East ");
                break;
            }
        }

        



    }
}
