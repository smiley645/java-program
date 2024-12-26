import java.lang.management.GarbageCollectorMXBean;

class parent{
    public parent(){
        
        System.out.println("godavarthi");
    }
}
class child extends parent{
    public  child(){
        super();
        System.out.println("sai");
    }
}
class GrandChild extends parent{
    public GrandChild(){
        super();
        System.out.println("Renuka");
    }
}

public class superkey {
    public static void main(String[] args) {
        
    

    GrandChild g  = new GrandChild();


    }
}
