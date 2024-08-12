package Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class weightage {
	
	



	public static void main(String[] args) {

	// Initialize names and weightage arrays

	String[] names = {"Mahesh", "Dinesh", "Kamalesh", "Sathish", "Suresh",
	"Ramesh"};

	int[] weightage = {-2, 2, 1, -1, 3, 0};


	// Create a list to store the names with positive weightage

	List<String> positiveNames = new ArrayList<>();

	// Create a list to store the names with negative weightage

	List<String> negativeNames = new ArrayList<>();


	// Map to store names and their corresponding weightages

	Map<String, Integer> nameWeightMap = new HashMap<>();

	for (int i = 0; i < names.length; i++) {

	nameWeightMap.put(names[i], weightage[i]);

	}


	// Separate names based on weightage

	for (Map.Entry<String, Integer> entry : nameWeightMap.entrySet()) {

	String name = entry.getKey();

	int weight = entry.getValue();

	if (weight > 0) {

	positiveNames.add(name);

	} else if (weight < 0) {

	negativeNames.add(name);

	}

	// If weight is zero, we ignore it

	}


	// Sort the positive names by their weightage in descending order

	Collections.sort(positiveNames, new Comparator<String>() {

	@Override

	public int compare(String name1, String name2) {

	return Integer.compare(nameWeightMap.get(name2),
	nameWeightMap.get(name1)); // Descending order

	}

	});


	// Create the final output list

	List<String> outputNameList = new ArrayList<>(positiveNames);

	outputNameList.addAll(negativeNames);


	// Print the output list

	System.out.println(outputNameList);

	}

	}
	
	


