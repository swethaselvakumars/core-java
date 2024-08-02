package methoddec;
class India{
    public String Tamilnadu(){
       return "sweetha";
    } 
    public void kerala(){
        System.out.println("palakkad");
    }
}


class method{
public static void main(String [] args){
    India sweobj=new India();
   String storedvalue=sweobj.Tamilnadu();
   System.out.println(storedvalue);
   
    System.out.println("universe");
}
}