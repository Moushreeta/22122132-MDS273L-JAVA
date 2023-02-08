import java.util.Scanner;
public class star {
    public static void main(String[] args){
        int i,j,rows;
        Scanner sc =new Scanner(System.in);
        System.out.println(("say the number of rows"));
        rows=sc.nextInt(i);
        for(i=0;i<=rows-1;i++){
        for(j=0;j<=i;j++){
            System.out.println("*"+" ");
        }
        System.out.println(" ")
    }

    for (i=rows-1;i>=0;i--){
        for(j=0;j<=i-1;j++){
            System.out.pritln("*"+"");
        }
        System.out.println("");

        }
    }
    
}
