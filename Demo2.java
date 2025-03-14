public class Demo2 {
    static String name;
    static int salary;
    static void set(String n,int p){
        name = n;
        salary = p;
    }
static void get(){ 
    System.out.println(name);
    System.out.println(salary);

}
public static void main(String [] args){
    Demo2.set("ishu", 10000);
    Demo2.get();

}

}
