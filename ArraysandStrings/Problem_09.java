/**
 * Problem Statement :
 * 
 * Assume you have a method isSubstring which checks
 * if one word is a substring of another. Given two
 * strings s1 and s2, write code to check if s2 is 
 * a rotation of s1 using only one call to isSubstring.
 * 
 * ex. "waterbottle" is a rotation of "erbottlewat"
 * 
 * Time Complexity : O(1)
 * Space Complexity : O(1)
 *
 **/
 
 public class Problem_09{
	 public static boolean isRotation(String s1, String s2){
		 if(s1==null || s2==null) return false;
		 if(s1.length()==s2.length() && s1.length()>0){
			 String s1s1 = s1.concat(s1);
			 return isSubString(s1s1,s2);
		 }
		 return false;
	 }
	 
	 //Substring function
	 public static boolean isSubString(String big, String small){
		 if(big.toLowerCase().contains(small)) return true;
		 return false;
	 }
 }