public class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    void sayHello(String name) throws Exception {
        System.out.println("hello"+ name+ "my employee name is "+this.name);
    }  
}
