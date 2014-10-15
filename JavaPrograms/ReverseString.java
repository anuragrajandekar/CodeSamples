public class ReverseString{
	public static void main(String[] s){
		String inputString = "Anurag";
		System.out.println(reverseString(inputString));
	}
	
	public static String reverseString(String inputString){
		StringBuffer sb = new StringBuffer();
		for (int i= 0; i < inputString.length() - 1; i++){
			sb.append(inputString.charAt(inputString.length() - i));
		}
		
		return sb.toString();
	}
}
