import java.lang.module.FindException;

public class home {
    //public static void main(String[] args){
        public  int findpro(int num1,int num2,int num3,int num4){
            return(num1*num2*num3*num4);
      //  }
    }public static void main(String[] args){
        home obj=new home();
        int pro=obj.findpro(10,20,30,40);
        System.out.println("product is"+pro);
    }
    
}
