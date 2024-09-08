package array;
class halfnum{
    int []a={333,644,63,635,56,33,52,637};
    public void half(){    
        for(int i=0;i<a.length /2; i++)
        System.out.print(a[i]+",");
        System.out.println("");
    }

    public void secondhalf(){
         for(int i=a.length/2;i<a.length;i++){
            System.out.print(a[i]+",");
         }
    }

    public void merge(){
        int a[]={2,4,6,8};
        int b[]={1,3,5,7};

        int c[]=new int[a.length+b.length];
        // int c[] =new int 
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[4+i]=b[i];
        }
        for (int i:c){
        System.out.println(i);
    }}

}

public class arrayoperation {
    public static void main(String [] ars){
        // halfnum num=new halfnum();
        // System.out.println("first half arr");
        // num.half();
        // System.out.println("second half arr");
        // num.secondhalf();
        // System.out.println("");

        // num.merge();

        // int []a={333,644,63,635,56,33,52,637};
        int []b=new int[3];
        b[6]=8;
        for(int i:b){
System.out.println(i);
        }
        // int []c=new int[3];
        // System.out.println("first index" + a[0]);
        // System.out.println("last index" + a[a.length-1]);
        // System.out.println("mid val" + a[a.length /2] );
        // System.out.println("seconlarge" + a[0+1]);
        // System.out.println("seconlarge" + a[a.length-2]);
       

    }
    
}

//  length starts from 1
// index starts from 0
