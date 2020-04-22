/*
Time Complexity : O(n) => Where n is number of characters in the input
Space Complexity : O(n) => For char array, worst case we may end up adding all characters to array
*/

public class Solution {
	public static String replaceSpacesWithSpecialCharacter(String input, int trueLength) {
		if(input == null || input == "") return null;
		input = input.substring(0,trueLength);
		String replacement = "%20";
		StringBuilder builder = new StringBuilder();
		char[] charArray = input.toCharArray();
		for(char c: charArray){
			if(c!=" ") builder.append(c);
			else builder.append(replacement);
		}
		return builder.toString();
	}
}