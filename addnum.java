package array;
import java.util.Scanner;
import java.util.Random;

public class addnum {
    public static void main(String[] args) {
        Scanner scobj=new Scanner(System.in);
        Random ranobj=new Random();
       String holder="";
       short correctval=0;
       short wrongval=0;
     
            do{
        int a=ranobj.nextInt(50);
        int b=ranobj.nextInt(50);
        System.out.println("a " +a+" b " +b);
        int user=scobj.nextInt();
        int ans=a+b;
        if(user == ans){
            System.out.println("correct");
            correctval++;

        }else{
            System.out.println("wrong");
           wrongval++;
        }

        System.out.println("do you want to continue y to continue or any keys to terminate the loop");
         holder=scobj.next();
    
       
    
    }while(holder.equals("y"));

    int total=correctval+wrongval;
    System.out.println("the loop ruuning times"+total);
    System.out.println("correct"+correctval);
    System.out.println("wrong"+ wrongval);
}
   
}
