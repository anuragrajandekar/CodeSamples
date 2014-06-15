import java.util.*;
 
class Employee{
     
    private String name;
    private int id;
    private int age;
    private int salary;
 
    public String getName(){
        return name;
    }
 
    public int getId(){
        return id;
    }
 
    public int getAge(){
        return age;
    }
 
    public int getSalary(){
        return salary;
    }
 
    // Override toString method
    public String toString(){
        return "name: " + name + " id: " + id + " age: " + age + " salary: " + salary;
    }
 
    // Define constructor
    Employee(String name, int id, int age, int salary){
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }
 
}
 
public class TestComparable{
    public static void main(String[] s){
         
 
        // Create instances of Employee
        Employee e1 = new Employee("John", 01, 42, 50000);
        Employee e2 = new Employee("Sandy", 02, 54, 24000);
        Employee e3 = new Employee("Carl", 03, 26, 56000);
        Employee e4 = new Employee("Barry", 04, 32, 46000);
 
        // Create the list of Employees
        List<Employee> listOfEmployees = new ArrayList<Employee>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
 
        // Sort the list of employees
        Collections.sort(listOfEmployees);
    }
}
