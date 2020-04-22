/* Problem Statement :
 * 
 * There are three types of edits that can be performed
 * on strings, insert a character, remove a character or
 * replace a character. Given two strings, write a function
 * to check of they are one edit (or zero edits) away.
 * 
 * ex. pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false 
* 
* Space Complexity : O(1)
 */


public class Problem_05{
	public static boolean isOneEditAway(String input1, String input2){
		if(input1==null || input2==null) return false;
		if(input1.length()==input2.length())
			return isReplaceEdit(input1,input2);
		else if(input1.length()==input2.length()+1)
			return isRemovalEdit(input1,input2);
		else if(input1.length()+1==input.length())
			return isRemovalEdit(input1,input2);
		return false;
	}
	
	public static boolean isReplaceEdit(String input1,String input2){
		int i=0;
		int editCount = 0;
		while(i<input1.length()){
			if(input1.charAt(i)!=input2.charAt(i)) editCount++;
			i++;
		}
		return editCount<=1;
	}
	public static boolean isRemovalEdit(String input1,String input2){
		int removalCount=0;
		int i=0,j=0; //since strs are of different length
		while(i<input2.length()){
			if(input1.charAt(i)!=input2.charAt(j)){
				removalCount++;
				i++;
			}
			i++;
			j++;
		}
		return removalCount<=1;
	}
}