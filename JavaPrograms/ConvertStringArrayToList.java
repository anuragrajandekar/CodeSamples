import java.util.*;

public class ConvertStringArrayToList{
	public static void main(String[] s){
		// Create a string array
		String[] strArray = {"abc", "fgh", "ytu", "pqr"};

		// Print the Array
		System.out.println("===============Printing the Array=====================");
		for (int i=0; i<strArray.length; i++){
			System.out.println(strArray[i]);
		}
		System.out.println("======================================================");

		// Convert Array to List
		List<String> listOfStrArray = Arrays.asList(strArray);

		System.out.println("Printing the list: " + listOfStrArray);

	}
}


