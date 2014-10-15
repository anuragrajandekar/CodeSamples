import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class FrequencyTest{
	public static void main(String[] s){

		// Create a list
		List testList = new ArrayList();
		testList.add("A");
		testList.add("B");
		testList.add("B");
		testList.add("C");
		testList.add("C");
		testList.add("C");

		
		System.out.println("Frequency is: " + Collections.frequency(testList, "C"));
	}
}
