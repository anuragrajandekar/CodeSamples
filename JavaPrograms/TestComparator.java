public class TestComparator{
	public static void main(String[] s){

		// Create instance of employee
		Employee e1 = new Employee("Anil", 01, 42, 50000);
		Employee e2 = new Employee("John", 02, 36, 42000);
		Employee e3 = new Employee("Marvel", 03, 56, 38000);
		Employee e4 = new Employee("Josh", 04, 48, 58000);

		// Create list of employees
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(e4);
		listOfEmployees.add(e3);
		listOfEmployees.add(e2);
		listOfEmployees.add(e1);

		System.out.println("UnSorted List" + listOfEmployees.toString());

		compareByName(listOfEmployees);
		compareById(listOfEmployees);
		compareByAge(listOfEmployees);
		compareBySalary(listOfEmployees);

	}

	public static void compareByName(List<Employee> listOfEmployees){
		Collections.sort(listOfEmployees, new NameComparator());
		System.out.println("Sorted List By Name" + listOfEmployees.toString());
	}


	public static void compareById(List<Employee> listOfEmployees){
		Collections.sort(listOfEmployees, new IdComparator());
		System.out.println("Sorted List By Id" + listOfEmployees.toString());
	}

	public static void compareByAge(List<Employee> listOfEmployees){
		Collections.sort(listOfEmployees, new AgeComparator());
		System.out.println("Sorted List By Age" + listOfEmployees.toString());
	}


	public static void compareBySalary(List<Employee> listOfEmployees){
		Collections.sort(listOfEmployees, new SalaryComparator());
		System.out.println("Sorted List By Salary" + listOfEmployees.toString());	
	}	
}

class Employee{
	private String name;
	private int id;
	private int age;
	private int salary;

	Employee(String name, int id, int age, int salary){
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
	}

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

	// Overriding the toString() method
	public String toString(){
		return "name: " + name + " id:" + id + " age: " + age + " salary: " + salary + "\n";
	}

}

class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2){
		return (e1.getName()).compareTo(e2.getName());

	}
}


class IdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2){
		return e1.getId() - e2.getId();
	}
}


// Sort in descending order
class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2){
		return e2.getAge() - e1.getAge();
	}
}


class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2){
		return e1.getSalary() - e2.getSalary();
	}
}
