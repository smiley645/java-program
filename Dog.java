// Create a class with some methods and invoke them in the main method.
// method -- behavior
// static non static and void , int  
public class Dog {
    public static  void sound(){
        System.out.println("Dog make sounds");
    }
    public  int age(int n){
        return n+5;
    }
    public static void main(String[] args){
        Dog obj = new Dog();
        sound();
        System.out.println(obj.age(10));
    }

    
}
