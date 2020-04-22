/* Problem Statement :
 * 
 * Implement a method to perform basic string compression
 * using the count of repeated characters. For ex. the string
 * "aabcccccaaa" would become "a2b1c5a3". If the sum compressed string
 * does not become smaller then the original string, then your 
 * method should return the original string. You can assume that
 * the string has only upper case and lower case letters.
 * Time Complexity : O(n)
 * Space Complexity : O(n) */
 
 public class Problem_06{
	 public static String compressString(String input){
		 if(input==null) return null;
		 StringBuilder builder = new StringBuilder();
		 char currentChar = 0;
		 int count = 1;
		 for(int i=0;i<input.length()-1;i++){
			 currentChar = input.charAt(i);
			 if(currentChar!=input.charAt(i+1)){
				 builder.append(currentChar);
				 builder.append(count);
				 count=1;
			 }
			 else count++;
		 }
		 builder.append(currentChar);
		 builder.append(count);
		 if(builder.toString().length()<input.length())
			 return builder.toString();
		 return input;
	 }
 }