public class Manager extends Employee {
    String company;

    Manager(String name){
        super(name);
        
    }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }
    void sayHello(String name) throws Exception {
        System.out.println("hello"+ name+ "my manager name is "+this.name);
    }  
}
