package constructor;

public class Employee {
    public int id;
    public Employee(){
        System.out.println("Executing from constructor");
    }
    public Employee(int id,String name){
        this.id=id;
        System.out.println("Executing from the parameterized constructor");
    }
}
