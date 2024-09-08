package array;
import java.util.Scanner;
class arrayfun{
public void arraynum(int nums[]){
    for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
    }

}
}

public class binarysorting {
    public static void main(String [] ard){
        Scanner scanobj=new Scanner(System.in);
        
        arrayfun obj=new arrayfun();
        System.out.println("enter the arr size");
        int arrsize=scanobj.nextInt();
        int []w=new int[arrsize];
        for(int i=0;i<w.length;i++){
            w[i]=scanobj.nextInt();
        }

       obj.arraynum(w);
    }
}
