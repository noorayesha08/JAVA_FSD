package Phase1Module1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Noor");
		Matcher matcher = pattern.matcher("Is a Cricketer");
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match found");
		} 
		else {
			System.out.println("Match not found");
		}
	}
}
