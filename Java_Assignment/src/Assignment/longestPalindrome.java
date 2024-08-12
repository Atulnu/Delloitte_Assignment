package Assignment;

public class longestPalindrome {
	
	 public static String longestPalindrome(String s) 
	 { 
		 if (s == null || s.length() == 0)
		 { return ""; 
		 } 
		 String longest = ""; 
		 for (int i = 0; i < s.length(); i++) { 
			 // Check for odd-length palindromes (single character center) 
			 String oddPalindrome = expandAroundCenter(s, i, i);
			 if (oddPalindrome.length() > longest.length()) 
			 { 
				 longest = oddPalindrome; 
				 } 
			 // Check for even-length palindromes (two character center) 
			 String evenPalindrome = expandAroundCenter(s, i, i + 1); 
			 if (evenPalindrome.length() > longest.length()) 
			 { 
				 longest = evenPalindrome; 
				 } 
			 } 
		 return longest; 
			 } 
	 private static String expandAroundCenter(String s, int left, int right)
	 { 
		 while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) 
		 { 
			 left--;
			 right++; 
			 }
		 // The actual palindrome is between left + 1 and right - 1 
		 return s.substring(left + 1, right); 
		 } 
	 public static void main(String[] args) 
	 {
		 String s = "babad"; System.out.println(longestPalindrome(s)); 
		 }
	 }


