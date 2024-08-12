package Assignment;
import java.util.HashMap;
import java.util.Map;


public class uniqueSubstring {
	
	

	    public static void main(String[] args) {
	        String inputStr = "abababa";
	        Map<String, Integer> substringMap = new HashMap<>();

	        // Iterate over all possible substrings
	        for (int start = 0; start < inputStr.length(); start++) {
	            for (int end = start + 1; end <= inputStr.length(); end++) {
	                String substring = inputStr.substring(start, end);
	                // Count frequency of each substring
	                substringMap.put(substring,
	substringMap.getOrDefault(substring, 0) + 1);
	            }
	        }

	        // Print the result
	        System.out.println("Unique Substrings with Frequency:");
	        System.out.println(substringMap);
	    }
	}



