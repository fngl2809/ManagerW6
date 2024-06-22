public class PolymorphismeApp {
    public static void main(String[] args) throws Exception {
        // Employee user = new Employee("Anggi_e");
        //user.sayHello( "Fakhri");
        //   set Manager
        // user = new Manager("Anggi");
        //user.sayHello( "Fakhri");
        // set vp
        //user = new VicePresident("Anggi_vp");
        //user.sayHello("Fakhri");

        sayHello(new Employee("user1"), "Fakhri");
        sayHello(new Manager("user2"), "Fakhri");
        sayHello(new VicePresident("user3"), "Fakhri");

    }

    public static void sayHello(Employee employee, String name){
        if (employee instanceof Manager){ // check
            Manager manager = (Manager) employee; // casting
            System.out.println("hello"+ name+ "my manager name is "+manager.name);
        }else if ( employee instanceof VicePresident ) {
            VicePresident vp = (VicePresident) employee;
            System.out.println("hello"+ name+ "my vp name is "+vp.name);
        }else {
            System.out.println("hello"+ name+ "my manager name is "+employee.name);
        }
       
        
    }
}