package student;
import college.*;

class detaill{
    detaill(){
        System.out.println("default constrctor for deails class");
    }
    public  static String details(){
        return "hi";
        
    }
}

public class detail {
    public static void main(String [] args){
      Computer com=new Computer();
      com.ComMethod();
      Mechanical mech=new Mechanical();
      mech.mechmethod();



    about objabout=new about();
    System.out.println(objabout.info());
    
    // detaill.details();
    
    
System.out.println(detaill.details());  
    }
}
