import java.util.Scanner;
public class java {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[1024];
        int arrlen=0;
        int count=0;
        int loopcontrol=0;
        do{
            System.out.println(("menu options\n1.enter name\n2.list all\n3.remove name\n4.search"));
            int userchoice=Integer.parseInt(sc.nextLine());
            switch(userchoice){

                case1:
                    System.out.println("enter the new name");
                    String tempname=sc.nextLine();
                    boolean addname=false;
                    if(arrlen==0){
                        addname=true;
                    }else{
                        for(int i =0;i<arrlen;i++){
                            if(arr[i].equalsIgnoreCase(tempname)){
                                addname=false;

                            }else{
                                addname=true;
                            }

                        }
                    }
                    if(addname==true){
                        arr[arrlen]=tempname;
                        arrlen=arrlen+1;
                        System.out.println("name added");

                    }else{
                        System.out.println("name exists");
                    }

                    break;
                case2:
                    for(int i=0;i<arrlen;i++){
                        System.out.println(arr[i]+",");
                    }
                    break;
                case3:
                    break;
                case4:
                    break;
                default:
                    System.out.println("wrong choice");                

            }
            System.out.println("press 1 to continue");
            loopcontrol=Integer.parseInt(sc.nextLine());


        }while(loopcontrol==1);
        System.out.println("program exits");


    }
    
}
