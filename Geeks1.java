class Employee{
    private int  x;
    private String  name;
   
    public void set_id(int x){
       this.x = x;
    }
    public void set_name(String name){
       this.name = name;
    }
    public int get_id(){
       return x;
    }
    public String  get_name(){
   return name;
    }
   }
   public class Geeks1{
      public static void main(String [] args){
          Employee f = new Employee();
          f.set_id(100);
          f.set_name("ishu");
   
          System.out.println(f.get_id());
          System.out.println(f.get_name());
      }
   }
    