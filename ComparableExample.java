import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample{
	String name;
	int rollNo;
	String subject;

	ComparableExample(String name, int rollNo, String subject){
		this.name = name;
		this.rollNo = rollNo;
		this.subject = subject;
	}
	
	String getName(){
		return name;
	}
	
	int getRollNo(){
		return rollNo;
	}
	
	String getSubject(){
		return subject;
	}
		
	int compareTo(ComparableExample studentObject){
		return name.compareTo(studentObject.getName());
	}
		
	public static void main(String[] s){		
		
		ComparableExample studentOne = new ComparableExample("Aniket", 2002, "Physics");
		ComparableExample studentTwo = new ComparableExample("Ram", 2012, "Maths");
		ComparableExample studentThree = new ComparableExample("Mohan", 2004, "Chemistry");
		
		List<ComparableExample> testList = new ArrayList<ComparableExample>();
		testList.add(studentThree);
		testList.add(studentOne);
		testList.add(studentTwo);
		
		Collections.sort(testList);
	
	}
}
