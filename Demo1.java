 public class Demo1{
    private int a;
    private int b;

    public void divide(){System.out.println(a/b);}
    public void sub(){System.out.println(a-b);}
   public void sum(){System.out.println(a+b);}
public static void main (String [] args ){
Demo1 obj = new  Demo1();

obj.a =5;
obj.b =6;

obj.divide();
obj.sub();
obj.sum();

}

}
