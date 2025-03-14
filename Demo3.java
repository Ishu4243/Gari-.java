public class Demo3 {
    static String name;
    static float  salary;
    
    static void set(String n,float p){
     name = n;
     salary= p;
    }
    static void get(){
     System.out.println(name );
     System.out.println(salary +2);
 }
 public static void main(String [] args){
    Demo3.set("ishu",10000);
    Demo3.get();
 }
 }