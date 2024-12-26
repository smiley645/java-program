class Parent
{
    public Parent()
    {
        System.out.println("Parent Default Constructor");
    }
    
}
class Child extends Parent{
    public Child()
    { 
      super();
      System.out.println("Child Default Constructor");
    }
}
class GrandChild extends Child
{
    public GrandChild()
    {
     super();
     System.out.println("GrandChild Default Constructor");
    }
}

public class ConstructorExecutionOrder {
     public static void main(String args[])
     {
        GrandChild g1=new GrandChild();
     }
}



