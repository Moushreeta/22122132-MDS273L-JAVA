import java.util.Scanner;

public class calculator {
    public float findsum(float a, float b){
        return(a+b);
    }public float findminus(float a,float b){
        return (a-b);
    }public float findmulti(float a,float b){
        return(a*b);
    }public float finddiv(float a,float b){
        return (a/b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("mathematical operations that you an perform are 1.'+',2='-',3='*',4='/' ");
        float ch=sc.nextFloat();
        System.out.println("enter your first number");
        float a=sc.nextFloat();
        System.out.println("enter the second number");
        float b=sc.nextFloat();
        calculator obj=new calculator();
        float summ=obj.findsum(a, b);
        System.out.println("sum is "+summ);
        float minus=obj.findminus(a, b);
        System.out.println("minus is"+minus);
        float multi=obj.findmulti(a, b);
        System.out.println("multi is"+multi);
        float div=obj.finddiv(a, b);
        System.out.println("div is"+div);
        }if(ch==1){
            System.out.println(summ( a, b));
        }else if(ch==2){
            System.out.println(minus(a,b));
        }else if(ch==3){
            System.out.println(multi(a,b));
        }else if(ch==4){
            System.out.println(div(a,b));
        }else{
            break;
        }
        



    }
    
}
