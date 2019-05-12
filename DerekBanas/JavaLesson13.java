import java.util.Arrays;

public class JavaLesson13 {
	
	public static void main(String[] args) {
		
		String randomString = "I`m just a random string";
		
		String gotTheQuote = "He sayd \" Im here\"";
		
		System.out.println("Some string: " + gotTheQuote);
		
		int numTwo = 2;
		
		String upperCaseStr = "BIG";
		
		String lowerCaseStr = "big";
		
		if(upperCaseStr.equalsIgnoreCase(lowerCaseStr)) {
			System.out.println("They are equal!");
		}
		
		String letter = "abcde";
		String moreLetter = "fgdijk";
		
		System.out.println("2nd char: " + letter.charAt(1));
		
		System.out.println(letter.compareTo(moreLetter));
		
		System.out.println(letter.contains("abc"));
		
		System.out.println(letter.endsWith("de"));
		
		System.out.println(letter.length());
		
		String[] letterArray = letter.split("");
		System.out.println(Arrays.toString(letterArray));
		
		char[] charArray = letter.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		System.out.println(letter.substring(1,4));
		
		String randString = "   sad sad asd  as d  asd ";
		
		StringBuilder randSB = new StringBuilder("A random value");
		
		System.out.println(randSB.append(" again"));
		
		System.out.println(randSB);
		
		
		
	}
	
}