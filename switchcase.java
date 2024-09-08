import java.util.Scanner;

class banking{
    public void user(){
        Scanner bankobj=new Scanner(System.in);
        System.out.println("press one for amount withdraw\npress two for foe amount deposite\ncheck balance\npassbook entry\nchange atm pin\ncash transfer");
       
        int userinput=bankobj.nextInt();
        switch (userinput) {
        case 8:
        System.out.println("amount withdrawel");
            break;
        case 4:
        System.out.println("amount deposite");
        break;
        case 5:
        System.out.println("check balance");
        break;
        case 3:
        System.out.println("passbook entry");
        break;
        case 2:
        System.out.println("change atm pin");
        break;
        case 1:
        System.out.println("cash transfer");
        break;
        default:
        System.out.println("please enter valid number");
            break;
    }
    }
}
public class switchcase {
 public static void main (String [] args){
   banking bankobj=new banking();
   bankobj.user();
 }   
}
