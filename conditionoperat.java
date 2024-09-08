import java.util.Scanner; 
class billE{
    public void billgen(int uni){
        if(uni <= 100){
       System.out.println("government pays :)");
    }else if (uni > 100){
        System.out.println(uni*2 + "pay");
    }else if (uni > 500) {
        System.out.println(uni*4 + "payy");
    }else{
        System.out.println("no power use");
    }
    }
    }


public class conditionoperat {
    public static void main(String []args){
        Scanner userchat=new Scanner(System.in);
        billE billobj=new billE();
        System.out.println("see your electricity bill");
        billobj.billgen(userchat.nextInt());
    }
}
