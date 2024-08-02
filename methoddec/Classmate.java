package methoddec;
import java.util.Scanner;

class Classmate{
public static void main(String [] args){

Scanner Information=new Scanner(System.in);

int Roll=Information.nextInt();
String Name=Information.next();
char Lastname=Information.next().charAt(0);
short Age=Information.nextShort();
long Phoneno=Information.nextLong();


System.out.println("ROLL : "+Roll+"\nNAME : "+ Name +"\nLASTNAME : "+ Lastname+"\nAGE :"+ Age+"\nPHONENO :"+Phoneno); 
}
}				