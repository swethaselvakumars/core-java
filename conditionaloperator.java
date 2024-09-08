import java.util.Scanner;
class EBbill{
    public String bill(int units){
        if(units<=100){
            return "dont pay";
        }else if (units > 100) {
            return units*2 + "pay";
        }
        return "";
       
    }
}

public class conditionaloperator {
    public static void main(String []args){
        Scanner billuser=new Scanner(System.in);
        
            EBbill ebobj=new EBbill();
            System.out.println("enter the consumed units");
            System.out.println (ebobj.bill(billuser.nextInt()));
           

        
    }
}
