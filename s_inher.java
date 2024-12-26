class A{
    public void method1(){
        System.out.println("A's method");

    }
}

class B extends A{
    @Override
    public void method1()
    {
        System.out.println("B's method");
    }
}
class C extends A{
    @Override 
    public void method1(){
        System.out.println("C's method ");
    }
}

public  class s_inher{
    public static void main(String args[]){
        A a = new A();
        a.method1();
        B b = new B();
        
        b.method1();
        a = new C();
        a.method1();



    }
}