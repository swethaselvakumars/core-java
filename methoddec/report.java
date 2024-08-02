package methoddec;

import java.util.Scanner;


class result{
    Scanner mark=new Scanner(System.in);
    public int marks(){
        System.out.println("Enter your mark");
        System.out.print("\nEnglish: ");
        int English=mark.nextInt();
        System.out.print("\nTamil: ");
        int Tamil=mark.nextInt();
        System.out.print( "\nMaths: ");
        int Maths=mark.nextInt();
        System.out.print("\ncomputer:");
        int Computer=mark.nextInt();
        int total=English+Tamil+Maths+Computer;
        
        return  total;
    }
}
class Identity{
    public String information(){
        Scanner info=new Scanner(System.in);
        System.out.println("Data Analyst Role");
        System.out.print("\nenter youre Name:");
        String name=info.next();
        System.out.print("\n qualification:");
        String qualification=info.next();
        System.out.print("\nyearofpassing:");
        int yearofpassing=info.nextInt();
        System.out.println("Thank you for applying");
        String Data="\n" +name+"\n"+ qualification+"\n"+yearofpassing ;
        return "Applied informations:"+Data;

        
    } 
}

class report {
    public static void main(String [] args){
    
    result totalobj=new result();
    totalobj.marks();

    Identity role=new Identity();
    System.out.println(role.information());
}
}
