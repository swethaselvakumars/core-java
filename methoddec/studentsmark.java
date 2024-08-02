package methoddec;
import java.util.Scanner;
class info{
    public void studentsinfo(){
        Scanner mark=new Scanner(System.in);
        System.out.println("enter your mark");
        int english=mark.nextInt();
        int os=mark.nextInt();
        
    }
}

public class studentsmark {
    public static void main(String [] args){
     info obj=new info();
     obj.studentsinfo();
   
        }
}
