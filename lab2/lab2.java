import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class lab2{
    
    static ArrayList<String> list=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    
    static void input(){
        System.out.println("Enter number of names to input:");
        int num=sc.nextInt();
        int i = 0;
        do {
            System.out.println("Enter name:");
            String name=sc.nextLine();
            if(list.contains(name)){
                System.out.println("already in array");
            }
            else{
                list.add(name);
            }
            i++;
        }
        while (i <= num);
        list.remove(0);
    }
        
    static void search(){
        System.out.println("Enter name to search:");
        String namesearch=sc.nextLine();
        if(list.contains(namesearch)){
            System.out.println("Name found at position "+list.indexOf(namesearch));
        }
        else System.out.println("Name not found");
    }

    static void delete(){
        System.out.println("Enter name to delete:");
        String namedel=sc.nextLine();
        list.remove(namedel);
        System.out.println("New list after removing "+namedel+" is "+list);
    }

    static void show(){
        System.out.println(list);
    }

public static void main(String[] args) {
    System.out.println("1 to Enter a name");
    System.out.println("2 to Search a name");
    System.out.println("3 to Remove a name");
    System.out.println("4 to Show all names");
    
    int choice=sc.nextInt();
    sc.nextLine();
    switch(choice){
        case 1:
            input();
        case 2:
            search();
        case 3:
            delete();
        case 4:
            show();
            break;
    }
    sc.close();
}
}