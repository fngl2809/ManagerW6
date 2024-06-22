public class VicePresident extends Employee {
    VicePresident(String name){
        super(name);
    }
    
    void sayHello(String name) throws Exception {
        System.out.println("hello"+ name+ "my employee name is "+this.name);
    }  
}
