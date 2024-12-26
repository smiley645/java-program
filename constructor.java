public class constructor {
    int l,b,h;
    public constructor(int l,int b,int h ){
      l=b=h=7;
    }
    public constructor(int n){
        l=b=h=n;
    }
    public void prit(){
        System.out.println(l);
    }
    public static void main(String[] args){
        constructor c = new constructor(2);
        c.prit();
    }
}
