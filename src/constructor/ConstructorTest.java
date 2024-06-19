package constructor;

public class ConstructorTest {

    public static void main(String[] args) {
        System.out.println("Before creation of Employee object");
        Employee e=new Employee();
        System.out.println("Post Employee object creation "+e.id);

        System.out.println("Before creation of Employee object");
        Employee e1=new Employee(1,"durga");
        System.out.println("Post Employee object creation "+e.id);
        //why we  need default constructor ?
        // To initiallize the Instance Variable
        // Why we need parameterized Constructor?
        //To assign the instance Variables in Parameterized Constructor
        //When  we create a  Multiple Constructor?
        //When ever we have a different scenarios in a same class and use different ways of the fields


    }
}
