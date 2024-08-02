package methoddec;
class mobile{
    public void samsung(int year,String name){
        System.out.println("samsung is introduced on "+year+"developed by "+name.toUpperCase());
    }
}

public class withargs {
    public static void main(String []args){
        mobile phone=new mobile();
        phone.samsung(1967,"charles babage");
        
    }
}
