//Program to implement Method Overloading


public class  calculator{

    public double add(double a,double b){
        return a+b;
    }
    public double add(double a,double b, double c){
        return a+b+c;
    }
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        calculator obj = new calculator();
        System.out.println(obj.add(2.5,4.5,4.0));
        System.out.println(obj.add(3,4));

    }
}