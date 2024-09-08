package array;

public class onedimentionalarray {
    public static void main(String []args){
        int []a={2,56,55,8,78,4};

        for(int i=0;i<=a.length-1 ; i++){
            System.out.println(a[i]);
        }
        System.out.println("");
        // for each is used to print array in loop
        for(int i:a){
            System.out.println(i);
        }


        float []flo={55,85,63,4};
        for(float i:flo){
            System.out.println(i);
        }


        String []val={"adhi","sathya","sara","dev"};
        for(String eleme:val){

        System.out.println(eleme);
        }
    }
}
