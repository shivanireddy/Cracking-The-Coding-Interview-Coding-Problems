

/* Problem Statement :
 *
 * Given a string, write a function to check if it is a
 * permutation of a palindrome. A palindrome is a word
 * or phrase that is same forwards and backwards. A
 * permutation is a rearrangement of letters. The palindrome
 * does not need to be limited to just dictionary words.
 * 
 * ex. Input : Tact Coa
 * Output : True (permutations : "taco cat", "atco cta", etc.) 
 * Time Complexity : O(n) => Where n is number of characters in the input string
* Space Complexity : O(n) => Extra space for map, worst case we will push all the characters into map
 
 */
public class Problem_04 {
	public static boolean isPalindromePermutation(String input){
		if(input == null) return false;
		int oddCount = 0;
		input = input.toLowerCase();
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			if(Character.isLetter(ch) || Character.isDigit(ch)){
				if(map.containsKey(ch))
					map.put(ch,map.get(ch)+1);
				else
					map.put(ch,1);
			}
				
		}
		for(Entry<Character,Integer> key: map.entrySet()){
			if(key.getValue()%2!=0) oddCount++;
		}
		return oddCount<=1;
	}
}